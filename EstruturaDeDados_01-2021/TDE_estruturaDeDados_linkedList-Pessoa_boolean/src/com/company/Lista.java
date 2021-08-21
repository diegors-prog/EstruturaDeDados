package com.company;

public class Lista {
    private Pessoa first;
    private Pessoa last;
    private int size;

    public Lista() {
        this.size = 0;
    }

    public Pessoa getFirst() {
        return first;
    }

    public void setFirst(Pessoa first) {
        this.first = first;
    }

    public Pessoa getLast() {
        return last;
    }

    public void setLast(Pessoa last) {
        this.last = last;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean addInicio(Pessoa novaPessoa) {

        if (this.first == null) {
            this.first = novaPessoa;
            this.last = novaPessoa;
            size++;
            return true;
        }else {
            novaPessoa.setProximo(this.first);
            this.first = novaPessoa;
            size++;
            return true;
        }
    }

    public boolean addFim(Pessoa novaPessoa) {

        if (this.first == null) {
            this.first = novaPessoa;
            this.last = novaPessoa;
            size++;
            return true;
        }else  {
            this.last.setProximo(novaPessoa);
            this.last = novaPessoa;
            size++;
            return true;
        }
    }

    public void remover(Pessoa pessoaRemovida) {
        Pessoa anterior = null;
        Pessoa atual = null;
        for (int i = 0; i < this.getSize(); i++) {
            if (atual.getNome().equals(pessoaRemovida)) {
                if (this.size == 1) {
                    this.first = null;
                    this.last = null;
                }else if (atual == this.first) {
                    this.first = atual.getProximo();
                    atual.setProximo(null);
                }else if (atual == this.last) {
                    this.last = anterior;
                    anterior.setProximo(null);
                }else {
                    anterior.setProximo(atual.getProximo());
                    atual = null;
                }
                this.size--;
                break;
            }
            anterior = atual;
            atual = atual.getProximo();
        }
    }



    public void exibir() {
        Pessoa aux = this.first;
        if (aux == null) {
            System.out.println("Lista vazia");
        }else {
            while (aux != null) {
                System.out.println(aux.getNome());
                aux = aux.getProximo();
            }
        }
        System.out.println("Quantidade de itens: " + size);
        System.out.println("------------------------");
    }

    public void add(int position, Pessoa p){
        if(first==null){
            System.out.println("Posição invalida, adicionado no inicio da lista");
            addInicio(p);
        }else{
            if(position>=size){
                addFim(p);
            }else {
                if (position==0){
                    addInicio(p);
                }else {
                    Pessoa aux= first;
                    int pos=0;
                    while (pos<position-1){
                        aux=aux.getProximo();
                        pos++;
                    }
                    p.setProximo(aux.getProximo());
                    aux.setProximo(p);
                    size++;
                }
            }
        }
    }

    public void del(){
        if(first!=null){
            if(size==1){
                last=null;
                first=null;
                size=0;
            }else{
                Pessoa aux= first;
                first= aux.getProximo();
                size--;
            }
        }else{
            System.out.println("Lista vazia");
        }
    }
    public void delFim(){
        if(last==null){
            System.out.println("Lista Vazia");
        }else{
            Pessoa ant=first;
            Pessoa ultimo=first;
            while (ultimo!=last){
                ant=ultimo;
                ultimo=ultimo.getProximo();
            }
            ant.setProximo(null);
            last=ant;
            size--;
        }
    }

}
