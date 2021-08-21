package com.company;

import java.util.Random;

public class Exerc01Internet {
    int [][] numerosAleatorios = new int[4][4];
    int maior = Integer.MIN_VALUE;
    int linha = 0;
    int col = 0;

    Random numeroRandom = new Random();

    private void maiorNumLinhaColuna() {
        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int x = 0; x < numerosAleatorios[i].length; x ++) {
                if (numerosAleatorios[i][x] > maior) {
                    maior = numerosAleatorios[i][x];
                    linha = i;
                    col = x;
                }
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
        System.out.println("Maior valor = " + maior);
        System.out.println("Linha = " + linha);
        System.out.println("Coluna = " + col);
    }

    public void menu() {
        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int x = 0; x < numerosAleatorios[i].length; x ++) {
                numerosAleatorios[i] [x] = numeroRandom.nextInt(100);
            }
        }
        maiorNumLinhaColuna();
        mostrar();
    }
}
