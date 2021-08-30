package interfaces;

import model.Store;

import java.util.ArrayList;

public interface IStoresDAO {
    public ArrayList<Store> getStoresList();
    public Store getStoreById(int id);
    public void createStore(Store store);
    public void updateStore(Store store);
    public void deleteStoreById(int id);
}
