package com.company;

public class Main {

    public static void main(String[] args) {
        int[] vetor = new int[10];
        //Preencher o vetor c/ números aleatórios
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) Math.floor(Math.random() * vetor.length);
        }

        //Imprimir vetor desordenado
        System.out.println("\nVetor desordenado");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i] + " ");
        }

        //Heap Sort
        int tamanho = vetor.length;
        for (int i = tamanho / 2 -1; i >= 0; i--) {
            aplicarHeap(vetor, tamanho, i);
        }

        //Imprimir ordenado pela metade
        System.out.println("\nSelecionou os maiores elementos do vetor");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i] + " ");
        }

        for (int k = tamanho - 1; k > 0; k--) {
            int aux = vetor[0];
            vetor[0] = vetor[k];
            vetor[k] = aux;

            aplicarHeap(vetor, k, 0);
        }
        //Imprimir vetor ordenado
        System.out.println("\nVetor ordenado");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i] + " ");
        }
    }
    private static void aplicarHeap(int[] vet, int n, int j) {
        int raiz = j;
        int esquerda = 2*j +1;
        int direita = 2*j +2;

        if (esquerda < n && vet[esquerda] > vet[raiz]) {
            raiz = esquerda;
        }
        if (direita < n && vet[direita] > vet[raiz]) {
            raiz = direita;
        }

        if (raiz != j) {
            int aux = vet[j];
            vet[j] = vet[raiz];
            vet[raiz] = aux;

            aplicarHeap(vet, n, raiz);
        }
    }
}
