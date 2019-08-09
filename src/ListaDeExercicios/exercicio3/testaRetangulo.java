package ListaDeExercicios.exercicio3;

public class testaRetangulo {

    public static void main(String[] args) {

        Double altura = 8.0;
        Double base = 7.0;

        Retangulo salaAula = new Retangulo(base, altura);

        Retangulo pisoSala = new Retangulo(0.45, 0.45);

        Retangulo rodapeSala = new Retangulo(0.45, 0.15);

        Double qtdPisos = salaAula.calculaArea() / pisoSala.calculaArea();


        System.out.println("Qtd pisos: " + qtdPisos);

        Double qtdRodapes = salaAula.calculaPerimetro() / rodapeSala.calculaArea();

        System.out.println("Qtd rodapés: " + qtdRodapes);
    }

}
