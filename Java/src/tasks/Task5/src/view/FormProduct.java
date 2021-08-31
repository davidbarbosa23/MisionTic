package view;

import model.Product;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FormProduct extends Form {
    private Product product;

    private JTextField productTxt;
    private JTextField productPriceTxt;

    public FormProduct(ContentTables contentTables, String cmd) {
        super(contentTables, cmd);
    }

    @Override
    public void setForm() {
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

        JPanel panel = new JPanel(new GridLayout(2, 2));
        panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        panel.add(productLbl);
        panel.add(setTxtPanel(this.productTxt));
        panel.add(productPriceLbl);
        panel.add(setTxtPanel(this.productPriceTxt));

        add(panel, BorderLayout.CENTER);

        initForm(150);
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
