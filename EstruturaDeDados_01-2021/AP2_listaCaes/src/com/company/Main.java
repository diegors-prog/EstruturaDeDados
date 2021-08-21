package com.company;

public class Main {

    public static void main(String[] args) {
	    Lista listaCaes = new Lista();

        Dog dog1 = new Dog("Totó", "Jaguara", 18);
        listaCaes.adicionar(dog1);
        Dog dog2 = new Dog("Bili", "Chihuahua", 12);
        listaCaes.adicionar(dog2);
        Dog dog3 = new Dog("Mel", "Akita", 9);
        listaCaes.adicionar(dog3);
        Dog dog4 = new Dog("Tino", "Fila-brasileiro", 9);
        listaCaes.adicionar(dog4);
        Dog dog5 = new Dog("Ruderalis", "Galgo Inglês", 7);
        listaCaes.adicionar(dog5);

        Dog dog6 = new Dog("Tuca", "jaguareis", 6);
        listaCaes.adicionar(dog6);

        listaCaes.exibir();

        listaCaes.remover();

        listaCaes.exibir();


    }
}
