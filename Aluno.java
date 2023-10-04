public class Aluno extends User{
    String matricula;

    public Aluno(String _nome, int _id, String _matricula) {
        super(_nome, _id); //super() é um constructor que faz a herança dos atributos da classe pai
        this.matricula = _matricula;
    }
    
    public void dadosAluno(){
        System.out.println("Aluno:\n"+
        "Nome: " + nome + "\n"+
        "Matricula: " + matricula);
    }
}
