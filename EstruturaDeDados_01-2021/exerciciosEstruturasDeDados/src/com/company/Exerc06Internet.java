package com.company;
/*06 - Faça um programa para jogar o jogo da velha. O programa deve permitir
        * que dois jogadores façam uma partida do jogo da velha, usando o computador
        * para ser o tabuleiro. Cada jogador vai alternadamente informando a posição
        * onde deve colocar a sua peça ('0' ou 'X'). O programa deve impedir jogadas
        * inválidas e determinar automáticamente quando o jogo terminou e quem foi o
        vencedor (jogador1 ou jogador2). A cada nova jogada, o programa deve atualizar
        a situação do tabuleiro na tela.*/

import java.util.Scanner;

public class Exerc06Internet {
    Scanner tc = new Scanner(System.in);
    char[][] jogoVelha = new char[3][3];
    boolean ganhou = false;
    int linha = 0, coluna = 0;
    char sinal;
    int jogada = 1;

    private void validarLinha() {
        boolean linhaValida = false;
        while (!linhaValida) {
            System.out.println("Entre com a linha (1, 2 ou 3)");
            linha = tc.nextInt();
            if (linha >= 1 && linha <= 3) {
                linhaValida = true;
            } else {
                System.out.println("Entrada inválida, tente novamente");
            }
        }
    }

    private void validarColuna() {
        boolean colunaValida = false;
        while (!colunaValida) {
            System.out.println("Entre com a coluna (1, 2 ou 3");
            coluna = tc.nextInt();
            if (coluna >= 1 && coluna <= 3) {
                colunaValida = true;
            } else {
                System.out.println("Entrada inválida, tente novamente");
            }
        }
    }

    private void validarJogada() {
        linha--;
        coluna--;
        if (jogoVelha[linha][coluna] == 'X' || jogoVelha[linha][coluna] == 'O') {
            System.out.println("Posição já usada, tente novamente");
        } else {
            jogoVelha [linha][coluna] = sinal;
            jogada++;
        }
    }

    private void mostrarJogo() {
        for (int i = 0; i < jogoVelha.length; i++) {
            for (int x = 0; x < jogoVelha[i].length; x++) {
                System.out.print(jogoVelha[i][x] + " | ");
            }
            System.out.println();
        }
    }

    private void verificarGanhador() {
        if ((jogoVelha[0][0] == 'X' && jogoVelha[0][1] == 'X' && jogoVelha[0][2] == 'X') ||
                (jogoVelha[1][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[1][2] == 'X') ||
                (jogoVelha[2][0] == 'X' && jogoVelha[2][1] == 'X' && jogoVelha[2][2] == 'X') ||
                (jogoVelha[0][0] == 'X' && jogoVelha[1][0] == 'X' && jogoVelha[2][0] == 'X') ||
                (jogoVelha[0][1] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][1] == 'X') ||
                (jogoVelha[0][2] == 'X' && jogoVelha[1][2] == 'X' && jogoVelha[2][2] == 'X') ||
                (jogoVelha[0][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][2] == 'X')) {
            ganhou = true;
            System.out.println("Parabéns, jogador 1 ganhou");
        } else if ((jogoVelha[0][0] == 'O' && jogoVelha[0][1] == 'O' && jogoVelha[0][2] == 'O') ||
                (jogoVelha[1][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[1][2] == 'O') ||
                (jogoVelha[2][0] == 'O' && jogoVelha[2][1] == 'O' && jogoVelha[2][2] == 'O') ||
                (jogoVelha[0][0] == 'O' && jogoVelha[1][0] == 'O' && jogoVelha[2][0] == 'O') ||
                (jogoVelha[0][1] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][1] == 'O') ||
                (jogoVelha[0][2] == 'O' && jogoVelha[1][2] == 'O' && jogoVelha[2][2] == 'O') ||
                (jogoVelha[0][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][2] == 'O')) {
            ganhou = true;
            System.out.println("Parabéns, jogador 2 ganhou");
        } else if (jogada > 9){
            ganhou = true;
            System.out.println("Não houve vencedor");
        }
    }

    public void menu() {
        System.out.println("Jogador 1 = X");
        System.out.println("Jogador 2 = O");

        while (!ganhou) {
            if (jogada % 2 == 1) {
                System.out.println("Vez do jogador 1. Escolha linha e coluna (1-3).");
                sinal = 'X';
            } else {
                System.out.println("Vez do jogador 2. Escolha linha e coluna (1-3).");
                sinal = 'O';
            }
            validarLinha();
            validarColuna();
            validarJogada();
            mostrarJogo();
            verificarGanhador();
        }
    }
}

