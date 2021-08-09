package tasks.Task2;

public class Publicacion {
    protected String nombre;
    protected int paginas;
    protected String tipo;

    public Publicacion(String nombre, int paginas, String tipo) {
        this.nombre = nombre;
        this.paginas = paginas;
        this.tipo = tipo;
    }

    @Override
    public String toString(){
        return "nombre: " + nombre + "\npaginas: " + paginas + "\ntipo: " + tipo;
    }
}