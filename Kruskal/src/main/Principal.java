/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.ArrayList;
import java.util.List;
import logica.AlgoritmoKruskal;
import modelo.Arista;

/**
 *
 * @author Paula Lopez
 */
public class Principal {
        public static void main(String[] args) {
        int numNodos = 5;

        List<Arista> aristas = new ArrayList<>();
        aristas.add(new Arista(0, 1, 10));
        aristas.add(new Arista(0, 2, 6));
        aristas.add(new Arista(0, 3, 5));
        aristas.add(new Arista(1, 3, 15));
        aristas.add(new Arista(2, 3, 4));

        List<Arista> mst = AlgoritmoKruskal.obtenerMST(aristas, numNodos);

        System.out.println("\n Árbol de Recubrimiento Mínimo ");
        int pesoTotal = 0;
        for (Arista a : mst) {
            System.out.println(a.origen + " - " + a.destino + " (peso: " + a.peso + ")");
            pesoTotal += a.peso;
        }
        System.out.println("Peso total del árbol: " + pesoTotal);
    }

}
