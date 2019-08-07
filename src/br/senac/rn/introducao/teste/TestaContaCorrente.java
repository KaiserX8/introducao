package br.senac.rn.introducao.teste;

import br.senac.rn.introducao.Conta;
import br.senac.rn.introducao.ContaCorrente;
import br.senac.rn.introducao.Pessoa;
import br.senac.rn.introducao.Sexo;

public class TestaContaCorrente {

    public static void main(String[] args) {

        ContaCorrente contaFlavio = new ContaCorrente();

        Pessoa flavio = new Pessoa();

        flavio.setNome("Flavio Araujo");
        flavio.setSexo(Sexo.MASCULINO);

        contaFlavio.setTitular(flavio);
        contaFlavio.setAgencia("1234-8");
//        contaFlavio.setNumero("4564-4");

        contaFlavio.deposita(800.0);

        System.out.println(contaFlavio);

        Conta contaCaio = new ContaCorrente();

        Pessoa caio = new Pessoa();

        caio.setNome("Caio Cesar");
        caio.setSexo(Sexo.MASCULINO);

        contaCaio.setTitular(caio);
        contaCaio.setNumero("4568-7");
//        contaCaio.setAgencia("1478-3");
        contaCaio.setLimite(500.0);

        contaCaio.deposita(1000.0);

        System.out.println(contaCaio);

        contaCaio.transfere(contaFlavio, 1200.0);

        System.out.println(contaFlavio);

        System.out.println(contaCaio);

    }
}
