package com.company;

import java.util.Random;

public class Exerc02Internet {
    int[][] numerosAleatorios = new int[10][10];
    int maiorL5 = Integer.MIN_VALUE;
    int menorL5 = Integer.MAX_VALUE;
    int maiorC7 = Integer.MIN_VALUE;
    int menorC7 = Integer.MAX_VALUE;

    Random numeroRandom = new Random();

    private void maiorMenorNumLinha5() {
        int linha5 = 5;

        for (int i = 0; i < numerosAleatorios[linha5].length; i++) {
            if (numerosAleatorios[linha5][i] > maiorL5) {
                maiorL5 = numerosAleatorios[linha5][i];
            }
            if (numerosAleatorios[linha5][i] < menorL5) {
                menorL5 = numerosAleatorios[linha5][i];
            }
        }
    }

    private void maiorMenorNumColuna7() {
        int coluna7 = 7;

        for (int x = 0; x < numerosAleatorios.length; x++) {
            if (numerosAleatorios[x][coluna7] > maiorC7) {
                maiorC7 = numerosAleatorios[x][coluna7];
            }
            if (numerosAleatorios[x][coluna7] < menorC7) {
                menorC7 = numerosAleatorios[x][coluna7];
            }
        }
    }

    private void mostrar() {
        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int x = 0; x < numerosAleatorios[i].length; x ++) {
                System.out.print(numerosAleatorios[i][x] + " ");
            }
            System.out.println();
        }
        System.out.println("Maior valor na linha 5 = " + maiorL5);
        System.out.println("Menor valor na linha 5 = " + menorL5);
        System.out.println("Maior valor na coluna 7 = " + maiorC7);
        System.out.println("Menor valor na coluna 7 = " + menorC7);
    }

    public void menu() {
        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int x = 0; x < numerosAleatorios[i].length; x++) {
                numerosAleatorios[i][x] = numeroRandom.nextInt(100);
            }
        }
        maiorMenorNumLinha5();
        maiorMenorNumColuna7();
        mostrar();
    }
}
