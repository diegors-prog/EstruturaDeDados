package com.company;

public class Lista {
    private Dog primeiro;
    private Dog ultimo;
    private int tamanho;

    public Lista() {
        this.tamanho = 0;
    }

    public Dog getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(Dog primeiro) {
        this.primeiro = primeiro;
    }

    public Dog getUltimo() {
        return ultimo;
    }

    public void setUltimo(Dog ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public boolean adicionar( Dog novoDog) {
        if (this.primeiro == null) {
            this.primeiro = novoDog;
            this.ultimo = novoDog;
            tamanho++;
            return true;
        }else  {
            this.ultimo.setProximo(novoDog);
            this.ultimo = novoDog;
            tamanho++;
            return true;
        }
    }

    public void remover(){
        if(ultimo==null){
            System.out.println("Lista Vazia");
        }else{
            Dog ant=primeiro;
            Dog ultimo=primeiro;
            while (ultimo!=ultimo){
                ant=ultimo;
                ultimo=ultimo.getProximo();
            }
            ant.setProximo(null);
            ultimo=ant;
            tamanho--;
        }
    }

    public void exibir() {
        Dog aux = this.primeiro;
        if (aux == null) {
            System.out.println("Lista vazia");
        }else {
            while (aux != null) {
                System.out.println(aux.getNome());
                aux = aux.getProximo();
            }
        }
        System.out.println("Quantidade de itens: " + tamanho);
        System.out.println("------------------------");
    }

    public void addPosicao(int position, Dog p){
        if(primeiro==null){
            System.out.println("Posição invalida, adicionado no inicio da lista");
            adicionar(p);
        }else{
            if(position>=tamanho){
                adicionar(p);
            }else {
                if (position==0){
                    adicionar(p);
                }else {
                    Dog aux= primeiro;
                    int pos=0;
                    while (pos<position-1){
                        aux=aux.getProximo();
                        pos++;
                    }
                    p.setProximo(aux.getProximo());
                    aux.setProximo(p);
                    tamanho++;
                }
            }
        }
    }
}
