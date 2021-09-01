package controller;

import DAO.EmployeesDAO;
import DAO.IEmployeesDAO;
import DAO.IProductsDAO;
import DAO.IStocksDAO;
import DAO.IStoresDAO;
import DAO.ProductsDAO;
import DAO.StocksDAO;
import DAO.StoresDAO;
import model.Employee;
import model.Product;
import model.Stock;
import model.Store;
import view.FormDialogEmployee;
import view.FormDialogProduct;
import view.FormDialogStock;
import view.FormDialogStore;
import view.IFormDialog;

import javax.swing.JOptionPane;
import java.util.Objects;

public class FormsDialogsController {
    private IFormDialog formDialog = null;
    private String name;
    private String address;
    private int age;
    private int quantity;
    private int idStore;
    private int idProduct;
    private double price;

    public void execute(IFormDialog formDialog) {
        this.formDialog = formDialog;
        this.name = null;
        this.address = null;
        this.age = -1;
        this.quantity = -1;
        this.idStore = -1;
        this.idProduct = -1;
        this.price = -1;
        if (this.formDialog instanceof FormDialogEmployee) {
            executeFormEmployee();
        } else if (this.formDialog instanceof FormDialogProduct) {
            executeFormProduct();
        } else if (this.formDialog instanceof FormDialogStock) {
            executeFormStock();
        } else if (this.formDialog instanceof FormDialogStore) {
            executeFormStore();
        }
    }

    private void invalidInputs() {
        JOptionPane.showMessageDialog(formDialog.getMainFrame(), "Datos inválidos", "Alerta", JOptionPane.WARNING_MESSAGE);
    }

    private void createdDialog() {
        JOptionPane.showMessageDialog(formDialog.getMainFrame(), "Registro creado", "Alerta", JOptionPane.INFORMATION_MESSAGE);
    }

    private void updatedDialog() {
        JOptionPane.showMessageDialog(formDialog.getMainFrame(), "Registro actualizado", "Alerta", JOptionPane.INFORMATION_MESSAGE);
    }

    private void executeFormEmployee() {
        FormDialogEmployee dialog = (FormDialogEmployee) this.formDialog;
        try {
            name = dialog.getNameTxt().getText();
            age = Integer.parseInt(dialog.getAgeTxt().getText());
            idStore = ((Store) Objects.requireNonNull(dialog.getStoreCbx().getSelectedItem())).getIdStore();
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (name == null || age == -1 || idStore == -1) {
            invalidInputs();
            return;
        }

        IEmployeesDAO employeesDAO = new EmployeesDAO();
        if (dialog.getCmd().equals("update")) {
            Employee employee = dialog.getEmployee();
            employee.setName(name);
            employee.setAge(age);
            employee.setIdStore(idStore);
            employeesDAO.updateEmployee(employee);
            updatedDialog();
        } else {
            Employee employee = new Employee(idStore, name, age);
            employeesDAO.createEmployee(employee);
            createdDialog();
        }

        dialog.getContentTables().loadEmployees();
    }

    private void executeFormProduct() {
        FormDialogProduct dialog = (FormDialogProduct) this.formDialog;
        try {
            name = dialog.getProductTxt().getText();
            price = Double.parseDouble(dialog.getProductPriceTxt().getText());
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (name == null || price == -1) {
            invalidInputs();
            return;
        }

        IProductsDAO productsDAO = new ProductsDAO();
        if (dialog.getCmd().equals("update")) {
            Product product = dialog.getProduct();
            product.setName(name);
            product.setPrice(price);
            productsDAO.updateProduct(product);
            updatedDialog();
        } else {
            Product product = new Product(name, price);
            productsDAO.createProduct(product);
            createdDialog();
        }

        dialog.getContentTables().loadProducts();
    }

    private void executeFormStock() {
        FormDialogStock dialog = (FormDialogStock) this.formDialog;
        try {
            idStore = ((Store) Objects.requireNonNull(dialog.getStoreCbx().getSelectedItem())).getIdStore();
            idProduct = ((Product) Objects.requireNonNull(dialog.getProductCbx().getSelectedItem())).getIdProduct();
            quantity = Integer.parseInt(dialog.getQuantityTxt().getText());
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (idStore == -1 || idProduct == -1 || quantity == -1) {
            invalidInputs();
            return;
        }

        IStocksDAO stocksDAO = new StocksDAO();
        if (dialog.getCmd().equals("update")) {
            Stock stock = dialog.getStock();
            stock.setIdStore(idStore);
            stock.setIdProduct(idProduct);
            stock.setQuantity(quantity);
            stocksDAO.updateStock(stock);
            updatedDialog();
        } else {
            Stock stock = new Stock(idStore, idProduct, quantity);
            stocksDAO.createStock(stock);
            createdDialog();
        }

        dialog.getContentTables().loadStocks();
    }

    private void executeFormStore() {
        FormDialogStore dialog = (FormDialogStore) this.formDialog;
        try {
            name = dialog.getNameTxt().getText();
            address = dialog.getAddressTxt().getText();
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (name == null || address == null) {
            invalidInputs();
            return;
        }

        IStoresDAO storesDAO = new StoresDAO();
        if (dialog.getCmd().equals("update")) {
            Store store = dialog.getStore();
            store.setName(name);
            store.setAddress(address);
            storesDAO.updateStore(store);
            updatedDialog();
        } else {
            Store store = new Store(name, address);
            storesDAO.createStore(store);
            createdDialog();
        }

        dialog.getContentTables().loadStores();
    }
}
