package com.company;

import java.util.Scanner;

public class Exerc07Docs02 {
    /*int matriz [][] = new int[5][5];

    private int moda() {
        int contador = 0;
        int qtdModa = 0;
        int moda;
        int modaProvavel = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int x = 0; x < matriz[i].length; x++) {
                if (modaProvavel == matriz[i][x]) {
                    contador++;
                }
            }
            if (contador>qtdModa) {
                qtdModa = contador;
                moda = modaProvavel;
            }
        }

    }

    public int mediana() {

    }

    public double media() {
        int total = 0;
        double media;
        for (int i = 0; i < matriz.length; i++) {
            for (int x = 0; x < matriz[i].length; x++) {
                total+= matriz[i][x];
                //total = total + matriz[i][x];
            }
        }
        media = total/(5 * 5);
        return media;
    }

    public void menu() {
        Scanner tc = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            for (int x = 0; x < matriz[i].length; x++) {
                System.out.println();
                matriz[i][x] = tc.nextInt();
            }
        }
    }*/

    /*apartir daqui é a resolução do Ramon no Git*/

    /*import java.util.Random;

public class Estatistica {
    /*
 Escreva	 uma	 classe Estatística	 em	 Java	 que	 faça a leitura de uma Matriz 5x5, a classe deve ao final mostrar:
A moda	dos	elementos	no	array	(elemento	mais	freqüente).
A mediana	dos	elementos	no	array	(elemento	central).
 A média.
     */


    /*public static void main(String[] args) {
        int [][] matriz= new int[5][5];
        int l,c;
        int[] vetor=new int[25];
        for(l=0;l<5;l++){
            for(c=0;c<5;c++){
                Random rand= new Random();
                matriz[l][c]=rand.nextInt(10);
            }
        }

        /////////////DESCOBRIR A MEDIANA
        int i=0;
        for(l=0;l<5;l++){
            for(c=0;c<5;c++){
                vetor[i]=matriz[l][c];
                i++;
            }
        }
        for (i=0;i<25;i++){
            for (int j=i+1;j<25;j++){
                if(vetor[i]>vetor[j]){
                    int temp=vetor[j];
                    vetor[j]=vetor[i];
                    vetor[i]=temp;
                }
            }
        }
        for (i=0;i<25;i++){
            System.out.print(vetor[i]);
        }
        System.out.println("Mediana "+vetor[25/2]);


////////////Descobrindo a Média

        int total=0;
        for(l=0;l<5;l++){
            for(c=0;c<5;c++){
                total+=matriz[l][c];
                System.out.print(matriz[l][c]+ " |");
            }
            System.out.println("");
        }
        System.out.println(total/25+" média");
    }


    ///Descobrindo a moda


}*/
}
