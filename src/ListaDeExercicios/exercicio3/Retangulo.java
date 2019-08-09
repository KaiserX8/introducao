package ListaDeExercicios.exercicio3;

public class Retangulo {

    Double base = 0.0;
    Double altura = 0.0;

    public Retangulo() {}

    public Retangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    void valorBase(Double novaBase){
        base = novaBase;
    }

    void valorAltura(Double novaAltura){
        altura = novaAltura;
    }

    double mostraBase() {
        return base;
    }

    double mostraAltura() {
        return altura;
    }

    double calculaArea() {
        return base * altura;
    }

    double calculaPerimetro() {
        return (base + altura) * 2;
    }

}
