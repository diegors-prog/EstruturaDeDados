package com.company;

public class Fila {
    private int[] vetor;
    private int topo;
    private int cont=0;

    public Fila(int tamanho){
        vetor = new int[tamanho];
        topo=-1;
    }

    public boolean isEmpty(){
        if (topo == -1){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isFull(){
        if (vetor.length-1==topo){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean push(int valor){
        if (isFull()){
            return false;
        }
        else{
            topo++;
            vetor[topo]=valor;
            cont++;
            return true;
        }
    }

    public boolean shift(){
        if (isEmpty()){
            return false;
        }
        else{
            for (int i=0; i< vetor.length-1; i++){
                vetor[i] = vetor[i+1];
            }
            topo--;
            cont--;
            return true;
        }
    }

    public void listar(){
        if (isEmpty()){
            System.out.println("ERRO");
        }
        else{
            for (int i=topo; i>=0; i--){
                System.out.println(vetor[i]);
            }
        }
    }

    public void tamanho(){
        if (isEmpty()){
            System.out.println("ERRO");
        }
        else{
            System.out.println("Tamanho do vetor: " +cont);
        }
    }
}
