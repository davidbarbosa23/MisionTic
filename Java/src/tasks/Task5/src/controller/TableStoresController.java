package controller;

import DAO.StoresDAO;
import DAO.IStoresDAO;
import model.Store;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class TableStoresController {
    IStoresDAO storesDAO;
    private static final String[] columns = new String[]{"ID", "Nombre", "Dirección"};

    public TableStoresController() {
        this.storesDAO = new StoresDAO();
    }

    public DefaultTableModel get() {
        DefaultTableModel model = new DefaultTableModel(null, columns);

        ArrayList<Store> stores = storesDAO.getStoresList();
        for (Store store : stores)
            model.addRow(store.toArray());

        return model;
    }

    public Store getStoreById(int id) {
        return storesDAO.getStoreById(id);
    }
}
