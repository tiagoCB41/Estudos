package com.introducao.POO.introdução.relacionamentoTemUm.labs;

import java.util.Scanner;

public class main {
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome para agenda");

        String nomeDaAgenda = scan.nextLine();
        Agenda agenda = new Agenda(nomeDaAgenda);

        Contato[] contatos = new Contato[3];

        for (int i = 0; i < 3; i++){
            System.out.println("entre com as informações do contato: " + (i+1));

            System.out.println("Nome do contato:");
            String nome = scan.nextLine();
            Contato ctt = new Contato();
            ctt.setNome(nome);


            System.out.println("Telefone do contato: ");
            String tell = scan.nextLine();
            ctt.setTelefone(tell);

            System.out.println("Email do contato: ");
            String email = scan.nextLine();
            ctt.setEmail(email);

            contatos[i] = ctt;

        }
            agenda.setContatos(contatos);

            if (agenda != null){
                System.out.println(agenda.obterInfo());
            }

    }

}
