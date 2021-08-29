package model;

public class Product {
    private int     idproducto;
    private String  nombre;
    private float   precio;

    public Product (int idProduct, String name, float price) {
        this.idproducto = idProduct;
        this.nombre = name;
        this.precio = price;
    }

    public int getIdProduct() {
        return idproducto;
    }

    public void setIdProduct(int idProduct) {
        this.idproducto = idProduct;
    }

    public String getName() {
        return nombre;
    }

    public void setName(String name) {
        this.nombre = name;
    }

    public float getPrice() {
        return precio;
    }

    public void setPrice(float price) {
        this.precio = price;
    }
}
