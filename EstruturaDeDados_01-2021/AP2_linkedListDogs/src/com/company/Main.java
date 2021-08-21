package com.company;

public class Main {

    public static void main(String[] args) {
        Lista<Dog> caes = new Lista<Dog>();
        Dog dog1 = new Dog("Totó", "Jaguara", 18);
        caes.adicionar(dog1);
        Dog dog2 = new Dog("Bili", "Chihuahua", 12);
        caes.adicionar(dog2);
        Dog dog3 = new Dog("Mel", "Akita", 9);
        caes.adicionar(dog3);
        Dog dog4 = new Dog("Tino", "Fila-brasileiro", 9);
        caes.adicionar(dog4);
        Dog dog5 = new Dog("Ruderalis", "Galgo Inglês", 7);
        caes.adicionar(dog5);

        caes.exibir();

        caes.remover(dog1);

        caes.exibir();

        Dog dog6 = new Dog("Tuca", "Jaguara", 6);
        caes.addPosicao(dog6, 5);

        caes.exibir();

        caes.removerPosicao(2);

        caes.exibir();

        System.out.println(caes.indexOf(dog4));

        System.out.println(caes.get(3));

    }
}
