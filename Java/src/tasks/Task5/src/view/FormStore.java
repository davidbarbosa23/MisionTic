package view;

import interfaces.IFormView;
import model.Store;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FormStore extends JFrame implements IFormView {
    private ContentTables contentTables;
    private String cmd;
    private Store store;

    private JTextField nameTxt;
    private JTextField addressTxt;

    public FormStore(ContentTables contentTables, String cmd) {
        this.cmd = cmd;
        this.contentTables = contentTables;
        initForm();
    }

    public void initForm() {
        formsActionsController.setForm(this);
        formsActionsController.setContentTables(contentTables);

        JPanel panel = new JPanel(new GridLayout(2, 2));
        panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        JLabel nameLbl = new JLabel("Nombre");
        this.nameTxt = new JTextField();
        this.nameTxt.setPreferredSize(new Dimension(150, 20));
        this.nameTxt.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        JLabel addressLbl = new JLabel("Dirección");
        this.addressTxt = new JTextField();
        this.addressTxt.setPreferredSize(new Dimension(150, 20));
        this.addressTxt.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        // Set title and default values
        if (cmd.equals("update")) {
            setTitle("Actualizar Bodega");
            store = contentTables.getSelectedStore();
            this.nameTxt.setText(store.getName());
            this.addressTxt.setText(String.valueOf(store.getAddress()));
        } else {
            setTitle("Agregar Bodega");
            this.nameTxt.setText("");
            this.addressTxt.setText("");
        }

        JPanel namePanel = new JPanel();
        namePanel.setLayout(new FlowLayout());
        namePanel.add(this.nameTxt);

        JPanel addressPanel = new JPanel();
        addressPanel.setLayout(new FlowLayout());
        addressPanel.add(this.addressTxt);

        panel.add(nameLbl);
        panel.add(namePanel);
        panel.add(addressLbl);
        panel.add(addressPanel);

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
        setSize(360, 150);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public JTextField getNameTxt() {
        return nameTxt;
    }

    public JTextField getAddressTxt() {
        return addressTxt;
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

    public Store getStore() {
        return store;
    }
}
