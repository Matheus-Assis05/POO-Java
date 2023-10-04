//EXPLICANDO GETTERS E SETTERS & VARIAVEIS PRIVADAS

public class Funcionario extends User{
    private int salario; //Coloquei a variavel salario como PRIVATE, o que impede ela de ser acessada fora da classe, mas tem um jeito...

    //Getter: pegarei o valor da variavel salario duma forma que posso usar fora da classe
    public int getSalario(){
        return salario;
    }

    //Setter: adicionarei um valor a variavel privada de fora da classe
    public void setSalario(int sal){
        this.salario = sal;
    }
    
    public Funcionario(String _nome, int _id){
        super(_nome, _id);
        //O valor do salario so pode ser adicionado atravez da função setSalario();
    }

}
