package view;

import DAO.EmployeesDAO;
import DAO.ProductsDAO;
import DAO.StocksDAO;
import DAO.StoresDAO;
import controller.EmployeesController;
import controller.ProductsController;
import controller.StocksController;
import controller.StoresController;
import interfaces.IEmployeesDAO;
import interfaces.IProductsDAO;
import interfaces.IStocksDAO;
import interfaces.IStoresDAO;
import model.Employee;
import model.Product;
import model.Stock;
import model.Store;
import util.ForcedListSelectionModel;

import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class ContentTables {
    private IEmployeesDAO employeesDAO;
    private EmployeesController employeesController;
    private IProductsDAO productsDAO;
    private ProductsController productsController;
    private IStocksDAO stocksDAO;
    private StocksController stocksController;
    private IStoresDAO storesDAO;
    private StoresController storesController;

    private JTable employeesTable = new JTable() {
        public boolean isCellEditable(int rowIndex, int colIndex) {
            return false;
        }
    };
    private JTable productsTable = new JTable() {
        public boolean isCellEditable(int rowIndex, int colIndex) {
            return false;
        }
    };
    private JTable stocksTable = new JTable() {
        public boolean isCellEditable(int rowIndex, int colIndex) {
            return false;
        }
    };
    private JTable storesTable = new JTable() {
        public boolean isCellEditable(int rowIndex, int colIndex) {
            return false;
        }
    };

    public ContentTables() {
        employeesDAO = new EmployeesDAO();
        employeesController = new EmployeesController(employeesDAO);
        loadEmployees();

        productsDAO = new ProductsDAO();
        productsController = new ProductsController(productsDAO);
        loadProducts();

        stocksDAO = new StocksDAO();
        stocksController = new StocksController(stocksDAO);
        loadStocks();

        storesDAO = new StoresDAO();
        storesController = new StoresController(storesDAO);
        loadStores();
    }

    public void loadEmployees() {
        employeesTable.setSelectionModel(new ForcedListSelectionModel());
        employeesTable.setModel(employeesController.get());
        employeesTable.getTableHeader().setFont(new Font("SansSerif", Font.ITALIC, 14));
    }

    public void loadProducts() {
        productsTable.setSelectionModel(new ForcedListSelectionModel());
        productsTable.setModel(productsController.get());
        productsTable.getTableHeader().setFont(new Font("SansSerif", Font.ITALIC, 14));
    }

    public void loadStocks() {
        stocksTable.setSelectionModel(new ForcedListSelectionModel());
        stocksTable.setModel(stocksController.get());
        stocksTable.getTableHeader().setFont(new Font("SansSerif", Font.ITALIC, 14));
    }

    public void loadStores() {
        storesTable.setSelectionModel(new ForcedListSelectionModel());
        storesTable.setModel(storesController.get());
        storesTable.getTableHeader().setFont(new Font("SansSerif", Font.ITALIC, 14));
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

    public Employee getSelectedEmployee () {
        int row = employeesTable.getSelectedRow();
        int id = Integer.parseInt(employeesTable.getModel().getValueAt(row, 0).toString());
        return employeesDAO.getEmployeeById(id);
    }

    public Product getSelectedProduct () {
        int row = productsTable.getSelectedRow();
        int id = Integer.parseInt(productsTable.getModel().getValueAt(row, 0).toString());
        return productsDAO.getProductById(id);
    }

    public Stock getSelectedStock () {
        int row = stocksTable.getSelectedRow();
        int id = Integer.parseInt(stocksTable.getModel().getValueAt(row, 0).toString());
        return stocksDAO.getStockById(id);
    }

    public Store getSelectedStore () {
        int row = storesTable.getSelectedRow();
        int id = Integer.parseInt(storesTable.getModel().getValueAt(row, 0).toString());
        return storesDAO.getStoreById(id);
    }
}
