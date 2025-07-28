/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmo;

import modelo.Grafo;

/**
 *
 * @author Paula Lopez
 */
public class Dijkstra {
     public static int[] calcularDistancias(Grafo grafo, int inicio) {
        int n = grafo.getNumNodos();
        int[] dist = new int[n];        // Guarda las distancias más cortas
        boolean[] visitado = new boolean[n]; // Marca los nodos ya visitados

        // Inicializar distancias
        for (int i = 0; i < n; i++) {
            dist[i] = grafo.INF;
            visitado[i] = false;
        }

        dist[inicio] = 0; // La distancia al nodo de inicio siempre es 0

        // Repetir para todos los nodos
        for (int i = 0; i < n - 1; i++) {
            int u = nodoMinimo(dist, visitado, n); // Nodo mas cercano no visitado
            visitado[u] = true;

            for (int v = 0; v < n; v++) {
                if (!visitado[v] && grafo.getMatriz()[u][v] != grafo.INF &&
                    dist[u] + grafo.getMatriz()[u][v] < dist[v]) {
                    dist[v] = dist[u] + grafo.getMatriz()[u][v];
                }
            }
        }

        return dist;
    }

    private static int nodoMinimo(int[] dist, boolean[] visitado, int n) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int i = 0; i < n; i++) {
            if (!visitado[i] && dist[i] < min) {
                min = dist[i];
                minIndex = i;
            }
        }

        return minIndex;
    }

}
