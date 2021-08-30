package DAO;

import interfaces.IProductsDAO;
import model.Product;
import util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ProductsDAO implements IProductsDAO {

    private Connection conn = null;

    public ArrayList<Product> getProductsList() {
        ArrayList<Product> products = new ArrayList<>();

        if (conn == null)
            conn = DBConnection.getConnection();

        String query = "SELECT `idproducto`, `nombre`, `precio` FROM `" + Product.TableName + "`;";

        try {
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(query);

            while (result.next()) {
                Product product = new Product(
                        result.getInt(1),
                        result.getString(2),
                        result.getDouble(3)
                );
                products.add(product);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return products;
    }

    public Product getProductById(int id) {
        Product product = null;

        if (conn == null)
            conn = DBConnection.getConnection();

        String query = "SELECT `idproducto`, `nombre`, `precio` FROM `" + Product.TableName + "` WHERE `idproducto` = " + id + ";";

        try {
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(query);

            while (result.next()) {
                product = new Product(
                        result.getInt(1),
                        result.getString(2),
                        result.getDouble(3)
                );
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return product;
    }

    public void createProduct(Product product) {
        if (conn == null)
            conn = DBConnection.getConnection();

        String query = "INSERT INTO `" + Product.TableName + "` (`nombre`, `precio`)  VALUES (?, ?);";

        try {
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, product.getName());
            statement.setDouble(2, product.getPrice());
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void updateProduct(Product product) {
        if (conn == null)
            conn = DBConnection.getConnection();

        String query = "UPDATE `" + Product.TableName + "` SET `nombre` = ?, `precio` = ? WHERE `idproducto` = ?;";

        try {
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, product.getName());
            statement.setDouble(2, product.getPrice());
            statement.setInt(3, product.getIdProduct());
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void deleteProductById(int id) {
        if (conn == null)
            conn = DBConnection.getConnection();

        String query = "DELETE FROM `" + Product.TableName + "` WHERE `idproducto` = ?;";

        try {
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
