import java.util.*;

public class Ejercicio2 {
    public static boolean panSimilar(Deque<String> s1, Deque<String> s2) {
        if (s1.isEmpty() || s2.isEmpty()) return false;
        return s1.peekFirst().equals(s2.peekFirst()) &&
               s1.peekLast().equals(s2.peekLast());
    }

    public static void main(String[] args) {
        Deque<String> s1 = new LinkedList<>(Arrays.asList("pan blanco","lechuga","pan blanco"));
        Deque<String> s2 = new LinkedList<>(Arrays.asList("pan blanco","tomate","pan blanco"));
        System.out.println(panSimilar(s1, s2)); // true

        Deque<String> s3 = new LinkedList<>(Arrays.asList("pan integral","queso","pan integral"));
        Deque<String> s4 = new LinkedList<>(Arrays.asList("pan blanco","queso","pan integral"));
        System.out.println(panSimilar(s3, s4)); // false
    }
}
