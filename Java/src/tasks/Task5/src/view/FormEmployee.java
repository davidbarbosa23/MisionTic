package view;

import controller.ListsController;
import interfaces.IFormView;
import model.Employee;
import model.Store;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FormEmployee extends JFrame implements IFormView {
    private ContentTables contentTables;
    private String cmd;
    private Employee employee;

    private JTextField nameTxt;
    private JTextField ageTxt;
    private JComboBox<Store> storeCbx;

    public FormEmployee(ContentTables contentTables, String cmd) {
        this.cmd = cmd;
        this.contentTables = contentTables;
        initForm();
    }

    public void initForm() {
        formsActionsController.setForm(this);
        formsActionsController.setContentTables(contentTables);

        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        JLabel nameLbl = new JLabel("Nombre");
        this.nameTxt = new JTextField();
        this.nameTxt.setPreferredSize(new Dimension(150, 20));
        this.nameTxt.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        JLabel ageLbl = new JLabel("Edad");
        this.ageTxt = new JTextField();
        this.ageTxt.setPreferredSize(new Dimension(150, 20));
        this.ageTxt.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        JLabel storeLbl = new JLabel("Seleccione bodega");
        this.storeCbx = new JComboBox<>();
        this.storeCbx.setModel(new DefaultComboBoxModel<>(ListsController.getStores().toArray(new Store[ListsController.getStores().size()])));
        this.storeCbx.setSelectedIndex(0);

        // Set title and default values
        if (cmd.equals("update")) {
            setTitle("Actualizar Empleado");
            employee = contentTables.getSelectedEmployee();
            this.nameTxt.setText(employee.getName());
            this.ageTxt.setText(String.valueOf(employee.getAge()));
            this.storeCbx.getModel().setSelectedItem(ListsController.getStoreById(employee.getIdStore()));
        } else {
            setTitle("Agregar Empleado");
            this.nameTxt.setText("");
            this.ageTxt.setText("");
            this.storeCbx.setSelectedItem(null);
        }

        JPanel namePanel = new JPanel();
        namePanel.setLayout(new FlowLayout());
        namePanel.add(this.nameTxt);

        JPanel agePanel = new JPanel();
        agePanel.setLayout(new FlowLayout());
        agePanel.add(this.ageTxt);

        panel.add(nameLbl);
        panel.add(namePanel);
        panel.add(ageLbl);
        panel.add(agePanel);
        panel.add(storeLbl);
        panel.add(this.storeCbx);

        add(panel, BorderLayout.CENTER);

        JPanel buttonsPanel = new JPanel();
        this.btnSave.addActionListener(formsActionsController);
        buttonsPanel.add(this.btnSave);
        this.btnCancel.addActionListener(formsActionsController);
        buttonsPanel.add(this.btnCancel);
        add(buttonsPanel, BorderLayout.SOUTH);

        // Create and set up the window.
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pack();
        setSize(360, 180);
        setLocationRelativeTo(null);
        setVisible(true);
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

    public JButton getBtnSave() {
        return btnSave;
    }

    public JButton getBtnCancel() {
        return btnCancel;
    }

    public String getCmd() {
        return cmd;
    }

    public Employee getEmployee() {
        return employee;
    }
}
