package view;

import controller.ListsController;
import interfaces.IFormView;
import model.Product;
import model.Stock;
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

public class FormStock extends JFrame implements IFormView {
    private ContentTables contentTables;
    private String cmd;
    private Stock stock;

    private JComboBox<Store> storeCbx;
    private JComboBox<Product> productCbx;
    private JTextField quantityTxt;

    public FormStock(ContentTables contentTables, String cmd) {
        this.cmd = cmd;
        this.contentTables = contentTables;
        initForm();
    }

    public void initForm() {
        formsActionsController.setForm(this);
        formsActionsController.setContentTables(contentTables);

        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        JLabel storeLbl = new JLabel("Seleccione bodega");
        this.storeCbx = new JComboBox<>();
        this.storeCbx.setModel(new DefaultComboBoxModel<>(ListsController.getStores().toArray(new Store[ListsController.getStores().size()])));
        this.storeCbx.setSelectedIndex(0);

        JLabel productLbl = new JLabel("Seleccione producto");
        this.productCbx = new JComboBox<>();
        this.productCbx.setModel(new DefaultComboBoxModel<>(ListsController.getProducts().toArray(new Product[ListsController.getProducts().size()])));
        this.productCbx.setSelectedIndex(0);

        JLabel quantityLbl = new JLabel("Cantidad");
        this.quantityTxt = new JTextField();
        this.quantityTxt.setPreferredSize(new Dimension(150, 20));
        this.quantityTxt.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        // Set title and default values
        if (cmd.equals("update")) {
            setTitle("Actualizar Almacén");
            stock = contentTables.getSelectedStock();
            this.storeCbx.getModel().setSelectedItem(stock.getStoreName()); // ToDo: Get Store Object
            this.productCbx.getModel().setSelectedItem(stock.getProductName()); // ToDo: Get Product Object
            this.quantityTxt.setText(String.valueOf(stock.getQuantity()));
        } else {
            setTitle("Agregar Almacén");
            this.storeCbx.setSelectedItem(null);
            this.productCbx.setSelectedItem(null);
            this.quantityTxt.setText("");
        }

        JPanel quantityPanel = new JPanel();
        quantityPanel.setLayout(new FlowLayout());
        quantityPanel.add(this.quantityTxt);

        panel.add(storeLbl);
        panel.add(this.storeCbx);
        panel.add(productLbl);
        panel.add(this.productCbx);
        panel.add(quantityLbl);
        panel.add(quantityPanel);

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

    public JComboBox<Store> getStoreCbx() {
        return storeCbx;
    }

    public JComboBox<Product> getProductCbx() {
        return productCbx;
    }

    public JTextField getQuantityTxt() {
        return quantityTxt;
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

    public Stock getStock() {
        return stock;
    }
}
