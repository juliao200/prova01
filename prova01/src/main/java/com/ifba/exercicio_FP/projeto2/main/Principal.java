package com.ifba.exercicio_FP.projeto2.main;


import java.util.Queue;

import com.ifba.exercicio_FP.projeto2.basico.Processo;

import java.util.LinkedList;

public class Principal {

    public static void main(String[] args) {

        Queue<Processo> fila = new LinkedList<>();

        Processo p1 = new Processo(1, "Documento 1");
        Processo p2 = new Processo(2, "Documento 2");
        Processo p3 = new Processo(3, "Documento 3");

        fila.add(p1);
        fila.add(p2);
        fila.add(p3);

        System.out.println("FILA:");

        for (Processo p : fila) {
            p.mostrar();
            System.out.println("----------------");
        }

        System.out.println("PRIMEIRO PROCESSO:");
        fila.peek().mostrar();

        System.out.println("\nREMOVENDO:");
        fila.poll().mostrar();

        System.out.println("\nFILA DEPOIS DA REMOCAO:");

        for (Processo p : fila) {
            p.mostrar();
            System.out.println("----------------");
        }
    }
}