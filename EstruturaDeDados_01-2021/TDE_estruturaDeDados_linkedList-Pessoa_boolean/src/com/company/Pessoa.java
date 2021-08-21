package com.company;

public class Pessoa {
    private String nome;
    private int idade;
    private Pessoa proximo;

    public Pessoa(String pNome, int pIdade) {
        this.nome = pNome;
        this.idade = pIdade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Pessoa getProximo() {
        return proximo;
    }

    public void setProximo(Pessoa proximo) {
        this.proximo = proximo;
    }

    public void mostrar() {
        System.out.println("" + nome);
        System.out.println("" + idade);
    }
}
