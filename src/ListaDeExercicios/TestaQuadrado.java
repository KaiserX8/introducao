package ListaDeExercicios;

public class TestaQuadrado {

    public static void main(String[] args) {

        Quadrado quadrado = new Quadrado();

        quadrado.lado = 5.0;

        System.out.println("lado: " + quadrado.mostraLado());

        System.out.println("Área: " + quadrado.calculaArea());

        quadrado.trocaLado(10.0);

        System.out.println("lado: " + quadrado.mostraLado());

        System.out.println("Área: " + quadrado.calculaArea());

    }
}
