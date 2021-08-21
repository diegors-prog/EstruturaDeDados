package com.company;

public class Main {

    public static void main(String[] args) {
        Fila minhaFila = new Fila(10);

        minhaFila.push(11);
        minhaFila.push(22);
        minhaFila.push(33);
        minhaFila.push(44);
        minhaFila.push(55);
        minhaFila.push(66);
        minhaFila.push(77);
        minhaFila.push(88);
        minhaFila.push(99);
        minhaFila.push(00);
        minhaFila.shift();
        minhaFila.shift();
        minhaFila.listar();
        minhaFila.tamanho();
    }
}
