package controller;

import DAO.EmployeesDAO;
import DAO.ProductsDAO;
import DAO.StocksDAO;
import DAO.StoresDAO;
import interfaces.IEmployeesDAO;
import interfaces.IFormView;
import interfaces.IProductsDAO;
import interfaces.IStocksDAO;
import interfaces.IStoresDAO;
import model.Employee;
import model.Product;
import model.Stock;
import model.Store;
import view.ContentTables;
import view.FormEmployee;
import view.FormProduct;
import view.FormStock;
import view.FormStore;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.Objects;
import javax.swing.JFrame;

public class FormsActionsController implements ActionListener {
    private IFormView form = null;
    private ContentTables contentTables = null;

    public void setForm(IFormView form) {
        this.form = form;
    }

    public void setContentTables(ContentTables contentTables) {
        this.contentTables = contentTables;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (form == null) return;

        if (actionEvent.getSource() == form.getBtnSave()) {

            if (form instanceof FormEmployee) {
                FormEmployee frame = (FormEmployee) form;
                String name = frame.getNameTxt().getText();
                int age = Integer.parseInt(frame.getAgeTxt().getText());
                int idStore = ((Store) Objects.requireNonNull(frame.getStoreCbx().getSelectedItem())).getIdStore();

                IEmployeesDAO employeesDAO = new EmployeesDAO();
                if (frame.getCmd().equals("update")) {
                    Employee employee = frame.getEmployee();
                    employee.setName(name);
                    employee.setAge(age);
                    employee.setIdStore(idStore);
                    employeesDAO.updateEmployee(employee);
                } else {
                    Employee employee = new Employee(idStore, name, age);
                    employeesDAO.createEmployee(employee);
                }

                if (contentTables != null) contentTables.loadEmployees();
            }

            if (form instanceof FormProduct) {
                FormProduct frame = (FormProduct) form;
                String name = frame.getProductTxt().getText();
                double price = Double.parseDouble(frame.getProductPriceTxt().getText());

                IProductsDAO productsDAO = new ProductsDAO();
                if (frame.getCmd().equals("update")) {
                    Product product = frame.getProduct();
                    product.setName(name);
                    product.setPrice(price);
                    productsDAO.updateProduct(product);
                } else {
                    Product product = new Product(name, price);
                    productsDAO.createProduct(product);
                }

                if (contentTables != null) contentTables.loadProducts();
            }

            if (form instanceof FormStock) {
                FormStock frame = (FormStock) form;
                int idStore = ((Store) Objects.requireNonNull(frame.getStoreCbx().getSelectedItem())).getIdStore();
                int idProduct = ((Product) Objects.requireNonNull(frame.getProductCbx().getSelectedItem())).getIdProduct();
                int quantity = Integer.parseInt(frame.getQuantityTxt().getText());

                IStocksDAO stocksDAO = new StocksDAO();
                if (frame.getCmd().equals("update")) {
                    Stock stock = frame.getStock();
                    stock.setIdStore(idStore);
                    stock.setIdProduct(idProduct);
                    stock.setQuantity(quantity);
                    stocksDAO.updateStock(stock);
                } else {
                    Stock stock = new Stock(idStore, idProduct, quantity);
                    stocksDAO.createStock(stock);
                }

                if (contentTables != null) contentTables.loadStocks();
            }

            if (form instanceof FormStore) {
                FormStore frame = (FormStore) form;
                String name = frame.getNameTxt().getText();
                String address = frame.getAddressTxt().getText();

                IStoresDAO storesDAO = new StoresDAO();
                if (frame.getCmd().equals("update")) {
                    Store store = frame.getStore();
                    store.setName(name);
                    store.setAddress(address);
                    storesDAO.updateStore(store);
                } else {
                    Store store = new Store(name, address);
                    storesDAO.createStore(store);
                }

                if (contentTables != null) contentTables.loadStores();
            }
        }

        if (form instanceof JFrame && (actionEvent.getSource() == form.getBtnCancel() || actionEvent.getSource() == form.getBtnSave())) {
            ((JFrame) form).setVisible(false);
            ((JFrame) form).dispatchEvent(new WindowEvent(((JFrame) form), WindowEvent.WINDOW_CLOSING));
            ((JFrame) form).dispose();
            form = null;
        }
    }
}
