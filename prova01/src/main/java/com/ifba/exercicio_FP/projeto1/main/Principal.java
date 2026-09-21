package com.ifba.exercicio_FP.projeto1.main;

import com.ifba.exercicio_FP.projeto1.basica.Processo;
import com.ifba.exercicio_FP.projeto1.estrutura.Fila;

public class Principal {

    public static void main(String[] args) {

        Fila fila = new Fila(3);

        Processo p1 = new Processo(1, "Documento 1");
        Processo p2 = new Processo(2, "Documento 2");
        Processo p3 = new Processo(3, "Documento 3");

        fila.adicionar(p1);
        fila.adicionar(p2);
        fila.adicionar(p3);

        System.out.println("\nPROCESSOS NA FILA:");
        fila.mostrar();

        System.out.println("\nPRIMEIRO PROCESSO:");
        fila.verificar().mostrar();

        System.out.println("\nREMOVENDO:");
        fila.remover().mostrar();

        System.out.println("\nFILA DEPOIS DA REMOÇÃO:");
        fila.mostrar();

        System.out.println("\n INVERTIMENTO FILA:");
        fila.inverter();
        fila.mostrar();
    }
}