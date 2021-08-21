package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Lista novaLista = new Lista();

	    novaLista.adicionar("AC");
        novaLista.adicionar("BA");
        novaLista.adicionar("CE");
        novaLista.adicionar("DF");

        System.out.println("Quantidade de itens: " + novaLista.getTamanho());
        System.out.println("Primeiro item: " + novaLista.getPrimeiro().getValor());
        System.out.println("Último item: " + novaLista.getUltimo().getValor());

        for (int i = 0; i < novaLista.getTamanho(); i++) {
            System.out.println(novaLista.get(i).getValor());
        }

        novaLista.remover("CE");
        System.out.println("");

        for (int i = 0; i < novaLista.getTamanho(); i++) {
            System.out.println(novaLista.get(i).getValor());
        }

    }
}
