package controller;

import interfaces.IStocksDAO;
import model.Stock;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class StocksController {
    private IStocksDAO stocksDAO;
    private static final String[] columns = new String[]{"ID", "Bodega", "Producto", "Cantidad"};

    public StocksController(IStocksDAO stocksDAO) {
        this.stocksDAO = stocksDAO;
    }

    public DefaultTableModel get() {
        DefaultTableModel model = new DefaultTableModel(null, columns);

        ArrayList<Stock> stocks = stocksDAO.getStocksList();
        for (Stock stock : stocks)
            model.addRow(stock.toArray());

        return model;
    }
}
