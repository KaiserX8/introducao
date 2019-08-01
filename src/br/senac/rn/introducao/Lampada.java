package br.senac.rn.introducao;

import javax.swing.*;

public class Lampada {

    public final Integer FREQUENCIA = 60;

    public Spring cor;
    public Integer potencia;
    public Integer tensao;
    public Float comprimento;
    private Boolean estado = false;

    public Lampada(String cor, int i) {
        this.cor = cor;
    }

    public void acende() {
        estado = true;
    }

    public void apaga() {
        estado = false;
    }

    public String statusLampada() {
        if(estado == true) {
            return "LIGADO";
        }
        return "DESLIGADO";
    }

    @Override
    public String toString() {
        return "Lampada{" + "cor='" + cor + '\'' + ", estado=" + estado + '}';
    }

}
