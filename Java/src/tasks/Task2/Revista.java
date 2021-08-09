package tasks.Task2;

public class Revista extends Publicacion {
    protected int publicacion;

    public Revista(String nombre, int paginas, String tipo, int publicacion) {
        super(nombre, paginas, tipo);
        this.publicacion = publicacion;
    }

    @Override
    public String toString() {
        return super.toString() + "\npublicacion: #" + publicacion;
    }
}