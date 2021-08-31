package controller;

import DAO.StoresDAO;
import interfaces.IStoresDAO;
import model.Store;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class StoresController {
    IStoresDAO storesDAO;
    private static final String[] columns = new String[]{"ID", "Nombre", "Dirección"};

    public StoresController() {
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
