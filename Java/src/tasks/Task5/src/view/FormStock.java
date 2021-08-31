package view;

import controller.ListsController;
import model.Product;
import model.Stock;
import model.Store;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FormStock extends Form {
    private Stock stock;

    private JComboBox<Store> storeCbx;
    private JComboBox<Product> productCbx;
    private JTextField quantityTxt;

    public FormStock(ContentTables contentTables, String cmd) {
        super(contentTables, cmd);
    }

    @Override
    public void setForm() {
        JLabel storeLbl = new JLabel("Seleccione bodega");
        this.storeCbx = new JComboBox<>();
        this.storeCbx.setModel(new DefaultComboBoxModel<>(ListsController.getStores().toArray(new Store[ListsController.getStores().size()])));

        JLabel productLbl = new JLabel("Seleccione producto");
        this.productCbx = new JComboBox<>();
        this.productCbx.setModel(new DefaultComboBoxModel<>(ListsController.getProducts().toArray(new Product[ListsController.getProducts().size()])));

        JLabel quantityLbl = new JLabel("Cantidad");
        this.quantityTxt = new JTextField();

        // Set title and default values
        if (getCmd().equals("update")) {
            setTitle("Actualizar Almacén");
            stock = getContentTables().getSelectedStock();
            this.storeCbx.getModel().setSelectedItem(ListsController.getStoreById(stock.getIdStore()));
            this.productCbx.getModel().setSelectedItem(ListsController.getProductById(stock.getIdProduct()));
            this.quantityTxt.setText(String.valueOf(stock.getQuantity()));
        } else {
            setTitle("Agregar Almacén");
            this.storeCbx.setSelectedItem(null);
            this.productCbx.setSelectedItem(null);
            this.quantityTxt.setText("");
        }

        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        panel.add(storeLbl);
        panel.add(this.storeCbx);
        panel.add(productLbl);
        panel.add(this.productCbx);
        panel.add(quantityLbl);
        panel.add(setTxtPanel(this.quantityTxt));

        add(panel, BorderLayout.CENTER);

        initForm(180);
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

    public Stock getStock() {
        return stock;
    }
}
