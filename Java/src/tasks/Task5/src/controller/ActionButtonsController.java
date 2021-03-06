package controller;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import DAO.EmployeesDAO;
import DAO.ProductsDAO;
import DAO.StocksDAO;
import DAO.StoresDAO;
import DAO.IEmployeesDAO;
import DAO.IProductsDAO;
import DAO.IStocksDAO;
import DAO.IStoresDAO;
import model.Employee;
import model.Product;
import model.Stock;
import model.Store;
import view.ActionButtons;
import view.ContentTables;
import view.FormDialogEmployee;
import view.FormDialogProduct;
import view.FormDialogStock;
import view.FormDialogStore;

import javax.swing.JOptionPane;

public class ActionButtonsController implements ActionListener {
    private ActionButtons actionButtons;
    private ContentTables contentTables;
    private Frame mainFrame;

    public ActionButtonsController(ActionButtons actionButtons, ContentTables contentTables) {
        this.actionButtons = actionButtons;
        this.contentTables = contentTables;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        // Dispose frames except Main, before launch other frame
        for (Frame fr : Frame.getFrames()) {
            String specificFrameName = fr.getClass().getName();
            if (specificFrameName.equals("view.Main")) mainFrame = fr;
            else fr.dispose();
        }

        // Select action according to selected tab
        switch (actionButtons.getSelectedTab()) {
            case 0:
                stockTab(actionEvent);
                break;
            case 1:
                productTab(actionEvent);
                break;
            case 2:
                employeeTab(actionEvent);
                break;
            case 3:
                storeTab(actionEvent);
                break;
            default:
                return;
        }
    }

    private int deleteDialog(String title, String desc) {
        return JOptionPane.showConfirmDialog(
                mainFrame,
                "¿Seguro desea eliminar este registro de " + title + "? " + desc,
                "Alerta de borrado",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.WARNING_MESSAGE
        );
    }

    private void noSelectedDialog() {
        JOptionPane.showMessageDialog(mainFrame, "Primero debe seleccionar un registro");
    }

    private void stockTab(ActionEvent actionEvent) {
        if ((actionEvent.getActionCommand().equals("update") || actionEvent.getActionCommand().equals("delete")) && contentTables.getSelectedStock() == null) {
            noSelectedDialog();
            return;
        }
        if (actionEvent.getActionCommand().equals("delete")) {
            int option = deleteDialog("almacén", "");
            if (option == 0 && contentTables != null) {
                Stock stock = contentTables.getSelectedStock();
                IStocksDAO stocksDAO = new StocksDAO();
                stocksDAO.deleteStockById(stock.getIdStock());
                contentTables.loadStocks();
            }
        } else new FormDialogStock(contentTables, actionEvent.getActionCommand(), mainFrame);
    }

    private void productTab(ActionEvent actionEvent) {
        if ((actionEvent.getActionCommand().equals("update") || actionEvent.getActionCommand().equals("delete")) && contentTables.getSelectedProduct() == null) {
            noSelectedDialog();
            return;
        }
        if (actionEvent.getActionCommand().equals("delete")) {
            int option = deleteDialog("producto", "Esta acción eliminará los registros de almacén relacionados al producto.");
            if (option == 0 && contentTables != null) {
                Product product = contentTables.getSelectedProduct();

                IStocksDAO stocksDAO = new StocksDAO();
                stocksDAO.deleteStocksByProductId(product.getIdProduct());
                contentTables.loadStocks();

                IProductsDAO productsDAO = new ProductsDAO();
                productsDAO.deleteProductById(product.getIdProduct());
                contentTables.loadProducts();
            }
        } else new FormDialogProduct(contentTables, actionEvent.getActionCommand(), mainFrame);
    }

    private void employeeTab(ActionEvent actionEvent) {
        if ((actionEvent.getActionCommand().equals("update") || actionEvent.getActionCommand().equals("delete")) && contentTables.getSelectedEmployee() == null) {
            noSelectedDialog();
            return;
        }
        if (actionEvent.getActionCommand().equals("delete")) {
            int option = deleteDialog("empleado", "");
            if (option == 0 && contentTables != null) {
                Employee employee = contentTables.getSelectedEmployee();
                IEmployeesDAO employeesDAO = new EmployeesDAO();
                employeesDAO.deleteEmployeeById(employee.getIdEmployee());
                contentTables.loadEmployees();
            }
        } else new FormDialogEmployee(contentTables, actionEvent.getActionCommand(), mainFrame);
    }

    private void storeTab(ActionEvent actionEvent) {
        if ((actionEvent.getActionCommand().equals("update") || actionEvent.getActionCommand().equals("delete")) && contentTables.getSelectedStore() == null) {
            noSelectedDialog();
            return;
        }
        if (actionEvent.getActionCommand().equals("delete")) {
            int option = deleteDialog("bodega", "Esta acción eliminará los registros de almacén y de empleados relacionados a la bodega.");
            if (option == 0 && contentTables != null) {
                Store store = contentTables.getSelectedStore();

                IStocksDAO stocksDAO = new StocksDAO();
                stocksDAO.deleteStocksByStoreId(store.getIdStore());
                contentTables.loadStocks();

                IEmployeesDAO employeesDAO = new EmployeesDAO();
                employeesDAO.deleteEmployeeByStoreId(store.getIdStore());
                contentTables.loadEmployees();

                IStoresDAO storesDAO = new StoresDAO();
                storesDAO.deleteStoreById(store.getIdStore());
                contentTables.loadStores();
            }
        } else new FormDialogStore(contentTables, actionEvent.getActionCommand(), mainFrame);
    }
}
