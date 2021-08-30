package model;

public class Store {
    private int idBodega;
    private String nombre;
    private String direccion;

    public static String TableName = "Bodega";

    public Store( String name, String address) {
        this.nombre = name;
        this.direccion = address;
    }

    public Store(int idStore, String name, String address) {
        this.idBodega = idStore;
        this.nombre = name;
        this.direccion = address;
    }

    public int getIdStore() {
        return idBodega;
    }

    public String getName() {
        return nombre;
    }

    public void setName(String name) {
        this.nombre = name;
    }

    public String getAddress() {
        return direccion;
    }

    public void setAddress(String address) {
        this.direccion = address;
    }

    public Object[] toArray() {
        return new Object[]{idBodega, nombre, direccion};
    }

    public String toString() {
        return nombre;
    }
}
