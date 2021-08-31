package DAO;

import interfaces.IStoresDAO;
import model.Store;
import util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class StoresDAO implements IStoresDAO {

    private Connection conn = null;

    public ArrayList<Store> getStoresList() {
        ArrayList<Store> stores = new ArrayList<>();

        if (conn == null)
            conn = DBConnection.getConnection();

        String query = "SELECT `idBodega`, `nombre`, `direccion` FROM `" + Store.TableName + "` ORDER BY `idBodega`;";

        try {
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(query);

            while (result.next()) {
                Store store = new Store(
                        result.getInt(1),
                        result.getString(2),
                        result.getString(3)
                );
                stores.add(store);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return stores;
    }

    public Store getStoreById(int id) {
        Store store = null;

        if (conn == null)
            conn = DBConnection.getConnection();

        String query = "SELECT `idBodega`, `nombre`, `direccion` FROM `" + Store.TableName + "` WHERE `idBodega` = " + id + ";";

        try {
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(query);

            while (result.next()) {
                store = new Store(
                        result.getInt(1),
                        result.getString(2),
                        result.getString(3)
                );
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return store;
    }

    public void createStore(Store store) {
        if (conn == null)
            conn = DBConnection.getConnection();

        String query = "INSERT INTO `" + Store.TableName + "` (`nombre`, `direccion`)  VALUES (?, ?);";

        try {
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, store.getName());
            statement.setString(2, store.getAddress());
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void updateStore(Store store) {
        if (conn == null)
            conn = DBConnection.getConnection();

        String query = "UPDATE `" + Store.TableName + "` SET `nombre` = ?, `direccion` = ? WHERE `idBodega` = ?;";

        try {
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, store.getName());
            statement.setString(2, store.getAddress());
            statement.setInt(3, store.getIdStore());
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void deleteStoreById(int id) {
        if (conn == null)
            conn = DBConnection.getConnection();

        String query = "DELETE FROM `" + Store.TableName + "` WHERE `idBodega` = ?;";

        try {
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
