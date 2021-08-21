package com.company;
/*01 - Faça um programa para ler uma matriz 4 por 4, contendo os valores de notas de g1, e
        outro de g2. Ao final, o programa deve mostrar as médias dos alunos, mostrando se o
        aluno está aprovado, em exame ou reprovado. Considere média > 7 para aprovação,7 <
        média >6 para exame; e < 6 como reprovado. Importante deve ser validado que as notas
        aceitas sejam de 0 a 10.*/

import java.util.Scanner;

public class Exerc01Docs03Matriz {
    Scanner tc = new Scanner(System.in);
    double[][] matrizNotas = new double[4][2];
    double[] vetorSoma = new double[4];

    private void calcularMedia() {
        double soma = 0;
        for (int x = 0; x < matrizNotas.length; x++) {
            for (int i = 0; i < matrizNotas[x].length; i++) {
                soma = matrizNotas[x][0] + matrizNotas[x][1];
                vetorSoma[x] = soma;
                soma = 0;
            }
        }
    }

    public void menu() {
        for (int x = 0; x < matrizNotas.length; x++) {
            for (int i = 0; i < matrizNotas[x].length; i++) {
                System.out.println("Digite as notas de g1 e g2 de cada aluno ");
                matrizNotas[x][i] = Double.parseDouble(tc.nextLine());
            }
            System.out.println(vetorSoma);
        }
    }
}
