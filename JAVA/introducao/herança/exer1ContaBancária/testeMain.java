package com.introducao.heran�a.exer1ContaBanc�ria;


public class testeMain {

    public static void main (String[] args) {

        Contabanc�ria tiago = new Contabanc�ria();

        tiago.setNameClient("Tiago Carvalho");
        tiago.setNumAccount("0800");

        //DEPOSITANDO
        tiago.depositar(1000);
        System.out.println(tiago.toString());

        //TENTANDO SACAR UM VALOR MAIS ALTO QUE O DISPONIVEL
        tiago.sacar(1100);

        //ATUALIZANDO O SALDO RENDIMENTO DA POUPAN�A
        tiago.atualizarSaldoRendimento(1);
        System.out.println(tiago);

        //SACAR CHEQUE ESPECIAL
        tiago.sacarCheque(200);
        System.out.println(tiago);
        tiago.verificarLimiteCheque();

        //TENTAR SACAR UM VALOR MAIOR QUE O CHEQUE ESPECIAL
        tiago.sacarCheque(1200);
        System.out.println(tiago);
        tiago.verificarLimiteCheque();





    }
}
