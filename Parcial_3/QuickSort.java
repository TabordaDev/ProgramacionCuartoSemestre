public class QuickSort {

    public static void quickSort(int[] arr, int inicio, int fin) { 
        if (inicio < fin) {
            int pivote = particion(arr, inicio, fin); // Particiona el arreglo
            quickSort(arr, inicio, pivote - 1); // Ordena la parte izquierda del pivote
            quickSort(arr, pivote + 1, fin); // Ordena la parte derecha del pivote
        }
    }

    public static int particion(int[] arr, int inicio, int fin) {
        int pivote = arr[fin]; // Elige el último elemento como pivote
        int i = inicio - 1; // Índice del elemento más pequeño
        for (int j = inicio; j < fin; j++) { // Recorre el arreglo hasta el penúltimo elemento
            if (arr[j] <= pivote) { // Si el elemento actual es menor o igual al pivote
                i++;
                int temp = arr[i]; // Intercambia arr[i] y arr[j]
                arr[i] = arr[j];
                arr[j] = temp; // Coloca el elemento menor al lado izquierdo del pivote
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[fin]; // Coloca el pivote en su posición correcta
        arr[fin] = temp; // Intercambia arr[i + 1] y arr[fin]
        return i + 1; // Retorna el índice del pivote
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};

        System.out.println("Arreglo original:");
        for (int n : arr) System.out.print(n + " ");
        System.out.println();

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Arreglo ordenado (Quick Sort):");
        for (int n : arr) System.out.print(n + " ");
    }
}

