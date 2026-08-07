package com.ifba;

public class MainLista {
    public static void main(String[] args) {

        ListaLigada lista = new ListaLigada();

        lista.inserir(10);
        lista.inserir(20);
        lista.inserir(30);

        lista.inserirNoComeco(5);

        lista.inserirPorPosicao(15, 2);
        
        lista.imprimirLista();
        }
    
}
