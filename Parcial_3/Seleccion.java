public class Seleccion {

    public static void seleccion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) { // Recorre el arreglo
            int min = i; // Índice del elemento mínimo
            for (int j = i + 1; j < arr.length; j++) { // Busca el elemento mínimo en el resto del arreglo
                if (arr[j] < arr[min]) { // Actualiza el índice del mínimo si se encuentra uno menor
                    min = j; // Actualiza el índice del elemento mínimo
                }
            }
            int temp = arr[min]; // Intercambia el elemento mínimo con el primer elemento no ordenado
            arr[min] = arr[i];
            arr[i] = temp; // Coloca el elemento mínimo en su posición correcta
        }
    }

    public static void main(String[] args) {
        int[] arr = {29, 10, 14, 37, 14};

        System.out.println("Arreglo original:");
        for (int n : arr) System.out.print(n + " ");
        System.out.println();

        seleccion(arr);

        System.out.println("Arreglo ordenado (Selección):");
        for (int n : arr) System.out.print(n + " ");
    }
}
