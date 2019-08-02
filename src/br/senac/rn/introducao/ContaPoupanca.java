package br.senac.rn.introducao;

public class ContaPoupanca extends Conta{

    private final Double RENDIMENTO = 0.005;

    public void rende() {
        saldo = saldo + saldo * RENDIMENTO;
    }

}
