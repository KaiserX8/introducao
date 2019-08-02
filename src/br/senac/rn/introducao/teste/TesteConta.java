package br.senac.rn.introducao.teste;

import br.senac.rn.introducao.Conta;

public class TesteConta {
    public static void main(String[] args){

        Conta contaFelipe = new Conta();

        contaFelipe.setAgencia("0001-0");
        contaFelipe.setNumero("1239-4");
        contaFelipe.setTitular("Filipe Vasco");

        contaFelipe.deposita(80.0);

        System.out.println(contaFelipe); //saldo da conta


        Conta contaJota = new Conta();

        contaJota.setAgencia("0003-2");
        contaJota.setNumero("5314-5");
        contaJota.setTitular("Jota Lopes");

        contaJota.deposita(200.0);

        System.out.println(contaJota);

        contaJota.transfere(contaFelipe, 50.0);

        System.out.println(contaFelipe);
        System.out.println(contaJota);

    }

}
//
//        contaFelipe.deposita(300.0);
//
//        System.out.println(contaFelipe); //depois do deposito
//
//        contaFelipe.saldo = 0.0; //alteração de saldo motivo pq é public para evitar "class" public para "prived"
//
//        contaFelipe.saca(100.5);
//
//        System.out.println(contaFelipe); //depois do saque


