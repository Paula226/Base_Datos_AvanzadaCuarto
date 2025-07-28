/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import algoritmo.Dijkstra;
import modelo.Grafo;

/**
 *
 * @author Paula Lopez
 */
public class Principal {
    
    public static void main(String[] args) {
        int INF = Grafo.INF;

        // Matriz de adyacencia: cada fila representa un nodo y sus conexiones
        int[][] matriz = {
            {0,   4,   INF, 10},
            {INF, 0,   3,   INF},
            {INF, INF, 0,   1},
            {INF, INF, INF, 0}
        };

        Grafo grafo = new Grafo(matriz);
        int inicio = 0; // Nodo desde el cual iniciamos (puede ser cualquier número entre 0 y 3)

        int[] distancias = Dijkstra.calcularDistancias(grafo, inicio);

        System.out.println("Distancias desde el nodo " + inicio + ":");
        for (int i = 0; i < distancias.length; i++) {
            if (distancias[i] == INF) {
                System.out.println("Al nodo " + i + ": No hay camino");
            } else {
                System.out.println("Al nodo " + i + ": " + distancias[i]);
            }
        }
    }
}
