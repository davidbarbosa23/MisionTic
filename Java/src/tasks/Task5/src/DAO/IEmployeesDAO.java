package DAO;

import model.Employee;

import java.util.ArrayList;

public interface IEmployeesDAO {
    ArrayList<Employee> getEmployeesList();

    Employee getEmployeeById(int id);

    void createEmployee(Employee employee);

    void updateEmployee(Employee employee);

    void deleteEmployeeById(int id);

    void deleteEmployeeByStoreId(int id);
}
