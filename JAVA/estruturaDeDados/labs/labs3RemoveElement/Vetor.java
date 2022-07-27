package com.estruturaDeDados.labs.labs3RemoveElement;

public class Vetor <T> {

    private int tamanho;

    private T [] elementos;

    public Vetor(int capacidade) {
        //ATRIBUINDO O TIPO GENERICO DA CLASSE AO VETOR ELEMENTOS
        this.elementos = (T[]) new Object [capacidade];
    }


    public void adicionar(T elemento) throws Exception {
        aumentarCapacidade();
        if (tamanho < elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("Lista já está cheia, não é possivel adicinonar mais elementos");
        }
    }

    //EXEMPLO CRIADO POR MIM //E COMPATIVEL COM O EXEMPLO MOSTRADO NA AULA
    //********ADICIONANDO O METODO AUMENTAR CAPACIDADE
    public void adicionar(T elemento,int posicao){
        aumentarCapacidade();
        if (!(posicao >= 0 && posicao <tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        } else {

            for (int i = tamanho; i > posicao; i--) {
                this.elementos[i] = this.elementos[i - 1];
            }
            this.elementos[posicao] = elemento;
            tamanho++;
        }
    }



    //O METODO ABAIXO SÓ SERÁ EXECUTADO QUANDO
    //O VETOR ESTIVER CHEIO(tamanho == elementos.length)
    public void aumentarCapacidade(){
        if (this.tamanho == elementos.length){
            T[] elementosNovos = (T[])new Object[elementos.length * 2];
            for (int i=0; i < this.tamanho; i ++){
                elementosNovos[i] = elementos[i];
            }
            elementos = elementosNovos;
        }
    }


    //EXEMPLO MOSTRADO NA AULA
    public String toString() {

        StringBuilder s  = new StringBuilder();
        s.append("[");
        for (int i=0; i < tamanho-1; i++){
            s.append(elementos[i]);
            s.append(",");
        }
        if (this.tamanho>0){
            s.append(this.elementos[this.tamanho-1]);
        }
        s.append("]");

        return s.toString();
    }

    //EXEMPLO CRIADO POR MIM
    public String getElementosTeste() {

        StringBuilder s  = new StringBuilder();
        s.append("[");
        for (int i=0; i < tamanho; i++){
            if (i == tamanho-1){
                s.append(elementos[i]);
            }else {
                s.append(elementos[i]);
                s.append(",");
            }

        }
        s.append("]");

        return s.toString();
    }

    //REMOVER PELA POSIÇÃO
    public void removerPos(int posicao){
        if (!(posicao > 0 && posicao <tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i=posicao; i<tamanho; i++){
            elementos[i] = elementos[i+1];
        }
        tamanho--;
    }

    public int getTamanho() {
        return tamanho;
    }

    //REMOVER PELA STRING
    public void removerString (T x){
        int posicao = obterPosição(x);
        if (!(posicao > 0 && posicao <tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i=posicao; i<tamanho; i++){
            elementos[i] = elementos[i+1];
        }
        tamanho--;
    }

    //OBTER ELEMENTO DA POSIÇÃO X
    public Object busca (int posicao){
        if (!(posicao > 0 && posicao <tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }
        return elementos[posicao];
    }

    //OBTER A POSIÇÃO DO ELEMENTO X
    public int obterPosição (T x) {
        for (int i=0; i< tamanho ;i++){
            if (elementos[i].equals(x)){
                return i;
            }
        }
        return -1;
    }




    ///////////////////////////////////////
    /////////////  LABS  //////////////////

    public boolean contem (T elemento){
        return obterPosição(elemento) >= 0;
    }

    //FEITO POR MIM
    public int ultimoIndice(T elemento){
        int indexOF = -1;
        for (int i=0; i < tamanho; i++){
            if (elementos[i].equals(elemento)){
                indexOF = i;
            }
        }
        return indexOF;
    }

    //CORREÇÃO ATIVIDADE

    public int ultimoIndice2(T elemento){
        for (int i=tamanho-1; i >= 0; i--){
            if (elementos[i].equals(elemento)){
                return i;
            }
        }
      return -1;
    }

    public void removeElemento(T elemento){
        for (int i=tamanho-1; i>=0; i--){
            if (elementos[i].equals(elemento)){
                for (int o=i;o<tamanho;o++){
                    elementos[o] = elementos[o+1];
                }
                tamanho--;
            }
        }
    }


}
