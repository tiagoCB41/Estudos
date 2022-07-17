package com.introducao.POO.introdução.relacionamentoTemUm;

public class teste {

    public static void main (String[] args) {

     Contato contato = new Contato();


     contato.setNome("Tiago");
     System.out.println(contato.getNome());




     //Endereço


     Endereco endereco = new Endereco("Rua x", "Numero X", "frente ao X", "teresina" , "PI","00000-000");
     contato.setEndereco(endereco);


     if (contato != null && contato.getEndereco() != null){
            System.out.println(contato.getEndereco().getCidade());
        }


        //telefone

        //APENAS DECLARANDO O TAMANHO DO VETOR
        Telefone[] telefones = new Telefone[2];

        //INSTANCIANDO DOIS TELEFONES
        Telefone telefone1 = new Telefone("celular", "086","4002-8922");
        Telefone telefone2 = new Telefone("casa", "086" , "3222-2121");

        //ATRIBUINDO AO VETOR
        telefones[0] = telefone1;
        telefones[1] = telefone2;




        //ATRIBUINDO A CLASS "CONTATO"
        contato.setTelefones(telefones);



        if (contato != null && contato.getTelefones() != null){
            for (Telefone t : contato.getTelefones()){
                System.out.println(t.getDdd() + " " + t.getNumero());
            }
        }

    }
}
