package com.company;

public class OrdenacaoBinaria {
    private int[] vetor = new int[20];
    public void preencherVetor() {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) Math.floor(Math.random() * vetor.length);
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i] + " ");
        }
    }
}
