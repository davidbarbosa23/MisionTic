package view;

import DAO.StocksDAO;
import controller.ViewController;
import interfaces.IStocksDAO;
import model.Product;
import model.Stock;
import model.Store;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormStock extends JFrame implements ActionListener {
    private JComboBox<Store> storeCbx;
    private JComboBox<Product> productCbx;
    private JTextField quantityTxt;
    private JButton btnSaveStock;

    public FormStock() {
        initForm();
    }

    public void initForm() {
        setTitle("Agregar Almacén");

        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        JLabel storeLbl = new JLabel("Seleccione bodega");
        panel.add(storeLbl);
        this.storeCbx = new JComboBox();
        this.storeCbx.setModel(new DefaultComboBoxModel<>(ViewController.getStores().toArray(new Store[ViewController.getStores().size()])));
        this.storeCbx.setSelectedIndex(0);
        panel.add(this.storeCbx);

        JLabel productLbl = new JLabel("Seleccione producto");
        panel.add(productLbl);
        this.productCbx = new JComboBox();
        this.productCbx.setModel(new DefaultComboBoxModel<>(ViewController.getProducts().toArray(new Product[ViewController.getProducts().size()])));
        this.productCbx.setSelectedIndex(0);
        panel.add(this.productCbx);

        JLabel quantityLbl = new JLabel("Cantidad");
        panel.add(quantityLbl);
        JPanel quantityPanel = new JPanel();
        quantityPanel.setLayout(new FlowLayout());
        this.quantityTxt = new JTextField();
        this.quantityTxt.setPreferredSize(new Dimension(150, 20));
        this.quantityTxt.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        quantityPanel.add(this.quantityTxt);
        panel.add(quantityPanel);

        add(panel, BorderLayout.CENTER);

        this.btnSaveStock = new JButton("Guardar");
        this.btnSaveStock.addActionListener(this);
        add(this.btnSaveStock, BorderLayout.SOUTH);

        // Create and set up the window.
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pack();
        setSize(360, 180);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == this.btnSaveStock) {
            int idStore = ((Store) this.storeCbx.getSelectedItem()).getIdStore();
            int idProduct = ((Product) this.productCbx.getSelectedItem()).getIdProduct();
            int price = Integer.parseInt(this.quantityTxt.getText());
            Stock stock = new Stock(idStore, idProduct, price);

            IStocksDAO stocksDAO = new StocksDAO();
            stocksDAO.createStock(stock);

            this.setVisible(false);
        }
    }
}
