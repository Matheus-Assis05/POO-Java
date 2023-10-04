public class Professor extends User {
    String disciplina;

    public Professor(String _nome, int _id, String _disciplina){
        super(_nome, _id);
        this.disciplina = _disciplina;
    }

    public void comecarAula(){
        System.out.println("Comecando aula de " + disciplina);
    }
}
