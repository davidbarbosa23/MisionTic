package view;

import DAO.EmployeesDAO;
import DAO.StocksDAO;
import controller.ViewController;
import interfaces.IEmployeesDAO;
import interfaces.IStocksDAO;
import model.Employee;
import model.Product;
import model.Stock;
import model.Store;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormEmployee extends JFrame implements ActionListener {
    private JTextField nameTxt;
    private JTextField ageTxt;
    private JComboBox<Store> storeCbx;
    private JButton btnSaveEmployee;

    public FormEmployee() {
        initForm();
    }

    public void initForm() {
        setTitle("Agregar Empleado");

        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        JLabel nameLbl = new JLabel("Nombre");
        panel.add(nameLbl);
        JPanel namePanel = new JPanel();
        namePanel.setLayout(new FlowLayout());
        this.nameTxt = new JTextField();
        this.nameTxt.setPreferredSize(new Dimension(150, 20));
        this.nameTxt.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        namePanel.add(this.nameTxt);
        panel.add(namePanel);

        JLabel ageLbl = new JLabel("Edad");
        panel.add(ageLbl);
        JPanel agePanel = new JPanel();
        agePanel.setLayout(new FlowLayout());
        this.ageTxt = new JTextField();
        this.ageTxt.setPreferredSize(new Dimension(150, 20));
        this.ageTxt.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        agePanel.add(this.ageTxt);
        panel.add(agePanel);

        JLabel storeLbl = new JLabel("Seleccione bodega");
        panel.add(storeLbl);
        this.storeCbx = new JComboBox();
        this.storeCbx.setModel(new DefaultComboBoxModel<>(ViewController.getStores().toArray(new Store[ViewController.getStores().size()])));
        this.storeCbx.setSelectedIndex(0);
        panel.add(this.storeCbx);

        add(panel, BorderLayout.CENTER);

        this.btnSaveEmployee = new JButton("Guardar");
        this.btnSaveEmployee.addActionListener(this);
        add(this.btnSaveEmployee, BorderLayout.SOUTH);

        // Create and set up the window.
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pack();
        setSize(360, 180);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == this.btnSaveEmployee) {
            String name = this.nameTxt.getText();
            int age = Integer.parseInt(this.ageTxt.getText());
            int idStore = ((Store) this.storeCbx.getSelectedItem()).getIdStore();
            Employee employee = new Employee(idStore, name, age);

            IEmployeesDAO employeesDAO = new EmployeesDAO();
            employeesDAO.createEmployee(employee);

            this.setVisible(false);
        }
    }
}
