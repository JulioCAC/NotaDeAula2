public class Professor extends Pessoa {
    private double salario;
    private String especializacao;

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public double getSalario() {
        return salario;
    }

    public String getEspecializacao() {
        return especializacao;
    }
}