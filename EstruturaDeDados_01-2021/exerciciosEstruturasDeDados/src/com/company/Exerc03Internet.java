package com.company;
/*03 - Capture do teclado valores para preenchimento de uma matriz M 3x3. Após a captura imprima
        a matriz criada e encontre a quantidade de números pares, e a quantidade de números ímpares*/

import java.util.Scanner;

public class Exerc03Internet {
    int [][] numerosAleatorios = new int[3][3];
    int numerosPares = 0;
    int numerosImpares = 0;

    private void calculoNumerosParesImpares() {
        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int x = 0; x < numerosAleatorios[i].length; x ++) {
                if (numerosAleatorios[i][x] % 2 == 0) {
                    numerosPares++;
                } else {
                    numerosImpares++;
                }
            }
        }
        System.out.println("A quantidade de números pares na matriz é " + numerosPares);
        System.out.println("A quantidade de números ímpares na matriz é " + numerosImpares);
    }

    private void mostrar() {
        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int x = 0; x < numerosAleatorios[i].length; x ++) {
                System.out.print(numerosAleatorios[i][x] + " ");
            }
            System.out.println();
        }
        calculoNumerosParesImpares();
    }

    public void menu() {
        Scanner tc = new Scanner(System.in);

        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int x = 0; x < numerosAleatorios[i].length; x ++) {
                System.out.println("Digite o valor da posição " + i + ", " + x + " da matriz");
                numerosAleatorios[i][x] = tc.nextInt();
            }
        }
        mostrar();
    }
}
