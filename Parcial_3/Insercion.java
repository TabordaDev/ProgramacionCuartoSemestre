public class Insercion {

    public static void insercion(int[] arr) {
        for (int i = 1; i < arr.length; i++) { // Recorre desde el segundo elemento
            int key = arr[i]; // Elemento a insertar
            int j = i - 1; // Índice del elemento anterior

            while (j >= 0 && arr[j] > key) { // Mueve los elementos mayores a la derecha
                arr[j + 1] = arr[j]; // Desplaza el elemento
                j--; // Decrementa el índice
            }
            arr[j + 1] = key; // Inserta el elemento en su posición correcta
        }
    }

    public static void main(String[] args) {
        int[] arr = {58, 22, 14, 19, 9};

        System.out.println("Arreglo original:");
        for (int n : arr) System.out.print(n + " "); // Imprime el arreglo original
        System.out.println();

        insercion(arr);

        System.out.println("Arreglo ordenado (Inserción):");
        for (int n : arr) System.out.print(n + " "); // Imprime el arreglo ordenado
    }
}
