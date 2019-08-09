package ListaDeExercicios.exercicio4;

public class Pessoa {

    private String nome;
    private Integer idade;
    private Double peso;
    private Double altura;

//    Obs: Por padrão, a cada ano que nossa pessoa envelhece,
//      sendo a idade dela menor que 21 anos, ela deve crescer 0,5 cm

    public void Envelhercer(Integer qtdAnos) {
        Integer idadeComAcresimo = idade + qtdAnos;
        if (idadeComAcresimo <= 21) {
            for (int i = 0; i < x; i++){
                crescer(0.5);
            }
        }else {
            Integer
        }
        idade += qtdAnos;
    }

    public void engordar(Double) {
        peso += qtdAltura;
    }

    public void emagrecer() {

    }

    public void crescer() {
        altura += qtdAltura;

    }

}
