import java.util.*;

public class Ejercicio1 {
    public static int votos(int upvotes, int downvotes) {
        Queue<Integer> cola = new LinkedList<>();

        // Agregar +1 por cada upvote
        for (int i = 0; i < upvotes; i++) {
            cola.add(1);
        }

        // Agregar -1 por cada downvote
        for (int i = 0; i < downvotes; i++) {
            cola.add(-1);
        }

        // Procesar la cola sumando hasta vaciarla
        int total = 0;
        int size = cola.size();
        for (int i = 0; i < size; i++) {
            total += cola.poll();
        }

        return total;
    }

    public static void main(String[] args) {
        System.out.println("Los resultados de los votos son: ");
        System.out.println(votos(13, 0));    // 13
        System.out.println(votos(2, 33));    // -31
        System.out.println(votos(132, 132)); // 0
    }
}
