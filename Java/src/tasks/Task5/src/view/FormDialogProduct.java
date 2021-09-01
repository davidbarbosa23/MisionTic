package view;

import model.Product;

import java.awt.Frame;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FormDialogProduct extends FormDialog {
    private Product product;

    private JTextField productTxt;
    private JTextField productPriceTxt;

    public FormDialogProduct(ContentTables contentTables, String cmd, Frame mainFrame) {
        super(contentTables, cmd, mainFrame);
    }

    @Override
    public void setForm() {
        setLayout(new GridLayout(2, 2));

        JLabel productLbl = new JLabel("Nombre");
        this.productTxt = new JTextField();

        JLabel productPriceLbl = new JLabel("Precio");
        this.productPriceTxt = new JTextField();

        // Set title and default values
        if (getCmd().equals("update")) {
            setTitle("Actualizar Producto");
            product = getContentTables().getSelectedProduct();
            this.productTxt.setText(product.getName());
            this.productPriceTxt.setText(String.valueOf(product.getPrice()));
        } else {
            setTitle("Agregar Producto");
            this.productTxt.setText("");
            this.productPriceTxt.setText("");
        }

        add(productLbl);
        add(setTxtPanel(this.productTxt));
        add(productPriceLbl);
        add(setTxtPanel(this.productPriceTxt));

        initForm();
    }

    public JTextField getProductTxt() {
        return productTxt;
    }

    public JTextField getProductPriceTxt() {
        return productPriceTxt;
    }

    public Product getProduct() {
        return product;
    }
}
