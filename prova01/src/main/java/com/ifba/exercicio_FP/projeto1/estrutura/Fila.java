package com.ifba.exercicio_FP.projeto1.estrutura;

import com.ifba.exercicio_FP.projeto1.basica.Processo;

public class Fila {

    private Processo[] elementos;
    private int inicio;
    private int fim;

    public Fila(int tamanho) {
        elementos = new Processo[tamanho];
        inicio = 0;
        fim = 0;
    }

    public void adicionar(Processo processo) {

        if (fim == elementos.length) {
            System.out.println("Fila cheia!");
            return;
        }

        elementos[fim] = processo;
        fim++;
    }

    public Processo remover() {

        if (inicio == fim) {
            System.out.println("Fila vazia!");
            return null;
        }

        Processo processo = elementos[inicio];
        inicio++;

        return processo;
    }

    public Processo verificar() {

        if (inicio == fim) {
            System.out.println("Fila vazia!");
            return null;
        }

        return elementos[inicio];
    }

    public void mostrar() {

        for (int i = inicio; i < fim; i++) {
            elementos[i].mostrar();
            System.out.println("----------------");
        }
    }

    public void inverter() {

        Processo[] pilha = new Processo[fim - inicio];
        int topo = -1;

        while (inicio < fim) {
            topo++;
            pilha[topo] = elementos[inicio];
            inicio++;
        }

        inicio = 0;
        fim = 0;

        while (topo >= 0) {
            elementos[fim] = pilha[topo];
            fim++;
            topo--;
        }
    }
}