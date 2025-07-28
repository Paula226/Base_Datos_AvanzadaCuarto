/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Paula Lopez
 */
public class Grafo {
    public static final int INF = 99999; // Valor para representar "infinito"
    private int[][] matriz; // Matriz de adyacencia
    private int numNodos;

    public Grafo(int[][] matriz) {
        this.matriz = matriz;
        this.numNodos = matriz.length;
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public int getNumNodos() {
        return numNodos;
    }
}
