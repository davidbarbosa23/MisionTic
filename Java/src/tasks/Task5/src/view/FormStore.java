package view;

import DAO.EmployeesDAO;
import DAO.StoresDAO;
import controller.ViewController;
import interfaces.IEmployeesDAO;
import interfaces.IStoresDAO;
import model.Employee;
import model.Store;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormStore extends JFrame implements ActionListener {
    private JTextField nameTxt;
    private JTextField addressTxt;
    private JButton btnSaveStore;

    public FormStore() {
        initForm();
    }

    public void initForm() {
        setTitle("Agregar Bodega");

        JPanel panel = new JPanel(new GridLayout(2, 2));
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

        JLabel addressLbl = new JLabel("Dirección");
        panel.add(addressLbl);
        JPanel addressPanel = new JPanel();
        addressPanel.setLayout(new FlowLayout());
        this.addressTxt = new JTextField();
        this.addressTxt.setPreferredSize(new Dimension(150, 20));
        this.addressTxt.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        addressPanel.add(this.addressTxt);
        panel.add(addressPanel);

        add(panel, BorderLayout.CENTER);

        this.btnSaveStore = new JButton("Guardar");
        this.btnSaveStore.addActionListener(this);
        add(this.btnSaveStore, BorderLayout.SOUTH);

        // Create and set up the window.
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pack();
        setSize(360, 150);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == this.btnSaveStore) {
            String name = this.nameTxt.getText();
            String address = this.addressTxt.getText();
            Store store = new Store(name, address);

            IStoresDAO storesDAO = new StoresDAO();
            storesDAO.createStore(store);

            this.setVisible(false);
        }
    }
}
