package ExEstudante;

public class Estudante extends Pessoa {
    int matricula;

    Estudante(String nome, int idade, int matricula){
        super(nome, idade);
        this.matricula = matricula;
    }
    
}
