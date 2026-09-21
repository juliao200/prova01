package com.ifba.exercicio_FP.projeto3.main;

import com.ifba.exercicio_FP.projeto3.basica.Processo;
import com.ifba.exercicio_FP.projeto3.estrutura.Pilha;

public class Principal {

    public static void main(String[] args) {

        Pilha pilha = new Pilha(3);

        Processo p1 = new Processo(1, "Documento 1");
        Processo p2 = new Processo(2, "Documento 2");
        Processo p3 = new Processo(3, "Documento 3");

        pilha.empilhar(p1);
        pilha.empilhar(p2);
        pilha.empilhar(p3);

        System.out.println("PILHA:");
        pilha.imprimir();

        System.out.println("\nTOPO DA PILHA:");
        pilha.verificarTop().mostrar();

        System.out.println("\nDESEMPILHANDO:");
        pilha.desempilhar().mostrar();

        System.out.println("\nPILHA DEPOIS:");
        pilha.imprimir();
    }
}