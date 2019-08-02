package br.senac.rn.introducao;

public class ContaCorrente extends Conta {

    private double taxa;

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public double getTaxa() {
        return taxa;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" + super.toString() + '}';
    }
}
