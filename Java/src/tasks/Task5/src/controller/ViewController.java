package controller;

import DAO.EmployeesDAO;
import DAO.ProductsDAO;
import DAO.StocksDAO;
import DAO.StoresDAO;
import model.Employee;
import model.Product;
import model.Stock;
import model.Store;

import java.util.ArrayList;

public class ViewController {
//    private ArrayList<Employee> employees = null;
//    private ArrayList<Product> products = null;
//    private ArrayList<Stock> stocks = null;
//    private ArrayList<Store> stores = null;
//
//    public ViewController() {
//        EmployeesDAO employeesDAO = new EmployeesDAO();
//        this.employees = employeesDAO.getEmployeesList();
//
//        ProductsDAO productsDAO = new ProductsDAO();
//        this.products = productsDAO.getProductsList();
//
//        StocksDAO stocksDAO = new StocksDAO();
//        this.stocks = stocksDAO.getStocksList();
//
//        StoresDAO storesDAO = new StoresDAO();
//        this.stores = storesDAO.getStoresList();
//    }

    public static ArrayList<Employee> getEmployees() {
        EmployeesDAO employeesDAO = new EmployeesDAO();
        return employeesDAO.getEmployeesList();
    }

    public static ArrayList<Product> getProducts() {
        ProductsDAO productsDAO = new ProductsDAO();
        return productsDAO.getProductsList();
    }

    public static ArrayList<Stock> getStocks() {
        StocksDAO stocksDAO = new StocksDAO();
        return stocksDAO.getStocksList();
    }

    public static ArrayList<Store> getStores() {
        StoresDAO storesDAO = new StoresDAO();
        return storesDAO.getStoresList();
    }
}
