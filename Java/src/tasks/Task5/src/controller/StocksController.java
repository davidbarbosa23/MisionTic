package controller;

import DAO.StocksDAO;
import DAO.IStocksDAO;
import model.Stock;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class StocksController {
    private IStocksDAO stocksDAO;
    private static final String[] columns = new String[]{"ID", "Bodega", "Producto", "Cantidad"};

    public StocksController() {
        this.stocksDAO = new StocksDAO();
    }

    public DefaultTableModel get() {
        DefaultTableModel model = new DefaultTableModel(null, columns);

        ArrayList<Stock> stocks = stocksDAO.getStocksList();
        for (Stock stock : stocks)
            model.addRow(stock.toArray());

        return model;
    }

    public Stock getStockById(int id) {
        return stocksDAO.getStockById(id);
    }
}
