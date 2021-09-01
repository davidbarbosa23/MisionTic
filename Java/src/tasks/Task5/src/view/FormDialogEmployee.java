package view;

import controller.FormsListsController;
import model.Employee;
import model.Store;

import java.awt.Frame;
import java.awt.GridLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FormDialogEmployee extends FormDialog {
    private Employee employee;

    private JTextField nameTxt;
    private JTextField ageTxt;
    private JComboBox<Store> storeCbx;

    public FormDialogEmployee(ContentTables contentTables, String cmd, Frame mainFrame) {
        super(contentTables, cmd, mainFrame);
    }

    @Override
    public void setForm() {
        setLayout(new GridLayout(3, 2));

        JLabel nameLbl = new JLabel("Nombre");
        this.nameTxt = new JTextField();

        JLabel ageLbl = new JLabel("Edad");
        this.ageTxt = new JTextField();

        JLabel storeLbl = new JLabel("Seleccione bodega");
        this.storeCbx = new JComboBox<>();
        this.storeCbx.setModel(new DefaultComboBoxModel<>(FormsListsController.getStores().toArray(new Store[FormsListsController.getStores().size()])));

        // Set title and default values
        if (getCmd().equals("update")) {
            setTitle("Actualizar Empleado");
            employee = getContentTables().getSelectedEmployee();
            this.nameTxt.setText(employee.getName());
            this.ageTxt.setText(String.valueOf(employee.getAge()));
            this.storeCbx.getModel().setSelectedItem(FormsListsController.getStoreById(employee.getIdStore()));
        } else {
            setTitle("Agregar Empleado");
            this.nameTxt.setText("");
            this.ageTxt.setText("");
            this.storeCbx.setSelectedItem(null);
        }

        add(nameLbl);
        add(setTxtPanel(this.nameTxt));
        add(ageLbl);
        add(setTxtPanel(this.ageTxt));
        add(storeLbl);
        add(this.storeCbx);

        initForm();
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
