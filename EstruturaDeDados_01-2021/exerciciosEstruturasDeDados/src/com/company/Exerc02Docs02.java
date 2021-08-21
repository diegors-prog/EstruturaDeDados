package com.company;
/*02 - Leia um conjunto de notas, cuja quantidade seja determinada pelo usuário. Calcule
        a média de todas elas. Exiba o conjunto das notas maiores do que a média
        calculada. Em seguida, de forma agrupada, exiba o outro conjunto de notas
        (menores do que a média).Utilize vetores*/

import java.util.ArrayList;
import java.util.Scanner;

public class Exerc02Docs02 {
    private ArrayList<Double> arrayDeNotas = new ArrayList<Double>();

    public double somaValores() {
        double soma = arrayDeNotas.stream().reduce((double) 0, (element1, element2) -> element1 + element2);
        return soma;
    }

    public double mediaValores() {
        return somaValores() / arrayDeNotas.size();
    }

    public void mostrarResultado() {
        for (int x = 0; x < arrayDeNotas.size(); x++) {
            if (arrayDeNotas.get(x) > mediaValores()) {
                System.out.println((x + 1) + "º é maior que a média, e tem pontuação de " + arrayDeNotas.get(x));
            }
            if (arrayDeNotas.get(x) < mediaValores()) {
                System.out.println((x + 1) + "º é menor que a média, e tem pontuação de " + arrayDeNotas.get(x));
            }
        }
    }

    public void menu() {
        Scanner tc = new Scanner(System.in);
        double valor = 0;

        System.out.println("Digite as notas, e para ver os resultados digite 99");

        do {
            System.out.println("Digite uma nota ");
            valor = Double.parseDouble(tc.nextLine());
            if (valor != 99) {
                arrayDeNotas.add(valor);
            } else {
                System.out.println("Sistema encerro");
            }


        }while (valor != 99);
        mostrarResultado();
    }
}
