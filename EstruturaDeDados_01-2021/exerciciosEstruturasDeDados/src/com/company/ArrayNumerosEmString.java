package com.company;
/*06 - Escreva um programa que crie um array de inteiros data e use um laço for
        para criar um novo String que exiba o conteúdo do array data entre chaves e separado
        por vírgulas. Por exemplo, se o array data tiver tamanho 4 e armazenar os
        valores 3, 4, 1, 5, o String “{3, 4, 1, 5}” deve ser criado e exibido.*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayNumerosEmString {
    private ArrayList<Integer> arrayNumeros = new ArrayList<Integer>();

    public String converteArrays() {
        String datasString = "";
        for (int counter = 0; counter <= arrayNumeros.size() - 1; counter ++) {
            if (counter == 0) {
                datasString = "{" +arrayNumeros.get(counter).toString();
            } else if (counter == arrayNumeros.size() - 1){
                datasString += "," + arrayNumeros.get(counter).toString() + "}";
            } else {
                datasString += "," + arrayNumeros.get(counter).toString();
            }

        }
        return datasString;
    }


    public void menu() {
        Scanner tc = new Scanner(System.in);

        while (arrayNumeros.size() <= 4) {
            System.out.println("Digite um número de 1 a 30 aleatóriamente  ");
            int valor = tc.nextInt();
            arrayNumeros.add(valor);
        }
        System.out.println(converteArrays());
}

}