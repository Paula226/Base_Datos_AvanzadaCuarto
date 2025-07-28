/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import modelo.Arista;
import modelo.UnionFind;

/**
 *
 * @author Paula Lopez
 */
public class AlgoritmoKruskal {
   public static List<Arista> obtenerMST(List<Arista> aristas, int numNodos) {
        List<Arista> resultado = new ArrayList<>();
        UnionFind uf = new UnionFind(numNodos);

        // Usamos el método clásico para ordenar las aristas por peso
        Collections.sort(aristas, new Comparator<Arista>() {
            public int compare(Arista a1, Arista a2) {
                return Integer.compare(a1.peso, a2.peso);
            }
        });

        System.out.println("Ejecución del algoritmo de Kruskal");

        for (Arista arista : aristas) {
            System.out.println("Evaluando arista (" + arista.origen + " - " + arista.destino + ") con peso " + arista.peso);
            if (uf.unir(arista.origen, arista.destino)) {
                resultado.add(arista);
                System.out.println("Agregada al árbol de recubrimiento mínimo.");
            } else {
                System.out.println("Forma un ciclo. No se agrega.");
            }
        }

        return resultado;
    }
}
