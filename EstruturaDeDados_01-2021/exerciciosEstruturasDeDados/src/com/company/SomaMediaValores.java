package com.company;

import sun.security.mscapi.CPublicKey;

import java.util.ArrayList;
import java.util.Scanner;

public class SomaMediaValores {
    private ArrayList<Integer> listaDeValores = new ArrayList<Integer>();

    public int somaValores() {
        int soma = listaDeValores.stream().reduce(0, (element1, element2) -> element1 + element2);
        return soma;
    }

    public double mediaValores() {
        return somaValores() / listaDeValores.size();
    }

    public void menu() {
        Scanner tc = new Scanner(System.in);
        int valor = 0;

        do {
            System.out.println("Digite um número inteiro");
            valor = tc.nextInt();
            listaDeValores.add(valor);

        }while (valor != 99);
        System.out.println(somaValores());
        System.out.println(mediaValores());
    }
}
