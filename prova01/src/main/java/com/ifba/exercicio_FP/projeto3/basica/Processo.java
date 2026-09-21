package com.ifba.exercicio_FP.projeto3.basica;

public class Processo {

    private int pid;
    private String conteudo;

    public Processo(int pid, String conteudo){
        this.pid = pid;
        this.conteudo = conteudo;
    }

    public void mostrar(){
        System.out.println("PID: " + pid);
        System.out.println("Conteudo: " + conteudo);
    }
    
}
