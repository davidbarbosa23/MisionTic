package view;

import controller.EmployeesController;
import controller.ProductsController;
import controller.StocksController;
import controller.StoresController;
import model.Employee;
import model.Product;
import model.Stock;
import model.Store;
import util.Table;

import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ContentTables {
    private EmployeesController employeesController;
    private ProductsController productsController;
    private StocksController stocksController;
    private StoresController storesController;

    private JTable employeesTable = new Table();
    private JTable productsTable = new Table();
    private JTable stocksTable = new Table();
    private JTable storesTable = new Table();

    public ContentTables() {
        employeesController = new EmployeesController();
        loadEmployees();

        productsController = new ProductsController();
        loadProducts();

        stocksController = new StocksController();
        loadStocks();

        storesController = new StoresController();
        loadStores();
    }

    public void loadEmployees() {
        employeesTable.setModel(employeesController.get());
    }

    public void loadProducts() {
        productsTable.setModel(productsController.get());
    }

    public void loadStocks() {
        stocksTable.setModel(stocksController.get());
    }

    public void loadStores() {
        storesTable.setModel(storesController.get());
    }


    public JScrollPane getEmployeesTable() {
        return new JScrollPane(employeesTable);
    }

    public JScrollPane getProductsTable() {
        return new JScrollPane(productsTable);
    }

    public JScrollPane getStocksTable() {
        return new JScrollPane(stocksTable);
    }

    public JScrollPane getStoresTable() {
        return new JScrollPane(storesTable);
    }


    public Employee getSelectedEmployee() {
        int row = employeesTable.getSelectedRow();
        if (row == -1) return null;
        int id = Integer.parseInt(employeesTable.getModel().getValueAt(row, 0).toString());
        return employeesController.getEmployeeById(id);
    }

    public Product getSelectedProduct() {
        int row = productsTable.getSelectedRow();
        if (row == -1) return null;
        int id = Integer.parseInt(productsTable.getModel().getValueAt(row, 0).toString());
        return productsController.getProductById(id);
    }

    public Stock getSelectedStock() {
        int row = stocksTable.getSelectedRow();
        if (row == -1) return null;
        int id = Integer.parseInt(stocksTable.getModel().getValueAt(row, 0).toString());
        return stocksController.getStockById(id);
    }

    public Store getSelectedStore() {
        int row = storesTable.getSelectedRow();
        if (row == -1) return null;
        int id = Integer.parseInt(storesTable.getModel().getValueAt(row, 0).toString());
        return storesController.getStoreById(id);
    }
}
