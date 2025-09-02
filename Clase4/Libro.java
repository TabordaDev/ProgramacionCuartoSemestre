package Clase4;

public class Libro {
    private String titulo;
    private String autor;
    private double precio;

    public Libro(String titulo, String autor, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public double getPrecio() {
        return precio;
    }
    
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Precio: $" + precio;
    }

    //Método precios libros en el arreglo
    public double calcularPrecio(Libro[] libros){
        double total = 0.0;
        for (int i = 0; i < libros.length; i++) {
            total += libros[i].getPrecio();
        }
        return total;
    }

    //Método para filtrar y ordenar objetos en un arreglo
    //public void
    
}