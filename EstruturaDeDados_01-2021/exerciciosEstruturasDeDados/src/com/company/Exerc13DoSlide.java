package com.company;

import java.util.Scanner;

public class Exerc13DoSlide {
    public static int tamanho = 10;
    int numeros[] = new int[tamanho];
    int totalNumbers = 0;

    public void obterNumeros() {
        Scanner tc = new Scanner(System.in);
        for (int x = 0; x < tamanho; x++) {
            System.out.println("Digite um número inteiro ");
            numeros[x] = tc.nextInt();
        }
    }

    public void mostrarNumerosMaiores50() {
        Scanner tc = new Scanner(System.in);
        for (int y = 0; y < tamanho; y++) {
            if (numeros[y] > 50) {
                totalNumbers++;
            }
        }
        System.out.println("Quantidade de números maiores que 50 é: " + totalNumbers);
    }

    public void mostrarPosicao() {
        for (int k = 0; k < tamanho; k++) {
            if (numeros[k] > 50) {
                System.out.println((k + 1) + "º número tem o valor de " + numeros[k]);
            }
        }
    }

    public void exibirInfos() {
        mostrarNumerosMaiores50();
        if (totalNumbers > 0) {
            mostrarPosicao();
        } else {
            System.out.println("Não existem números maiores que 50");
        }
    }
}
