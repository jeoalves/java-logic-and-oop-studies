package ExEstudante;

public class MainEstudante {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante("Ariel", 22, 123456789);

        System.out.println("Nome: " + estudante1.nome + " Idade: " + estudante1.idade + " Matricula: " + estudante1.matricula );
    }
    
}
