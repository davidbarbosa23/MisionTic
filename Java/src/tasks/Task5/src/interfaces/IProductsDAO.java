package interfaces;

import model.Product;

import java.util.ArrayList;

public interface IProductsDAO {
    public ArrayList<Product> getProductsList();
    public Product getProductById(int id);
    public void createProduct(Product product);
    public void updateProduct(Product product);
    public void deleteProductById(int id);
}
