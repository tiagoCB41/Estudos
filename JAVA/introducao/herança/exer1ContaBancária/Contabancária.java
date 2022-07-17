package com.introducao.heran�a.exer1ContaBanc�ria;

import static com.introducao.heran�a.exer1ContaBanc�ria.ChequeEspecial.getLimite;
import static com.introducao.heran�a.exer1ContaBanc�ria.ContaPoupan�a.calcularDiaRendimento;
import static com.introducao.heran�a.exer1ContaBanc�ria.ChequeEspecial.sacarChequeEspecial;

public class Contabanc�ria {



    private String nameClient;
    private String numAccount;
    private double saldo;


    public Contabanc�ria() {
        super();
    }

    public Contabanc�ria(String nameClient, String numAccount, double saldo) {
        super();
        this.nameClient = nameClient;
        this.numAccount = numAccount;
        this.saldo = saldo;
    }



    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public String getNumAccount() {
        return numAccount;
    }

    public void setNumAccount(String numAccount) {
        this.numAccount = numAccount;
    }

    public double getSaldo() {
        return saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double x){
        if((getSaldo() - x) >= 0){
            this.setSaldo(this.saldo - x);
        }else {
            System.out.println("saldo insuficiente. Tente efetuar um saque especial");
        }
    }

    public void depositar(int x) {
        this.setSaldo(x);
    }

    public void atualizarSaldoRendimento(int days){

        for (int i = days; i >= 0 ; i --){
            setSaldo(calcularDiaRendimento(getSaldo()));
        }

    }


    public void sacarCheque (double x){
        if ((getLimite() - x) >= 0){
            sacarChequeEspecial(x);
            this.setSaldo(getSaldo()+x);
        }else {System.out.println("Limite do Cheque especial n�o suficiente");}

    }

    public void verificarLimiteCheque () {
        System.out.println(getLimite());
    }

    @Override
    public String toString() {
        return "Contabanc�ria{" +
                "nameClient='" + nameClient + '\'' +
                ", numAccount='" + numAccount + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
