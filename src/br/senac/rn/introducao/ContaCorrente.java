package br.senac.rn.introducao;

public class ContaCorrente extends Conta {

    private final Double TAXA = 1.0;

    private Double limite = 0.0;

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public Double getLimite() {
        return limite;
    }

    public double getTaxa() {
        return TAXA;
    }

    @Override
    public Boolean saca(Double valor) {
        Double valorComTaxa = valor + TAXA;
        Double saldoComLimite = saldo + limite;
        if (valorComTaxa <= saldoComLimite){
            saldo -= valorComTaxa;
            return true;
        }
        System.out.println("SALDO INSUFICIENTE");
        return false;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" + super.toString() + '}';
    }

    @Override
    public void setLimite(double v) {

    }
}
