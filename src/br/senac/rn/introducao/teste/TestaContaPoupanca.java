package br.senac.rn.introducao.teste;

import br.senac.rn.introducao.ContaPoupanca;

public class TestaContaPoupanca {

    public static void main(String[] args) {

        ContaPoupanca contaJefferson = new ContaPoupanca();

//        contaJefferson.setTitular("Jefferson Felipe");

        contaJefferson.deposita(1000.0);

        System.out.println(contaJefferson);

        for (int i = 0; i < 2; i++) {
            contaJefferson.rende();
            System.out.println(contaJefferson);
        }

    }

}
