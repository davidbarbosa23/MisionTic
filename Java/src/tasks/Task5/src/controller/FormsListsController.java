package controller;

import DAO.ProductsDAO;
import DAO.StoresDAO;
import model.Product;
import model.Store;

import java.util.ArrayList;

public class FormsListsController {

    public static ArrayList<Product> getProducts() {
        ProductsDAO productsDAO = new ProductsDAO();
        return productsDAO.getProductsList();
    }

    public static Product getProductById(int id) {
        ProductsDAO productsDAO = new ProductsDAO();
        return productsDAO.getProductById(id);
    }

    public static ArrayList<Store> getStores() {
        StoresDAO storesDAO = new StoresDAO();
        return storesDAO.getStoresList();
    }

    public static Store getStoreById(int id) {
        StoresDAO storesDAO = new StoresDAO();
        return storesDAO.getStoreById(id);
    }
}
