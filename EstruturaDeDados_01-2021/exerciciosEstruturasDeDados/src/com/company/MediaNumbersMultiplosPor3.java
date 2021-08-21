package com.company;
/*04 - Escrever um programa que receba vários números inteiros no teclado e no final
        imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero)*/

import java.util.ArrayList;
import java.util.Scanner;

public class MediaNumbersMultiplosPor3 {
    private ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
    private ArrayList<Integer> multiplosPor3 = new ArrayList<Integer>();

    public void filtrandoArray() {
        for (Integer numero : listaNumeros) {
            if (numero % 3 == 0) {
                multiplosPor3.add(numero);
            }
        }
    }
    public double somaArray() {
        filtrandoArray();
        double soma = multiplosPor3.stream().reduce(0, (element1, element2) -> element1 + element2);
        return soma;
    }

    public double mediaNumerosArray() {
        return somaArray() / multiplosPor3.size();
    }

    public void menu() {
        Scanner tc = new Scanner(System.in);
        int fechaSistema = 0;

        do {
            System.out.println("Digite um número inteiro: ");
            fechaSistema = tc.nextInt();
            if (fechaSistema != 0) {
                listaNumeros.add(fechaSistema);
            } else {
                System.out.println("programa encerrado");
            }


        } while (fechaSistema != 0);
        System.out.println(mediaNumerosArray());
    }
}
