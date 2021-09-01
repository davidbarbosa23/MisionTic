package view;

import controller.FormsListsController;
import model.Product;
import model.Stock;
import model.Store;

import java.awt.Frame;
import java.awt.GridLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FormDialogStock extends FormDialog {
    private Stock stock;

    private JComboBox<Store> storeCbx;
    private JComboBox<Product> productCbx;
    private JTextField quantityTxt;

    public FormDialogStock(ContentTables contentTables, String cmd, Frame mainFrame) {
        super(contentTables, cmd, mainFrame);
    }

    @Override
    public void setForm() {
        setLayout(new GridLayout(3, 2));

        JLabel storeLbl = new JLabel("Seleccione bodega");
        this.storeCbx = new JComboBox<>();
        this.storeCbx.setModel(new DefaultComboBoxModel<>(FormsListsController.getStores().toArray(new Store[FormsListsController.getStores().size()])));

        JLabel productLbl = new JLabel("Seleccione producto");
        this.productCbx = new JComboBox<>();
        this.productCbx.setModel(new DefaultComboBoxModel<>(FormsListsController.getProducts().toArray(new Product[FormsListsController.getProducts().size()])));

        JLabel quantityLbl = new JLabel("Cantidad");
        this.quantityTxt = new JTextField();

        // Set title and default values
        if (getCmd().equals("update")) {
            setTitle("Actualizar Almacén");
            stock = getContentTables().getSelectedStock();
            this.storeCbx.getModel().setSelectedItem(FormsListsController.getStoreById(stock.getIdStore()));
            this.productCbx.getModel().setSelectedItem(FormsListsController.getProductById(stock.getIdProduct()));
            this.quantityTxt.setText(String.valueOf(stock.getQuantity()));
        } else {
            setTitle("Agregar Almacén");
            this.storeCbx.setSelectedItem(null);
            this.productCbx.setSelectedItem(null);
            this.quantityTxt.setText("");
        }

        add(storeLbl);
        add(this.storeCbx);
        add(productLbl);
        add(this.productCbx);
        add(quantityLbl);
        add(setTxtPanel(this.quantityTxt));

        initForm();
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
