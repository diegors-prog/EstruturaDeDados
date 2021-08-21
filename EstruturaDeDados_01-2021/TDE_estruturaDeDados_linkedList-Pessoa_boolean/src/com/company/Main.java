package com.company;

public class Main {

    public static void main(String[] args) {
        Lista list = new Lista();
        list.exibir();

        Pessoa pessoa1 = new Pessoa("Diego", 32);
        Pessoa pessoa2 = new Pessoa("Bruna", 26);
        Pessoa pessoa3 = new Pessoa("Arthur", 27);

        list.addInicio(pessoa1);
        list.exibir();

        System.out.println("");

        list.addInicio(pessoa2);
        list.addFim(pessoa3);
        list.exibir();

        System.out.println("");
        System.out.println("Primeiro item: " + list.getFirst().getNome());
        System.out.println("Último item: " + list.getLast().getNome());

        System.out.println("");
        list.delFim();
        list.del();
        list.exibir();

        list.add(1, pessoa2);
        list.add(2, pessoa3);
        list.exibir();

        System.out.println("");
        System.out.println("Primeiro item: " + list.getFirst().getNome());
        System.out.println("Último item: " + list.getLast().getNome());
    }
}
