package com.ifba.exercicio_FP.projeto3.estrutura;

import com.ifba.exercicio_FP.projeto3.basica.Processo;

public class Pilha {

    private Processo[] elementos;
    private int topo;

    public Pilha(int tamanho) {
        elementos = new Processo[tamanho];
        topo = -1;
    }

    public void empilhar(Processo processo) {

        if (topo == elementos.length - 1) {
            System.out.println("Pilha cheia!");
            return;
        }

        topo++;
        elementos[topo] = processo;
    }

    public Processo desempilhar() {

        if (topo == -1) {
            System.out.println("Pilha vazia!");
            return null;
        }

        Processo processo = elementos[topo];
        topo--;

        return processo;
    }

    public Processo verificarTop() {

        if (topo == -1) {
            System.out.println("Pilha vazia!");
            return null;
        }

        return elementos[topo];
    }

    public void imprimir() {

        for (int i = topo; i >= 0; i--) {
            elementos[i].mostrar();
            System.out.println("----------------");
        }
    }
}
