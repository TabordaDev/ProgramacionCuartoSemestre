import java.util.*;

public class Dijkstra {
    static final int INF = Integer.MAX_VALUE; // Valor grande que representa "infinito"

    public static void dijkstra(int[][] grafo, int origen) {
        int n = grafo.length;
        int[] distancia = new int[n];
        boolean[] visitado = new boolean[n];

        // Inicializar todas las distancias como infinitas
        Arrays.fill(distancia, INF);
        distancia[origen] = 0; // Distancia al origen es 0

        for (int i = 0; i < n - 1; i++) {
            int u = nodoMinDistancia(distancia, visitado);
            if (u == -1) break; // Evita error si no hay más nodos alcanzables
            visitado[u] = true; //Visitar cambia a true

            for (int v = 0; v < n; v++) { // Actualizar distancias de los nodos adyacentes
                if (!visitado[v] && grafo[u][v] != 0 && distancia[u] != INF
                        && distancia[u] + grafo[u][v] < distancia[v]) {
                    distancia[v] = distancia[u] + grafo[u][v]; // Actualizar distancia
                }
            }
        }

        // Mostrar resultados
        System.out.println("Distancias mínimas desde el nodo " + origen + ":");
        for (int i = 0; i < n; i++) {
            System.out.println("Hasta " + i + " = " + distancia[i]); // Imprime la distancia mínima al nodo i
        }
    }

    static int nodoMinDistancia(int[] distancia, boolean[] visitado) { // Encuentra el nodo con la distancia mínima
        int min = INF, indiceMin = -1;
        for (int i = 0; i < distancia.length; i++) {
            if (!visitado[i] && distancia[i] <= min) { // Nodo no visitado con distancia mínima
                min = distancia[i];
                indiceMin = i; // Actualiza el índice del nodo con la distancia mínima
            }
        }
        return indiceMin;
    }

    public static void main(String[] args) {
    // Grafo representado con matriz de adyacencia de 3x3
    int[][] grafo = {
        {0, 4, 1},  // Nodo 0 conectado al 1 (peso 4) y al 2 (peso 1)
        {4, 0, 2},  // Nodo 1 conectado al 0 (peso 4) y al 2 (peso 2)
        {1, 2, 0}   // Nodo 2 concetado al 0 (peso 1) y al 1 (peso 2)
    };

    dijkstra(grafo, 0); // Inicia desde el nodo 0
    }
}