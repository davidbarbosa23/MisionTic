package model;

public class Stock {
    private int idAlmacena;
    private int idBodega;
    private String nombreBodega;
    private int idproducto;
    private String nombreProducto;
    private int cantidad;

    public static String TableName = "almacena";

    public Stock(int idStore, int idProduct, int quantity) {
        this.idBodega = idStore;
        this.idproducto = idProduct;
        this.cantidad = quantity;
    }

    public Stock(int idStock, int idStore, String storeName, int idProduct, String productName, int quantity) {
        this.idAlmacena = idStock;
        this.idBodega = idStore;
        this.nombreBodega = storeName;
        this.idproducto = idProduct;
        this.nombreProducto = productName;
        this.cantidad = quantity;
    }

    public int getIdStock() {
        return idAlmacena;
    }

    public int getIdStore() {
        return idBodega;
    }

    public void setIdStore(int idStore) {
        this.idBodega = idStore;
    }

    public int getIdProduct() {
        return idproducto;
    }

    public void setIdProduct(int idProduct) {
        this.idproducto = idProduct;
    }

    public int getQuantity() {
        return cantidad;
    }

    public void setQuantity(int quantity) {
        this.cantidad = quantity;
    }

    public Object[] toArray() {
        return new Object[]{idAlmacena, nombreBodega, nombreProducto, cantidad};
    }
}
