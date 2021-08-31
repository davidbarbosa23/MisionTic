package controller;

import interfaces.IStoresDAO;
import model.Store;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class StoresController {
    IStoresDAO storesDAO;
    private static final String[] columns = new String[]{"ID", "Nombre", "Dirección"};

    public StoresController(IStoresDAO storesDAO) {
        this.storesDAO = storesDAO;
    }

    public DefaultTableModel get() {
        DefaultTableModel model = new DefaultTableModel(null, columns);

        ArrayList<Store> stores = storesDAO.getStoresList();
        for (Store store : stores)
            model.addRow(store.toArray());

        return model;
    }
}
