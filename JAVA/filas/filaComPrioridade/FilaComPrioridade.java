package com.filas.filaComPrioridade;

public class FilaComPrioridade <T>extends Filas<T>{

    public void emfileira(T elemento){
        Comparable<T> chave = (Comparable<T>) elemento;
        int i;
        for (i=0 ; i<this.getTamanho(); i++){
            if (chave.compareTo(this.elementos[i]) < 0){
                break;
            }
        }
        this.adicionarMeio(elemento, i);

    }

    private void adicionarMeio(T elemento, int posicao){
        if (posicao < 0 || posicao > getTamanho()){
            throw new IllegalArgumentException("Posição inválida");
        }else {

            for (int i = getTamanho(); i > posicao; i--){
                elementos[i] = elementos [i-1];
            }
            elementos[posicao] = elemento;
            tamanho++;
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
