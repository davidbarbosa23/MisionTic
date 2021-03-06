package DAO;

import model.Stock;

import java.util.ArrayList;

public interface IStocksDAO {
    ArrayList<Stock> getStocksList();

    Stock getStockById(int id);

    void createStock(Stock stock);

    void updateStock(Stock stock);

    void deleteStockById(int id);

    void deleteStocksByProductId(int id);

    void deleteStocksByStoreId(int id);
}
