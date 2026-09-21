package com.ifba.exercicio_FP.projeto2.basico;

public class Processo {

    private int pid;
    private String conteudo;

    public Processo(int pid, String conteudo){
        this.pid = pid;
        this.conteudo = conteudo;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

     public void mostrar(){
        System.out.println("PID: " + pid);
        System.out.println("Conteudo: " + conteudo);
    }
}

