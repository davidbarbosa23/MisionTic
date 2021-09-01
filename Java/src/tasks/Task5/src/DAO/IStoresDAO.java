package DAO;

import model.Store;

import java.util.ArrayList;

public interface IStoresDAO {
    ArrayList<Store> getStoresList();

    Store getStoreById(int id);

    void createStore(Store store);

    void updateStore(Store store);

    void deleteStoreById(int id);
}
