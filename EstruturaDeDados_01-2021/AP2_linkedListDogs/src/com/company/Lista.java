package com.company;

public class Lista<TIPO> {
    private Elemento<TIPO> primeiro;
    private Elemento<TIPO> ultimo;
    private int tamanho;

    public Lista() {
        this.tamanho = 0;
    }

    public Elemento<TIPO> getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(Elemento<TIPO> primeiro) {
        this.primeiro = primeiro;
    }

    public Elemento<TIPO> getUltimo() {
        return ultimo;
    }

    public void setUltimo(Elemento<TIPO> ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void adicionar(TIPO novoValor) {
        Elemento<TIPO> novoElemento = new Elemento<TIPO>(novoValor);

        if (this.primeiro == null && this.ultimo == null) {
            this.primeiro = novoElemento;
            this.ultimo = novoElemento;
        }else {
            this.ultimo.setProximo(novoElemento);
            this.ultimo = novoElemento;
        }
        this.tamanho++;
    }

    public void remover(TIPO valorProcurado) {
        Elemento<TIPO> anterior = null;
        Elemento<TIPO> atual = this.primeiro;
        for (int i = 0; i < this.getTamanho(); i++) {
            if (atual.getValor().equals(valorProcurado)) {
                if (this.tamanho == 1) {
                    this.primeiro = null;
                    this.ultimo = null;
                }else if (atual == this.primeiro) {
                    this.primeiro = atual.getProximo();
                    atual.setProximo(null);
                }else if (atual == this.ultimo) {
                    this.ultimo = anterior;
                    anterior.setProximo(null);
                }else {
                    anterior.setProximo(atual.getProximo());
                    atual = null;
                }
                this.tamanho--;
                break;
            }
            anterior = atual;
            atual = atual.getProximo();
        }
    }

    public Elemento<TIPO> get(int posicao) {
        Elemento<TIPO> atual = this.primeiro;
        for (int i = 0; i < posicao; i++) {
            if (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
        }
        return atual;
    }

    public void addPosicao(TIPO novoValor, int posicao) {
        if (posicao > this.tamanho || posicao < 1) {
            System.out.println("Posição inválida");
            System.out.println("------------------------");
        } else {
            Elemento<TIPO> novoElemento = new Elemento<TIPO>(novoValor);
            Elemento<TIPO> aux = this.primeiro;
            int count = 1;
            while (count < posicao -1) {
                aux = aux.getProximo();
                count++;
            }
            novoElemento.setProximo(aux.getProximo());
            aux.setProximo(novoElemento);
            tamanho++;
        }
    }

    public void removerPosicao(int posicao) {
        if (posicao > this.tamanho || posicao < 1) {
            System.out.println("Posição inválida");
            System.out.println("------------------------");
        } else {
            Elemento<TIPO> anterior = this.primeiro;
            int count = 0;
            while (count < posicao - 1) {
                anterior = anterior.getProximo();
                count++;
            }
            Elemento<TIPO> atual = anterior.getProximo();
            anterior.setProximo(atual.getProximo());
            atual.setProximo(null);
            this.tamanho--;
        }
    }

    public int indexOf(TIPO pCao) {
        Elemento<TIPO> atual = this.primeiro;
        for (int i = 0; i < this.getTamanho(); i++) {
            if (atual.getValor().equals(pCao)) {
                return i;
            } else {
                atual = atual.getProximo();
            }
        }
        return -1;
    }

    public void exibir() {
        Elemento<TIPO> aux = this.primeiro;
        if (aux == null) {
            System.out.println("Lista vazia");
        }else {
            while (aux != null) {
                System.out.println(aux.getValor());
                aux = aux.getProximo();
            }
        }
        System.out.println("Quantidade de itens na lista: " + tamanho);
        System.out.println("------------------------");
    }
}
