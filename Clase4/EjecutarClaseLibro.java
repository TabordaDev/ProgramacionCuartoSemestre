public class EjecutarClaseLibro{
    public static void main(String[] args) {
        // Crear un objeto de la clase Libro
        Libro[] libros = new Libro[5];
        libros[0] = new Libro("La vuelta al mundo en ochenta dias", "Julio Verne", 30000);
        libros[1] = new Libro("Cien años de soledad", "Gabriel García Márquez", 25000);
        libros[2] = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 40000);
        libros[3] = new Libro("El Principito", "Antoine de Saint-Exupéry", 20000);
        libros[4] = new Libro("1984", "George Orwell", 35000);

        // Calcular el precio total de los libros
        double precioTotal = libros[0].calcularPrecio(libros);
        System.out.println("El precio total de los libros es: $" + precioTotal);
        
        // Imprimir todos los libros
        System.out.println("Lista de libros:");
        for (Libro libro : libros) {
            System.out.println(libro);
        }
        
        // Filtrar libros cuyo precio sea mayor a 25000
        double valorFiltro = 25000;
        Libro[] filtrados = Libro.filtrarPorPrecioMayor(libros, valorFiltro);
        System.out.println("\nLibros con precio mayor a $" + valorFiltro + ":");
        for (Libro libro : filtrados) {
            System.out.println(libro);
        }

        // Ordenar los libros por precio de menor a mayor
        Libro.ordenarPorPrecio(libros);
        System.out.println("\nLibros ordenados por precio (menor a mayor):");
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }
}