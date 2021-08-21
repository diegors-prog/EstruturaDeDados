package com.company;
/*04 - Faça um programa para armazenar em uma matriz os COMPROMISSOS de uma agenda pessoal. Cada
        dia do mês deve conter 24 horas, onde para cada uma destas 24 horas podemos associar uma tarefa
        específica (compromisso agendado). O programa dever ter um menu onde o usuário indica o dia do mês
        que deseja alterar a hora, entrando em seguida com o compromisso, ou então, o usuário pode também
        consultar a agenda, fornecendo o dia e a hora para obter o comrpromisso armazenado.*/

import java.util.Scanner;

public class Exerc04Internet {
    Scanner tc = new Scanner(System.in);
    String[][] compromissos = new String[31][24];
    int dia = 0;
    int hora = 0;


    private void validarDia() {
        boolean diaValido = false;

        while (!diaValido) {
            System.out.println("Entre com o dia do mês ");
            dia = tc.nextInt();
            if (dia >= 0 && dia <= 31) {
                diaValido = true;
            } else {
                System.out.println("Dia inválido, digite novamente");
            }
        }
    }

    private void validarHora() {
        boolean horaValida = false;

        while (!horaValida) {
            System.out.println("Entre com a hora do compromisso ");
            hora = tc.nextInt();
            if (hora > 0 && hora <= 24) {
                horaValida = true;
            } else {
                System.out.println("Hora inválida, digite novamente");
            }
        }
    }

    private void adicionarCompromisso() {
        dia--;
        System.out.println("Digite o compromisso ");
        compromissos[dia][hora] = tc.next();
    }

    private void verificarCompromisso() {
        validarDia();
        validarHora();

        dia--;
        System.out.println("O compromisso agendado é: ");
        System.out.println(compromissos[dia][hora]);
    }

    public void menu() {
        boolean sair = false;
        byte opcao;

        while (!sair){
            System.out.println("Digite 1 para adicionar compromisso ");
            System.out.println("Digite 2 para verificar compromisso ");
            System.out.println("Digite 0 para sair ");

            opcao = tc.nextByte();

            if (opcao == 1){
                validarDia();
                validarHora();
                adicionarCompromisso();
            } else if (opcao == 2){
                verificarCompromisso();
            } else if (opcao == 0) {
                sair = true;
            } else {
                System.out.println("Opção inválida, digite novamente");
            }
        }
    }
}
