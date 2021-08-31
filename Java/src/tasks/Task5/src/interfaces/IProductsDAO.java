package interfaces;

import model.Product;

import java.util.ArrayList;

public interface IProductsDAO {
    ArrayList<Product> getProductsList();

    Product getProductById(int id);

    void createProduct(Product product);

    void updateProduct(Product product);

    void deleteProductById(int id);
}
