import java.util.*;

public class Ejercicio5 {
    public static int segundoMasGrande(int[] arr) {
        Queue<Integer> cola = new LinkedList<>();
        for (int v : arr) cola.add(v);

        int mayor = cola.peek();
        int size = cola.size();

        // buscar el mayor
        for (int i = 0; i < size; i++) {
            int val = cola.poll();
            if (val > mayor) mayor = val;
            cola.add(val);
        }

        // buscar el segundo mayor
        int segundo = mayor; // lo iniciamos igual
        boolean encontrado = false;

        for (int i = 0; i < size; i++) {
            int val = cola.poll();
            if (val != mayor) {
                if (!encontrado || val > segundo) {
                    segundo = val;
                    encontrado = true;
                }
            }
            cola.add(val);
        }

        if (!encontrado) return mayor; // caso todos iguales
        return segundo;
    }

    public static void main(String[] args) {
        System.out.println(segundoMasGrande(new int[]{10,40,30,20,50})); // 40
        System.out.println(segundoMasGrande(new int[]{5,5,5,5,9}));     // 5
    }
}

