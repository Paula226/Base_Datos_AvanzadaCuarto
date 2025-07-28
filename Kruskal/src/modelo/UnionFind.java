/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Paula Lopez
 */
public class UnionFind {

    private int[] padre;

    public UnionFind(int n) {
        padre = new int[n];
        for (int i = 0; i < n; i++) {
            padre[i] = i;
        }
    }

    public int encontrar(int nodo) {
        if (padre[nodo] != nodo) {
            padre[nodo] = encontrar(padre[nodo]);
        }
        return padre[nodo];
    }

    public boolean unir(int a, int b) {
        int raizA = encontrar(a);
        int raizB = encontrar(b);
        if (raizA == raizB) return false;
        padre[raizB] = raizA;
        return true;
    }
}

