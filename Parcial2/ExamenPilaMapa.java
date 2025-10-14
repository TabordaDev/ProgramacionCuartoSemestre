import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExamenPilaMapa {
    static class PilaEnteros{
        private int[] datos;
        private int tope; // -1 si esta vacia
        
        public PilaEnteros(int capacidad){
            datos = new int[capacidad];
            tope = -1;
        }
        public boolean estaVacia() {return tope == -1;}
        public boolean estaLlena() {return tope + 1 == datos.length;}

        public void apilar(int x){
            if (estaLlena()) throw new IllegalStateException ("Pila llena");
            tope++;
            datos[tope] = x;
        }

        public int desapilar(){
            if (estaVacia()) throw new IllegalStateException("Pila vacia");
            int v = datos[tope];
            tope--;
            return v;
        }

    } 
    
    // (50 pts ) Verifica si los parentesis están balanceados .
    public static boolean esBalanceado ( String s ) {
        // TODO : implementar usando PilaEnteros
        PilaEnteros pila = new PilaEnteros(s.length());
        for (int i = 0; i < s.length(); i++) { //Recorro la cadena
            char c = s.charAt(i); //Obtengo el caracter en la posicion i
            if (c == '(') {
                pila.apilar(1); //Apilo un valor cualquiera
            } else if (c == ')') { //Si encuentro un parentesis de cierre
                if (pila.estaVacia()) return false;
                pila.desapilar();
            }
        }
        return pila.estaVacia();
    }
    // (50 pts ) Actualiza la calificación si existe el id y esta en rango 0..100.
    public static boolean actualizarCalificacion ( Map < Integer , Integer > califPorId , int id , int nuevo ) {
        //TODO: validar rango, existencia y actualizar
        if (califPorId.containsKey(id) && nuevo >= 0 && nuevo <= 100) { //Si existe el id y la nueva calificacion esta en rango 0..100
            califPorId.put(id, nuevo); // Lo actualizo
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena = sc.nextLine();
        System.out.println("Balanceado: " + esBalanceado(cadena));

        Map<Integer, Integer> mapa = new HashMap<Integer, Integer>();
        mapa.put(101, 70);
        System.out.println("Actualizado: " + actualizarCalificacion(mapa, 101, 95));
        sc.close();
    }
}