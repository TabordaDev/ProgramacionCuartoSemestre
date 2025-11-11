public class Burbuja {

    public static void burbuja(int[] arr) {
        int n = arr.length; // Obtener la longitud del arreglo
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) { // J solo se compara con elementos no ordenados
                if (arr[j] > arr[j + 1]) { // Intercambiar si el elemento encontrado es mayor que el siguiente
                    int temp = arr[j]; // Almacenar temporalmente el valor
                    arr[j] = arr[j + 1]; // Intercambiar valores
                    arr[j + 1] = temp; // Colocar el valor almacenado en la posición correcta
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {69, 32, 28, 11, 24, 16, 87};

        System.out.println("Arreglo original:");
        for (int n : arr) System.out.print(n + " "); // Imprime el arreglo original
        System.out.println();

        burbuja(arr); // Llama al método de ordenamiento burbuja

        System.out.println("Arreglo ordenado (Burbuja):");
        for (int n : arr) System.out.print(n + " "); // Imprime el arreglo ordenado
    }
}
