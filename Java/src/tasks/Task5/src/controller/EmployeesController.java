package controller;

import interfaces.IEmployeesDAO;
import model.Employee;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class EmployeesController {
    private IEmployeesDAO employeesDAO;
    private static final String[] columns = new String[]{"ID", "Nombre", "Edad", "Bodega"};

    public EmployeesController(IEmployeesDAO employeesDAO) {
        this.employeesDAO = employeesDAO;
    }

    public DefaultTableModel get() {
        DefaultTableModel model = new DefaultTableModel(null, columns);

        ArrayList<Employee> employees = employeesDAO.getEmployeesList();
        for (Employee employee : employees)
            model.addRow(employee.toArray());

        return model;
    }
}
