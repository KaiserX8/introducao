package ListaDeExercicios;

public class Quadrado {

    Double lado = 0.0;

    void trocaLado(Double novoLado) {
        lado = novoLado;
    }

    double mostraLado() {
        return lado;
    }

    double calculaArea() {
        return lado * lado;
    }
}
