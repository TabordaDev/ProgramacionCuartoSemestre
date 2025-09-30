import java.util.*;

public class Ejercicio8 {
    public static int guerraDeNumeros(int[] arr) {
        Queue<Integer> cola = new LinkedList<>();
        for (int v : arr) cola.add(v);

        int pares = 0, impares = 0;
        while (!cola.isEmpty()) {
            int v = cola.poll();
            if (v % 2 == 0) pares += v;
            else impares += v;
        }
        return (impares > pares) ? impares - pares : pares - impares;
    }

    public static void main(String[] args) {
        System.out.println(guerraDeNumeros(new int[]{2,8,7,5})); // 2
        System.out.println(guerraDeNumeros(new int[]{1,3,5,9})); // 18
        System.out.println(guerraDeNumeros(new int[]{2,4,6,8})); // 20
    }
}
