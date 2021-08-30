package model;

public class Product {
    private int idproducto;
    private String nombre;
    private double precio;

    public static String TableName = "producto";

    public Product(String name, double price) {
        this.nombre = name;
        this.precio = price;
    }

    public Product(int idProduct, String name, double price) {
        this.idproducto = idProduct;
        this.nombre = name;
        this.precio = price;
    }

    public int getIdProduct() {
        return idproducto;
    }

    public String getName() {
        return nombre;
    }

    public void setName(String name) {
        this.nombre = name;
    }

    public double getPrice() {
        return precio;
    }

    public void setPrice(double price) {
        this.precio = price;
    }

    public Object[] toArray() {
        return new Object[]{idproducto, nombre, precio};
    }

    public String toString() {
        return nombre;
    }
}
