package com.company;
/*07 - Elabore uma classe que receba 5 notas de alunos por meio, armazene essas notas
        em um array de cinco elementos, apresente em tela as cinco notas em ordem decrescente
        (da maior para a menor) e a média aritmética das notas.*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MediaDasCincoNotas {
    private List<Double> arrayNotas = new ArrayList<Double>();
    double media = 0.0;

    public void ordenarArrayEmDecrecente() {
        Collections.sort(arrayNotas, Collections.reverseOrder());

        for (int x = 0; x < arrayNotas.size(); x ++) {
            System.out.println(arrayNotas.get(x));
        }
    }

    public double somarNotas() {
        double soma = 0;
        for (int y = 0; y <= 4; y++) {
            soma = soma + arrayNotas.get(y);
        }
        return soma;
    }

    public double mediaNotas() {
        media = somarNotas() / arrayNotas.size();
        return media;
    }

    public void menu() {
        Scanner tc = new Scanner(System.in);

        for (int i = 0; i <= 4; i++) {
            System.out.println("Digite a nota "+(i + 1));
            arrayNotas.add(Double.parseDouble(tc.nextLine()));
        }
        ordenarArrayEmDecrecente();
        System.out.println("A média das notas é " + mediaNotas());
    }

}
