package view;

import controller.ViewController;
import model.Employee;
import model.Product;
import model.Stock;
import model.Store;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class ContentTables {
    private static String[] employeeColumns = new String[]{"ID", "Nombre", "Edad", "Bodega"};
    private static String[] productColumns = new String[]{"ID", "Nombre", "Precio"};
    private static String[] stockColumns = new String[]{"Bodega", "Producto", "Cantidad"};
    private static String[] storeColumns = new String[]{"ID", "Nombre", "Dirección"};

    public static JScrollPane getEmployeesTable() {
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(employeeColumns);
        JTable table = new JTable(tableModel);

        ArrayList<Employee> employees = ViewController.getEmployees();
        for (Employee employee : employees)
            tableModel.addRow(employee.toArray());

        return new JScrollPane(table);
    }

    public static JScrollPane getProductsTable() {
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(productColumns);
        JTable table = new JTable(tableModel);

        ArrayList<Product> products = ViewController.getProducts();
        for (Product product : products)
            tableModel.addRow(product.toArray());

        return new JScrollPane(table);
    }

    public static JScrollPane getStocksTable() {
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(stockColumns);
        JTable table = new JTable(tableModel);

        ArrayList<Stock> stocks = ViewController.getStocks();
        for (Stock stock : stocks)
            tableModel.addRow(stock.toArray());

        return new JScrollPane(table);
    }

    public static JScrollPane getStoresTable() {
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(storeColumns);
        JTable table = new JTable(tableModel);

        ArrayList<Store> stores = ViewController.getStores();
        for (Store store : stores)
            tableModel.addRow(store.toArray());

        return new JScrollPane(table);
    }
}
