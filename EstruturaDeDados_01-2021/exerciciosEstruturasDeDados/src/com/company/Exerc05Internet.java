package com.company;

import java.util.Scanner;

public class Exerc05Internet {
    Scanner tc = new Scanner(System.in);
    String[][][] compromissos = new String[12][31][8];
    int dia = 0;
    int hora = 0;
    int mes = 0;

    private void validarMes() {
        boolean mesValido = false;

        while (!mesValido) {
            System.out.println("Entre com o mês ");
            mes = tc.nextInt();
            if (mes > 0 && mes <= 12) {
                mesValido = true;
            } else {
                System.out.println("Mês inválido, digite novamente");
            }
        }
    }

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
            if (hora > 0 && hora <= 8) {
                horaValida = true;
            } else {
                System.out.println("Hora inválida, digite novamente");
            }
        }
    }

    private void adicionarCompromisso() {
        dia--;
        mes--;
        System.out.println("Digite o compromisso ");
        compromissos[mes][dia][hora] = tc.next();
    }

    private void verificarCompromisso() {
        validarMes();
        validarDia();
        validarHora();

        dia--;
        mes--;
        System.out.println("O compromisso agendado é: ");
        System.out.println(compromissos[mes][dia][hora]);
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
                validarMes();
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
