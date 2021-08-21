package com.company;

import java.util.Scanner;

public class Pilha {
    private int[] vetor = new int[10];
    private int qtd = 0;

    private boolean isFull(int vet[]) {
        if (qtd >= vet.length) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isEmpty(int vet[]) {
        if (qtd == 0) {
            return true;
        } else {
            return false;
        }
    }

    private void mostrarTodasPosicoesVetor(int vet[]) {
        for (int x = 0; x < vet.length; x++) {
            System.out.println(vet[x]);
        }
    }

    private void mostrarPosicoesPreenchidasVetor(int vet[]) {
        if (qtd > 0) {
            for (int x = 0; x < qtd; x++) {
                System.out.println(vet[x]);
            }
        } else {
                System.out.println("Vetor vazio\n");
        }
    }

    private void addValoresInicioVetor(int vet[], int value) {
        if (isFull(vet)){
            System.out.println("Vetor cheio, impossível adicionar mais valores\n");
        } else {
            for (int i = qtd; i >= 0; i--) {
                vet[i + 1] = vet[i];
            }
            vet[0] = value;
            qtd++;
        }

    }

    private void addValoresFinalVetor(int vet[], int value) {
        if (isFull(vet)) {
            System.out.println("Vetor cheio, impossível adicionar mais valores!\n");
        } else {
            vet[qtd] = value;
            qtd++;
        }
    }

    private void removerValoresFinalVetor(int vet[]) {
        if (isEmpty(vet)) {
            System.out.println("Vetor vazio, impossível remover valores!\n");
        } else {
            vet[qtd - 1] = 0;
            qtd--;
        }
    }

    private void removerValoresInicioVetor(int vet[]) {
        if (isEmpty(vet)) {
            System.out.println("Vetor vazio, impossível remover valores!\n");
        } else {
            for (int i = 0; i < qtd; i++) {
                vet[i] = vet[i + 1];
            }
            vet[qtd - 1] = 0;
            qtd--;
        }
    }

    public void menu() {
        int opcao = 0;
        do {
            Scanner tc = new Scanner(System.in);

            System.out.println("Para sair do programa digite 99\n");
            System.out.println("Digite 1 para mostrar todo o vetor");
            System.out.println("Digite 2 para mostrar somente as posições preenchidas do vetor");
            System.out.println("Digite 3 para adicionar um valor no final do vetor");
            System.out.println("Digite 4 para adicionar um valor no inicio do vetor");
            System.out.println("Digite 5 para remover um valor do final do vetor");
            System.out.println("Digite 6 para remover um valor do inicio do vetor");

            opcao = tc.nextInt();
            switch (opcao) {
                case 1:
                    mostrarTodasPosicoesVetor(vetor);
                    break;
                case 2:
                    mostrarPosicoesPreenchidasVetor(vetor);
                    break;
                case 3:
                    int valorFinal = 0;
                    System.out.println("Digite o valor a ser adicionado no vetor");
                    valorFinal = tc.nextInt();
                    addValoresFinalVetor(vetor, valorFinal);
                    System.out.println("Valor adicionado com sucesso!\n");
                    break;
                case 4:
                    int valorInicio = 0;
                    System.out.println("Digite o valor a ser adicionado no vetor");
                    valorInicio = tc.nextInt();
                    addValoresInicioVetor(vetor, valorInicio);
                    System.out.println("Valor adicionado com sucesso!\n");
                    break;
                case 5:
                    removerValoresFinalVetor(vetor);
                    System.out.println("Valor removido com sucesso!\n");
                    break;
                case 6:
                    removerValoresInicioVetor(vetor);
                    System.out.println("Valor removido com Sucesso!\n");
                    break;
            }
        }while (opcao != 99);

    }
}
