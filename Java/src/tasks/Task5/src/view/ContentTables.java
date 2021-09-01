package view;

import controller.TableEmployeesController;
import controller.TableProductsController;
import controller.TableStocksController;
import controller.TableStoresController;
import model.Employee;
import model.Product;
import model.Stock;
import model.Store;
import util.Table;

import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ContentTables {
    private TableEmployeesController tableEmployeesController;
    private TableProductsController tableProductsController;
    private TableStocksController tableStocksController;
    private TableStoresController tableStoresController;

    private JTable employeesTable = new Table();
    private JTable productsTable = new Table();
    private JTable stocksTable = new Table();
    private JTable storesTable = new Table();

    public ContentTables() {
        tableEmployeesController = new TableEmployeesController();
        loadEmployees();

        tableProductsController = new TableProductsController();
        loadProducts();

        tableStocksController = new TableStocksController();
        loadStocks();

        tableStoresController = new TableStoresController();
        loadStores();
    }

    public void loadEmployees() {
        employeesTable.setModel(tableEmployeesController.get());
    }

    public void loadProducts() {
        productsTable.setModel(tableProductsController.get());
    }

    public void loadStocks() {
        stocksTable.setModel(tableStocksController.get());
    }

    public void loadStores() {
        storesTable.setModel(tableStoresController.get());
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
        return tableEmployeesController.getEmployeeById(id);
    }

    public Product getSelectedProduct() {
        int row = productsTable.getSelectedRow();
        if (row == -1) return null;
        int id = Integer.parseInt(productsTable.getModel().getValueAt(row, 0).toString());
        return tableProductsController.getProductById(id);
    }

    public Stock getSelectedStock() {
        int row = stocksTable.getSelectedRow();
        if (row == -1) return null;
        int id = Integer.parseInt(stocksTable.getModel().getValueAt(row, 0).toString());
        return tableStocksController.getStockById(id);
    }

    public Store getSelectedStore() {
        int row = storesTable.getSelectedRow();
        if (row == -1) return null;
        int id = Integer.parseInt(storesTable.getModel().getValueAt(row, 0).toString());
        return tableStoresController.getStoreById(id);
    }
}
