package DAO;

import interfaces.IStocksDAO;
import model.Product;
import model.Stock;
import model.Store;
import util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class StocksDAO implements IStocksDAO {

    private Connection conn = null;

    public ArrayList<Stock> getStocksList() {
        ArrayList<Stock> stocks = new ArrayList<>();

        if (conn == null)
            conn = DBConnection.getConnection();

        String query = "SELECT A.`idAlmacena`, B.`idBodega`, B.`nombre`, P.`idproducto`, P.`nombre`, A.`cantidad` FROM `" + Stock.TableName + "` A INNER JOIN `" + Store.TableName + "` B on A.`idBodega` = B.`idBodega` INNER JOIN `" + Product.TableName + "` P on A.idproducto = P.idproducto;";

        try {
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(query);

            while (result.next()) {
                Stock stock = new Stock(
                        result.getInt(1),
                        result.getInt(2),
                        result.getString(3),
                        result.getInt(4),
                        result.getString(5),
                        result.getInt(6)
                );
                stocks.add(stock);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return stocks;
    }

    public Stock getStockById(int id) {
        Stock stock = null;

        if (conn == null)
            conn = DBConnection.getConnection();

        String query = "SELECT A.`idAlmacena`, B.`idBodega`, B.`nombre`, P.`idproducto`, P.`nombre`, A.`cantidad` FROM `" + Stock.TableName + "` A INNER JOIN `" + Store.TableName + "` B on A.`idBodega` = B.`idBodega` INNER JOIN `" + Product.TableName + "` P on A.idproducto = P.idproducto WHERE A.`idAlmacena` = " + id + ";";

        try {
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(query);

            while (result.next()) {
                stock = new Stock(
                        result.getInt(1),
                        result.getInt(2),
                        result.getString(3),
                        result.getInt(4),
                        result.getString(5),
                        result.getInt(6)
                );
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return stock;
    }

    public void createStock(Stock stock) {
        if (conn == null)
            conn = DBConnection.getConnection();

        String query = "INSERT INTO `" + Stock.TableName + "` (`idBodega`, `idproducto`, `cantidad`)  VALUES (?, ?, ?);";

        try {
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, stock.getIdStore());
            statement.setInt(2, stock.getIdProduct());
            statement.setInt(3, stock.getQuantity());
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void updateStock(Stock stock) {
        if (conn == null)
            conn = DBConnection.getConnection();

        String query = "UPDATE `" + Stock.TableName + "` SET `idBodega` = ?, `idproducto` = ?, `cantidad` = ? WHERE `idAlmacena` = ?;";

        try {
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, stock.getIdStore());
            statement.setInt(2, stock.getIdProduct());
            statement.setInt(3, stock.getQuantity());
            statement.setInt(4, stock.getIdStock());
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void deleteStockById(int id) {
        if (conn == null)
            conn = DBConnection.getConnection();

        String query = "DELETE FROM `" + Stock.TableName + "` WHERE `idAlmacena` = ?;";

        try {
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}