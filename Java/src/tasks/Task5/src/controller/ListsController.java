package controller;

import DAO.ProductsDAO;
import DAO.StoresDAO;
import model.Product;
import model.Store;

import java.util.ArrayList;

public class ListsController {

    public static ArrayList<Product> getProducts() {
        ProductsDAO productsDAO = new ProductsDAO();
        return productsDAO.getProductsList();
    }

    public static ArrayList<Store> getStores() {
        StoresDAO storesDAO = new StoresDAO();
        return storesDAO.getStoresList();
    }
}
