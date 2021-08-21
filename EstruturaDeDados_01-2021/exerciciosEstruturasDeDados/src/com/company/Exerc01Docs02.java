package com.company;
/*01 - Escreva uma classe que Leia 5 nomes e notas de uma turma, calcula e exibe a
        média das notas da turma e em seguida exibe a relação de nomes cuja nota é
        superior a esta média. Utilize vetores para armazenar as notas.*/

import java.util.Scanner;

public class Exerc01Docs02 {
    public static int tamanho2 = 5;
    double notas[] = new double[tamanho2];
    String nomes[] = new String[tamanho2];
    double media = 0.0;

    public void menu() {
        Scanner tc = new Scanner(System.in);

        for (int x = 0; x < tamanho2; x++) {
            System.out.println("Digite o nome do aluno ");
            nomes[x] = tc.nextLine();
            System.out.println("Digite a nota ");
            notas[x] = Double.parseDouble(tc.nextLine());
        }
        mediaNotas();
        exibirNomesMaioresMedia();
    }

    public void mediaNotas() {
        double soma = 0;

        for (int y = 0; y < tamanho2; y++) {
            soma = soma + notas[y];
        }
        media = (soma / tamanho2);
        System.out.println("A média é " + media);
    }

    public void exibirNomesMaioresMedia() {
        for (int k = 0; k < tamanho2; k++) {
            if (notas[k] > media) {
                System.out.println(nomes[k] + " tem a nota " + notas[k]);
            }
        }
    }
}
