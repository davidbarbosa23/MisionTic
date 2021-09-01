package controller;

import DAO.ProductsDAO;
import DAO.IProductsDAO;
import model.Product;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class TableProductsController {
    private IProductsDAO productsDAO;
    private static final String[] columns = new String[]{"ID", "Nombre", "Precio"};

    public TableProductsController() {
        this.productsDAO = new ProductsDAO();
    }

    public DefaultTableModel get() {
        DefaultTableModel model = new DefaultTableModel(null, columns);

        ArrayList<Product> products = productsDAO.getProductsList();
        for (Product product : products)
            model.addRow(product.toArray());

        return model;
    }

    public Product getProductById(int id) {
        return productsDAO.getProductById(id);
    }
}
