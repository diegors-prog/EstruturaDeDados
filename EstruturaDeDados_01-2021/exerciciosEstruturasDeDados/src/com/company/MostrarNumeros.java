package com.company;

public class MostrarNumeros {
    public int arrayNumeros[] = new int[50];
    public int valor = 101;

    public void receber() {
        for (int i=0; i<50; i++) {
            arrayNumeros[i] = valor;
            valor++;
        }
    }

    public void mostrar() {
        for (int x=0; x<50; x++) {
            System.out.println(arrayNumeros[x]);
        }
    }
}
