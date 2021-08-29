package model;

public class Stock {
    private int     idBodega;
    private int     idproducto;
    private int     cantidad;

    public Stock(int idStore, int idProduct, int quantity) {
        this.idBodega = idStore;
        this.idproducto = idProduct;
        this.cantidad = quantity;
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
}
