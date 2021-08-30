package interfaces;

import model.Employee;

import java.util.ArrayList;

public interface IEmployeesDAO {
    public ArrayList<Employee> getEmployeesList();
    public Employee getEmployeeById(int id);
    public void createEmployee(Employee employee);
    public void updateEmployee(Employee employee);
    public void deleteEmployeeById(int id);
}
