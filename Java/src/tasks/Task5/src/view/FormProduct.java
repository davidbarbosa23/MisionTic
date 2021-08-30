package view;

import DAO.ProductsDAO;
import interfaces.IProductsDAO;
import model.Product;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class FormProduct extends JFrame implements ActionListener {
    private JTextField productTxt;
    private JTextField productPriceTxt;
    private JButton btnSaveProduct;

    public FormProduct() {
        initForm();
    }

    public void initForm() {
        setTitle("Agregar Producto");

        JPanel panel = new JPanel(new GridLayout(2, 2));
        panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        JLabel productLbl = new JLabel("Nombre");
        panel.add(productLbl);
        JPanel namePanel = new JPanel();
        namePanel.setLayout(new FlowLayout());
        this.productTxt = new JTextField();
        this.productTxt.setPreferredSize(new Dimension(150, 20));
        this.productTxt.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        namePanel.add(this.productTxt);
        panel.add(namePanel);

        JLabel productPriceLbl = new JLabel("Precio");
        panel.add(productPriceLbl);
        JPanel pricePanel = new JPanel();
        pricePanel.setLayout(new FlowLayout());
        this.productPriceTxt = new JTextField();
        this.productPriceTxt.setPreferredSize(new Dimension(150, 20));
        this.productPriceTxt.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        pricePanel.add(this.productPriceTxt);
        panel.add(pricePanel);

        add(panel, BorderLayout.CENTER);

        this.btnSaveProduct = new JButton("Guardar");
        this.btnSaveProduct.addActionListener(this);
        add(this.btnSaveProduct, BorderLayout.SOUTH);

        // Create and set up the window.
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pack();
        setSize(360, 150);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == this.btnSaveProduct) {
            String name = this.productTxt.getText();
            double price = Double.parseDouble(this.productPriceTxt.getText());
            Product product = new Product(name, price);

            IProductsDAO productsDAO = new ProductsDAO();
            productsDAO.createProduct(product);

            this.setVisible(false);
        }
    }
}
