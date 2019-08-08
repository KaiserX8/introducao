package ListaDeExercicios;

public class Retangulo {

    static Double Base;
    static Double Altura;

    void valorBase(Double novaBase){
        Base = novaBase;
    }

    void valorAltura(Double novaAltura){
        Altura = novaAltura;
    }

    double mostraBase() {
        return Base;
    }

    double mostraAltura() {
        return Altura;
    }

    double calculaAreaRx() {
        return Base * Altura;
    }

    double calculaAreaRs() {
        return Base + Altura;
    }
}
