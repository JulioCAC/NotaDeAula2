public class Aluno extends Pessoa {
    private double nota1, nota2, media;

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }


    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void calculaMedia() {
        this.media = (nota1 + nota2) / 2;
    }


    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getMedia() {
        return media;
    }


}