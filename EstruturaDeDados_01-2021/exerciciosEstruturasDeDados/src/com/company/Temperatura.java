package com.company;

import java.util.Scanner;

public class Temperatura {
    public  double media;
    public int maioresMedia = 0;
    public double semana[] = new double[7];

    public void obterTemperatura() {
        Scanner tc = new Scanner(System.in);

        for (int i = 0; i < semana.length; i++) {
            System.out.println("Digite a temperatura do dia "+ (i + 1));
            semana[i] = tc.nextInt();
        }
        System.out.println("Dados da semana coletados");
        calcularMedia();
        System.out.println("Média das temperaturas é: " + media);
    }

    public void calcularMedia() {
        double valor = 0;

        for (int x = 0; x < semana.length; x++) {
            valor = valor + semana[x];
        }
        media = valor / semana.length;
    }

    public void verificar() {
        for (int k = 0; k < semana.length; k++) {
            if (media > semana[k]) {
                maioresMedia++;
            }
        }
        System.out.println("Durante " + maioresMedia + " dias, a temperatura foi maior que a média");
    }
}
