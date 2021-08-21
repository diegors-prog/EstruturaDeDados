package com.company;

public class Dog {
    private String nome;
    private String raca;
    private int idade;


    public Dog(String pNome, String pRaca, int pIdade) {
        this.nome = pNome;
        this.raca = pRaca;
        this.idade = pIdade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String toString() {
        return this.nome + " é da raça " + this.raca;
    }
}
