public class User {
    //Parametros base de todo usuario (serao herdados por todas as sub-classes, ja que todos compartilham dos mesmos parametros)
    String nome;
    int id;

    //CONSTRUCTOR: Recebe como parametros de função as variaveis da classe para instanciar no objeto
    public User(String _nome, int _id){ //Parametros serao passados em todas as classes filhas
        this.nome = _nome; //pega os parametros dados quando se cria uma insancia da classe e os define nas variaveis 
        this.id = _id;    //(ID desta classe é igual ao id dado no parametro)  
    }

    public void dizerOi(){
        System.out.println("Ola, meu nome e " + nome);
    }
}
