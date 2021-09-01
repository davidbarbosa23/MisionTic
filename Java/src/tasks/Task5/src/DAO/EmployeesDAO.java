package DAO;

import model.Employee;
import model.Store;
import util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EmployeesDAO implements IEmployeesDAO {

    private Connection conn = null;

    public ArrayList<Employee> getEmployeesList() {
        ArrayList<Employee> employees = new ArrayList<>();

        if (conn == null)
            conn = DBConnection.getConnection();

        String query = "SELECT B.`idBodega`, B.`nombre`, E.`idempleado`, E.`nombre`, E.`edad` "
                + "FROM `" + Employee.TableName + "` E "
                + "LEFT JOIN `" + Store.TableName + "` B ON B.`idBodega` = E.`idBodega` "
                + "ORDER BY E.`idempleado`;";

        try {
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(query);

            while (result.next()) {
                Employee employee = new Employee(
                        result.getInt(1),
                        result.getString(2),
                        result.getInt(3),
                        result.getString(4),
                        result.getInt(5)
                );
                employees.add(employee);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return employees;
    }

    public Employee getEmployeeById(int id) {
        Employee employee = null;

        if (conn == null)
            conn = DBConnection.getConnection();

        String query = "SELECT B.`idBodega`, B.`nombre`, E.`idempleado`, E.`nombre`, E.`edad` "
                + "FROM `" + Employee.TableName + "` E  "
                + "LEFT JOIN `" + Store.TableName + "` B "
                + "ON B.`idBodega` = E.`idBodega` "
                + "WHERE `idempleado` = " + id + ";";

        try {
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(query);

            while (result.next()) {
                employee = new Employee(
                        result.getInt(1),
                        result.getString(2),
                        result.getInt(3),
                        result.getString(4),
                        result.getInt(5)
                );
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return employee;
    }

    public void createEmployee(Employee employee) {
        if (conn == null)
            conn = DBConnection.getConnection();

        String query = "INSERT INTO `" + Employee.TableName + "` (`idBodega`, `nombre`, `edad`)  "
                + "VALUES (?, ?, ?);";

        try {
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, employee.getIdStore());
            statement.setString(2, employee.getName());
            statement.setInt(3, employee.getAge());
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void updateEmployee(Employee employee) {
        if (conn == null)
            conn = DBConnection.getConnection();

        String query = "UPDATE `" + Employee.TableName + "` "
                + "SET `idBodega` = ?, `nombre` = ?, `edad` = ? "
                + "WHERE `idempleado` = ?;";

        try {
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, employee.getIdStore());
            statement.setString(2, employee.getName());
            statement.setInt(3, employee.getAge());
            statement.setInt(4, employee.getIdEmployee());
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void deleteEmployeeById(int id) {
        if (conn == null)
            conn = DBConnection.getConnection();

        String query = "DELETE FROM `" + Employee.TableName + "` WHERE `idempleado` = ?;";

        try {
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void deleteEmployeeByStoreId(int id) {
        if (conn == null)
            conn = DBConnection.getConnection();

        String query = "DELETE FROM `" + Employee.TableName + "` WHERE `idBodega` = ?;";

        try {
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
