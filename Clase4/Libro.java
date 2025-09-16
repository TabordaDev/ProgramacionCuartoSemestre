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

    // Método para filtrar por autor (sin .equals) y ordenar por precio usando ciclos for
    public static Libro[] filtrarYOrdenarPorAutor(Libro[] libros, String autor) {
        // Contar coincidencias
        int count = 0;
        for (int i = 0; i < libros.length; i++) {
            if (libros[i].getAutor().toLowerCase().compareTo(autor.toLowerCase()) == 0) {
                count++;
            }
        }
        // Crear arreglo filtrado
        Libro[] filtrados = new Libro[count];
        int idx = 0;
        for (int i = 0; i < libros.length; i++) {
            if (libros[i].getAutor().toLowerCase().compareTo(autor.toLowerCase()) == 0) {
                filtrados[idx++] = libros[i];
            }
        }
        // Ordenar por precio ascendente (burbuja)
        for (int i = 0; i < filtrados.length - 1; i++) {
            for (int j = 0; j < filtrados.length - i - 1; j++) {
                if (filtrados[j].getPrecio() > filtrados[j + 1].getPrecio()) {
                    Libro temp = filtrados[j];
                    filtrados[j] = filtrados[j + 1];
                    filtrados[j + 1] = temp;
                }
            }
        }
        return filtrados;
    }
}