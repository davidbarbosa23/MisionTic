package model;

public class Employee {
    private int idBodega;
    private String nombreBodega;
    private int idempleado;
    private String nombre;
    private int edad;

    public static String TableName = "empleado";

    public Employee(int idStore, String name, int age) {
        this.idBodega = idStore;
        this.nombre = name;
        this.edad = age;
    }

    public Employee(int idStore, String storeName, int idEmployee, String name, int age) {
        this.idBodega = idStore;
        this.nombreBodega = storeName;
        this.idempleado = idEmployee;
        this.nombre = name;
        this.edad = age;
    }

    public int getIdStore() {
        return idBodega;
    }

    public void setIdStore(int idStore) {
        this.idBodega = idStore;
    }

    public String getStoreName() {
        return nombreBodega;
    }

    public void setStoreName(String storeName) {
        this.nombreBodega = storeName;
    }

    public int getIdEmployee() {
        return idempleado;
    }

    public void setIdEmployee(int idEmployee) {
        this.idempleado = idEmployee;
    }

    public String getName() {
        return nombre;
    }

    public void setName(String name) {
        this.nombre = name;
    }

    public int getAge() {
        return edad;
    }

    public void setAge(int age) {
        this.edad = age;
    }

    public Object[] toArray() {
        return new Object[]{idempleado, nombre, edad, nombreBodega};
    }
}
