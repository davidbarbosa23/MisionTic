package view;

import interfaces.IFormView;
import model.Product;

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

public class FormProduct extends JFrame implements IFormView {
    private ContentTables contentTables;
    private String cmd;
    private Product product;

    private JTextField productTxt;
    private JTextField productPriceTxt;

    public FormProduct(ContentTables contentTables, String cmd) {
        this.cmd = cmd;
        this.contentTables = contentTables;
        initForm();
    }

    public void initForm() {
        formsActionsController.setForm(this);
        formsActionsController.setContentTables(contentTables);

        JPanel panel = new JPanel(new GridLayout(2, 2));
        panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        JLabel productLbl = new JLabel("Nombre");
        this.productTxt = new JTextField();
        this.productTxt.setPreferredSize(new Dimension(150, 20));
        this.productTxt.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        JLabel productPriceLbl = new JLabel("Precio");
        this.productPriceTxt = new JTextField();
        this.productPriceTxt.setPreferredSize(new Dimension(150, 20));
        this.productPriceTxt.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        // Set title and default values
        if (cmd.equals("update")) {
            setTitle("Actualizar Producto");
            product = contentTables.getSelectedProduct();
            this.productTxt.setText(product.getName());
            this.productPriceTxt.setText(String.valueOf(product.getPrice()));
        } else {
            setTitle("Agregar Producto");
            this.productTxt.setText("");
            this.productPriceTxt.setText("");
        }

        JPanel namePanel = new JPanel();
        namePanel.setLayout(new FlowLayout());
        namePanel.add(this.productTxt);

        JPanel pricePanel = new JPanel();
        pricePanel.setLayout(new FlowLayout());
        pricePanel.add(this.productPriceTxt);

        panel.add(productLbl);
        panel.add(namePanel);
        panel.add(productPriceLbl);
        panel.add(pricePanel);

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

    public JTextField getProductTxt() {
        return productTxt;
    }

    public JTextField getProductPriceTxt() {
        return productPriceTxt;
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

    public Product getProduct() {
        return product;
    }
}
