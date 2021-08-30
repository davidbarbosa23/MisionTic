package view;

import DAO.ProductsDAO;
import interfaces.IProductsDAO;
import model.Product;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class AddProduct extends JFrame implements ActionListener {
    private JLabel productLbl;
    private JTextField productTxt;
    private JLabel productPriceLbl;
    private JTextField productPriceTxt;
    private JButton btnCreateProduct;

    public AddProduct() {
        initForm();
    }

    public void initForm() {
        setTitle("Agregar Producto");
        setLayout(new GridLayout(8,2));

        this.productLbl = new JLabel("Nombre del producto");
        add(this.productLbl);
        this.productTxt = new JTextField();
        add(this.productTxt);

        this.productPriceLbl = new JLabel("Precio del producto");
        add(this.productPriceLbl);
        this.productPriceTxt = new JTextField();
        add(this.productPriceTxt);

        this.btnCreateProduct = new JButton("Guardar");
        this.btnCreateProduct.addActionListener(this);
        add(this.btnCreateProduct);

        // Create and set up the window.
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pack();
        setSize(320, 340);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == this.btnCreateProduct) {
            String name = this.productTxt.getText();
            double price = Double.parseDouble(this.productPriceTxt.getText());
            Product product = new Product(name, price);

            IProductsDAO productsDAO = new ProductsDAO();
            productsDAO.createProduct(product);
        }
    }
}
