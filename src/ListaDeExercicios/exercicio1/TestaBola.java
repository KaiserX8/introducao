package ListaDeExercicios.exercicio1;

import ListaDeExercicios.exercicio1.Bola;

public class TestaBola {
    public static void main(String[] args) {

        Bola bolaFutbol = new Bola();

        bolaFutbol.cor = "azul";
        bolaFutbol.circunferencia = 0.5;
        bolaFutbol.material = "couro";

        System.out.println(bolaFutbol.mostraCor());

        bolaFutbol.trocaCor("vermelho");

        System.out.println(bolaFutbol.mostraCor());

    }
}
