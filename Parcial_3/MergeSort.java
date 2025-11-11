public class MergeSort {

    public static void mergeSort(int[] arr, int izquierda, int derecha) {
        if (izquierda < derecha) { // Si el arreglo tiene más de un elemento
            int medio = (izquierda + derecha) / 2; // Encuentra el punto medio
            mergeSort(arr, izquierda, medio); // Ordena la primera mitad
            mergeSort(arr, medio + 1, derecha); // Ordena la segunda mitad
            merge(arr, izquierda, medio, derecha); // Combina las dos mitades ordenadas
        }
    }

    public static void merge(int[] arr, int izquierda, int medio, int derecha) { // Combina dos subarreglos ordenados
        int n1 = medio - izquierda + 1; 
        int n2 = derecha - medio;

        int[] L = new int[n1]; // Arreglos temporales
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) // Copia los datos a los arreglos temporales
            L[i] = arr[izquierda + i]; // Copia la primera mitad
        for (int j = 0; j < n2; j++)
            R[j] = arr[medio + 1 + j]; // Copia la segunda mitad

        int i = 0, j = 0, k = izquierda; // Índices iniciales de los subarreglos y el arreglo original
        while (i < n1 && j < n2) { // Combina los arreglos temporales de vuelta al arreglo original
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) arr[k++] = L[i++]; // Copia los elementos restantes de L[]
        while (j < n2) arr[k++] = R[j++]; // Copia los elementos restantes de R[]
    }

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};

        System.out.println("Arreglo original:");
        for (int n : arr) System.out.print(n + " ");
        System.out.println();

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Arreglo ordenado (Merge Sort):");
        for (int n : arr) System.out.print(n + " ");
    }
}
