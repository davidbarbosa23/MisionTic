package controller;

import interfaces.IProductsDAO;
import model.Product;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class ProductsController {
    private IProductsDAO productsDAO;
    private static final String[] columns = new String[]{"ID", "Nombre", "Precio"};

    public ProductsController(IProductsDAO productsDAO) {
        this.productsDAO = productsDAO;
    }

    public DefaultTableModel get() {
        DefaultTableModel model = new DefaultTableModel(null, columns);

        ArrayList<Product> products = productsDAO.getProductsList();
        for (Product product : products)
            model.addRow(product.toArray());

        return model;
    }
}
