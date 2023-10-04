//Estudo sobre Programação Orientada a Objetos (POO)
//Explicarei conceitos dentro das classes com comentarios

//Criarei um sistema de classes basico onde existe uma classe User, que cria subclasses "Aluno", "Professor" e "Funcionario"
//No futuro pretendo linkar este projeto com um banco de dados mySQL
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Criar instanceas das classes e executar as funcoes.

        // Receber informações do usuario para criar uma instancea
        System.out.print("Primeiro Nome: ");
        String inputNome = sc.nextLine();
        System.out.print("\n Id (numeros): ");
        int inputId = Integer.parseInt(sc.nextLine());
        System.out.print("\nTipo de usuario: "); // label
        String opcao = sc.nextLine(); // input

        if (opcao.equals("professor")) {
            System.out.print("\n Disciplina: ");
            String inputDisciplina = sc.nextLine();

            // Criar instancia da classe baseada nas respostas
            Professor prof1 = new Professor(inputNome, inputId, inputDisciplina);

            prof1.dizerOi(); // Mostrando que posso usar metodos publicos da classe User (classe pai)

            prof1.comecarAula();
        } else if (opcao.equals("aluno")) {
            System.out.print("\n Matricula: ");
            String inputMatricula = sc.nextLine();

            Aluno aluno1 = new Aluno(inputNome, inputId, inputMatricula);

            aluno1.dadosAluno();
        } else if (opcao.equals("funcionario")) {
            System.out.print("\n Salario: ");
            int inputSalario = sc.nextInt();

            Funcionario funcionario1 = new Funcionario(inputNome, inputId);
            // adicionar valor ao salario com o setter:
            funcionario1.setSalario(inputSalario);
            // printar valor com o getter:
            System.out.println("Salario atual: R$" + funcionario1.getSalario() + ",00");
        } else {
            System.err.println("ERRO: TIPO INVALIDO");
        }
    }
}
