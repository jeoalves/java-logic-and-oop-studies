public class DadosFuncionarios {
    String nome;
    String cargo;
    int idade;
    public static void main(String[] args) {
        DadosFuncionarios funcionario1 = new DadosFuncionarios();
        DadosFuncionarios funcionario2 = new DadosFuncionarios();
        DadosFuncionarios funcionario3 = new DadosFuncionarios();

        funcionario1.nome = "Maria";
        funcionario1.cargo = "analista";
        funcionario1.idade = 28;

        funcionario2.nome = "Joao";
        funcionario2.cargo = "assistente";
        funcionario2.idade = 22;

        funcionario3.nome = "Fred";
        funcionario3.cargo = "gerente";
        funcionario3.idade = 35;
        
        System.out.println("O nome do funcionario e: " + funcionario1.nome + ", o cargo e: " + funcionario1.cargo + " e a idade e : " + funcionario1.idade);
        System.out.println("O nome do funcionario e: " + funcionario2.nome + ", o cargo e: " + funcionario2.cargo + " e a idade e : " + funcionario2.idade);
        System.out.println("O nome do funcionario e: " + funcionario3.nome + ", o cargo e: " + funcionario3.cargo + " e a idade e : " + funcionario3.idade);
    }
    
}
