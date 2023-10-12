import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Aluno a = new Aluno();
        Professor pr = new Professor();
        int x;



        do {
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("DIGITE UM NÚMERO PARA ESCOLHER O QUE FAZER: ");
            System.out.println("1 -----> Cadastrar professor");
            System.out.println("2 -----> Cadastrar aluno");
            int num = sc.nextInt();
            switch (num){
                case 1:
                    System.out.println("Informe o nome do professor");
                    pr.setNome(sc.next());
                    System.out.println("Informe a idade do professor");
                    pr.setIdade(sc.nextInt());
                    System.out.println("Informe o salário do professor");
                    pr.setSalario(sc.nextDouble());
                    System.out.println("Informe a especialização do professor");
                    pr.setEspecializacao(sc.next());
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Nome: ");
                    System.out.println(pr.getNome());
                    System.out.println("Idade: ");
                    System.out.println(pr.getIdade());
                    System.out.println("Salário: ");
                    System.out.println(pr.getSalario());
                    System.out.println("Especialização: ");
                    System.out.println(pr.getEspecializacao());
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
                    break;


                case 2:
                    System.out.println("Informe o nome do aluno");
                    a.setNome(sc.next());
                    System.out.println("Informe a idade do aluno");
                    a.setIdade(sc.nextInt());
                    System.out.println("Informe a primeira nota do aluno");
                    a.setNota1(sc.nextDouble());
                    System.out.println("Informe a segunda nota do aluno");
                    a.setNota2(sc.nextDouble());
                    a.calculaMedia();
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Nome: ");
                    System.out.println(a.getNome());
                    System.out.println("Idade: ");
                    System.out.println(a.getIdade());
                    System.out.println("Primeira nota: ");
                    System.out.println(a.getNota1());
                    System.out.println("Segunda nota: ");
                    System.out.println(a.getNota2());
                    System.out.println("Média: ");
                    System.out.println(a.getMedia());
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
                    break;




        }
            System.out.println("Digite 0 para realizar outro cadastro. Caso queira encerrar digite qualquer tecla");
            x = sc.nextInt();

    }while (x == 0);
}
}