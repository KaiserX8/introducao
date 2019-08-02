package br.senac.rn.introducao;

public abstract class Conta {

    protected String agencia;
    protected String numero;
    protected Double saldo = 0.0;
    protected String titular;

    public Conta() {

    }

    public String getAgencia() {
        return agencia;
    }

    public String getNumero() {
        return numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Conta(Double saldo) {
        setSaldo(saldo);
    }

    public void setSaldo(Double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            this.saldo = 0.0;
        }
    }

    public void deposita(Double valor) {
        saldo += valor;
    }

    public void saca(Double valor) {
        saldo -= valor;
    }

    public void transfere(Conta contaDestino, Double valor) {
    saca(valor);
    contaDestino.deposita(valor);
    }

    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                ", titular='" + titular + '\'' +
                '}';
    }
}
