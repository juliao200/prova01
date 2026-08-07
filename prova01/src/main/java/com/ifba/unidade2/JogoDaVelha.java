package com.ifba.unidade2;
import java.util.Scanner;

public class JogoDaVelha {

    private char[][] tabuleiro;
    private char jogador;
    private Scanner teclado;

    public JogoDaVelha() {

        tabuleiro = new char[3][3];
        teclado = new Scanner(System.in);
        jogador = 'X';

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                tabuleiro[i][j] = ' ';

            }

        }

    }

    public void iniciar() {

        int jogadas = 0;
        boolean venceu = false;

        while (!venceu && jogadas < 9) {

            mostrarTabuleiro();

            System.out.println("\nJogador: " + jogador);

            System.out.print("Linha (0-2): ");
            int linha = teclado.nextInt();

            System.out.print("Coluna (0-2): ");
            int coluna = teclado.nextInt();

            if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2) {

                System.out.println("Posição inválida!");
                continue;

            }

            if (tabuleiro[linha][coluna] != ' ') {

                System.out.println("Essa posição já está ocupada!");
                continue;

            }

            tabuleiro[linha][coluna] = jogador;
            jogadas++;

            venceu = verificarVencedor();

            if (!venceu) {

                trocarJogador();

            }

        }

        mostrarTabuleiro();

        if (venceu) {

            System.out.println("\nJogador " + jogador + " venceu!");

        } else {

            System.out.println("\nEmpate!");

        }

    }

    public void mostrarTabuleiro() {

        System.out.println();

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print(" " + tabuleiro[i][j] + " ");

                if (j < 2)
                    System.out.print("|");

            }

            System.out.println();

            if (i < 2)
                System.out.println("---+---+---");

        }

    }

    public boolean verificarVencedor() {

        for (int i = 0; i < 3; i++) {

            if (tabuleiro[i][0] == jogador &&
                tabuleiro[i][1] == jogador &&
                tabuleiro[i][2] == jogador) {

                return true;

            }

        }

        for (int i = 0; i < 3; i++) {

            if (tabuleiro[0][i] == jogador &&
                tabuleiro[1][i] == jogador &&
                tabuleiro[2][i] == jogador) {

                return true;

            }

        }

        if (tabuleiro[0][0] == jogador &&
            tabuleiro[1][1] == jogador &&
            tabuleiro[2][2] == jogador) {

            return true;

        }

        if (tabuleiro[0][2] == jogador &&
            tabuleiro[1][1] == jogador &&
            tabuleiro[2][0] == jogador) {

            return true;

        }

        return false;

    }

    public void trocarJogador() {

        if (jogador == 'X') {

            jogador = 'O';

        } else {

            jogador = 'X';

        }

    }

}
