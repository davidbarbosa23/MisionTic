package tasks.Task2;

public class Libro extends Publicacion {
    protected String autor;

    public Libro(String nombre, int paginas, String tipo, String autor) {
        super(nombre, paginas, tipo);
        this.autor = autor;
    }

    @Override
    public String toString() {
        return super.toString() + "\nautor: " + autor;
    }
}