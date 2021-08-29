package model;

public class Employee {
    private int     idBodega;
    private int     idempleado;
    private String  nombre;
    private int     edad;

    public Employee (int idStore, int idEmployee, String name, int age) {
        this.idBodega = idStore;
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
}
