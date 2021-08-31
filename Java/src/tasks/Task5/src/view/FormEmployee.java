package view;

import controller.ListsController;
import model.Employee;
import model.Store;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FormEmployee extends Form {
    private Employee employee;

    private JTextField nameTxt;
    private JTextField ageTxt;
    private JComboBox<Store> storeCbx;

    public FormEmployee(ContentTables contentTables, String cmd) {
        super(contentTables, cmd);
    }

    @Override
    public void setForm() {
        JLabel nameLbl = new JLabel("Nombre");
        this.nameTxt = new JTextField();

        JLabel ageLbl = new JLabel("Edad");
        this.ageTxt = new JTextField();

        JLabel storeLbl = new JLabel("Seleccione bodega");
        this.storeCbx = new JComboBox<>();
        this.storeCbx.setModel(new DefaultComboBoxModel<>(ListsController.getStores().toArray(new Store[ListsController.getStores().size()])));

        // Set title and default values
        if (getCmd().equals("update")) {
            setTitle("Actualizar Empleado");
            employee = getContentTables().getSelectedEmployee();
            this.nameTxt.setText(employee.getName());
            this.ageTxt.setText(String.valueOf(employee.getAge()));
            this.storeCbx.getModel().setSelectedItem(ListsController.getStoreById(employee.getIdStore()));
        } else {
            setTitle("Agregar Empleado");
            this.nameTxt.setText("");
            this.ageTxt.setText("");
            this.storeCbx.setSelectedItem(null);
        }

        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        panel.add(nameLbl);
        panel.add(setTxtPanel(this.nameTxt));
        panel.add(ageLbl);
        panel.add(setTxtPanel(this.ageTxt));
        panel.add(storeLbl);
        panel.add(this.storeCbx);

        add(panel, BorderLayout.CENTER);

        initForm(180);
    }

    public JTextField getNameTxt() {
        return nameTxt;
    }

    public JTextField getAgeTxt() {
        return ageTxt;
    }

    public JComboBox<Store> getStoreCbx() {
        return storeCbx;
    }

    public Employee getEmployee() {
        return employee;
    }
}
