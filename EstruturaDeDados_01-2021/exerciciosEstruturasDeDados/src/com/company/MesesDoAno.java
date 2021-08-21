package com.company;

import java.util.Random;
import java.util.Scanner;

/*08 - Crie uma classe que armazena os 12 meses do ano em um array. A seguir, gere um valor
        randômico entre 0 e 11 e apresente o mês correspondente ao valor sorteado. Considere que o
        valor 0 corresponde ao mês de janeiro e o valor 11, ao mês de dezembro.*/

public class MesesDoAno {
    public String arrayMeses[] = new String[11];
    Random aleatorio = new Random();

    public void menu() {
        Scanner tc = new Scanner(System.in);

        for (int i = 0; i <= arrayMeses.length; i++) {
            System.out.println("Digite os meses do ano de janeiro a dezembro ");
        }
    }
}
