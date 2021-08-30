package interfaces;

import model.Stock;

import java.util.ArrayList;

public interface IStocksDAO {
    public ArrayList<Stock> getStocksList();
    public Stock getStockById(int id);
    public void createStock(Stock stock);
    public void updateStock(Stock stock);
    public void deleteStockById(int id);
}
