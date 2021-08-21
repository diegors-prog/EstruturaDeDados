package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class LerIdades {
    private ArrayList<Integer> listaDeIdades = new ArrayList<Integer>();

    public double mediaDeIdade() {
        if (listaDeIdades.size() == 0) {
            return 0.0;
        }

        int somaIdades = listaDeIdades.stream().reduce(0, (element1, element2) -> element1 + element2);


        return somaIdades / listaDeIdades.size();
    }

    public void menu() {
        Scanner tc = new Scanner(System.in);

        while (listaDeIdades.size() <=9 && mediaDeIdade() <= 20){
            System.out.println("Digite sua idade: ");
            int valor = tc.nextInt();
            listaDeIdades.add(valor);
        }
        System.out.println(mediaDeIdade());
    }
}
