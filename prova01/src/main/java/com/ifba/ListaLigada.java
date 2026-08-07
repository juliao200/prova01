package com.ifba;

public class ListaLigada {

        private Celula cabeca;
        private Celula cauda;

    public ListaLigada(Celula cabeca, Celula cauda) {

        this.cabeca = cabeca;
        this.cauda = cauda;
    }

    public ListaLigada() {
    }

    public Celula getCabeca() {
        return cabeca;
        
    }

    public void setCabeca(Celula cabeca) {
        this.cabeca = cabeca;
    }

    public Celula getCauda() {
        return cauda;
    }

    public void setCauda(Celula cauda) {
    this.cauda = cauda;
    }
    
    public void inserir(int valor) {
        Celula novaCelula = new Celula(valor);

        if (cabeca == null) {
            cabeca = novaCelula;
            cauda = novaCelula;
        } else {
            cauda.setProxima(novaCelula);
            cauda = novaCelula;
        }

    }

    public void inserirNoComeco(int valor) {
        Celula novaCelula = new Celula(valor);

        if (cabeca == null) {
            cabeca = novaCelula;
            cauda = novaCelula;
        } else {
            novaCelula.setProxima(cabeca);
            cabeca = novaCelula;
        }

    }

    public void inserirPorPosicao(int valor, int posicao) {

        if (posicao < 0) {
            System.out.println("Posição inválida!");
            return;
        }

        if (posicao == 0) {
            inserirNoComeco(valor);
            return;
        }

        Celula novaCelula = new Celula(valor);
        Celula atual = cabeca;
        int indice = 0;

        while (atual != null && indice < posicao - 1) {
            atual = atual.getProxima();
            indice++;
        }
        if (atual == null) {
            System.out.println("Posição inválida!");
            return;

        }
        
        if (atual == cauda) {
            inserir(valor);
        } else {

            novaCelula.setProxima(atual.getProxima());
        
            atual.setProxima(novaCelula);
        }
        
    }
        public void imprimirLista() {
            if (cabeca == null) {
            System.out.println("A lista está vazia.");
            return;

        }

        Celula atual = cabeca;

        while (atual != null) {
                System.out.print(atual.getElemento() + " -> ");
                atual = atual.getProxima();
        }
            System.out.println("null");

    }

    public void removerCebeca(){
        if(cabeca == null){
            System.out.println("A lista esta vazia");
            return;
        }
        cabeca = cabeca.getProxima();
        if (cabeca == null){

        }
    }
    
    public void removerCauda(){
        if (cabeca == null){
            System.out.println("A lista esta vazia");
            return;
        }

        if(cabeca == cauda){
            cabeca = null;
            cauda = null;
            return;
        }

        Celula atual = cabeca;

        while (atual.getProxima() != cauda){
            atual = atual.getProxima();

        }

        cauda = atual;

        cauda.setProxima(null);
    }

    public void removerPosicao(int posicao){
        if (cabeca == null){
            return;
        }

        if(posicao == 0 ){
            return;
        }

        Celula atual = cabeca;

        for(int i = 0; i < posicao - 1; i++){
            atual = atual.getProxima();
        }

        if (atual.getProxima() == cauda){
            removerCauda();
        } else {
            atual.setProxima(atual.getProxima().getProxima());
        }
    }
}