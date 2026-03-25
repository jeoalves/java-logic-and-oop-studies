public class Funcionarios { //Simplificando com construtor
    String nome;
    String cargo;
    int idade;

        Funcionarios(String nomeInit, String cargoInit, int idadeInit){
        nome = nomeInit;
        cargo = cargoInit;
        idade = idadeInit;
        }
        // nesse caso, incluindo o Init nao precisa do 'this.nome' na inicializacao da variavel, deixando o codigo mais claro
        
        /*--------------------------
        
        O CONSTRUTOR TAMBEM PODE SER O SEGUINTE:    
        Funcionarios(String nome, String cargo, int idade){  // CONSTRUTOR
        this.nome = nome; // this.nome -> se refere a variavel criada acima, logo apos a classe
        this.cargo = cargo;// = nome constroi com o atributo que sera escrito no objeto criado abaixo 
        this.idade = idade;
        
        ---------------------------------

        */

        Funcionarios(){} //Construtor DEFAULT -> permite construir sem todos os atributos
        

    public static void main(String[] args) {
        Funcionarios funcionario1 = new Funcionarios("Joao","assistente",30);
        Funcionarios funcionario2 = new Funcionarios("Maria", "atendente", 28);
        Funcionarios funcionario3 = new Funcionarios("Ariel", "assistente", 34);
        Funcionarios funcionario4 = new Funcionarios(null, null, 0);
        funcionario4.nome = "Joselito"; // nesse caso, como nao esta preenchido demais detalhes ele aparece como default
                                        // ex idade = 0; cargo = null;

        System.out.println("Nome: " + funcionario1.nome + " - Cargo: " + funcionario1.cargo + " - Idade: " + funcionario1.idade);
        System.out.println("Nome: " + funcionario2.nome + " - Cargo: " + funcionario2.cargo + " - Idade: " + funcionario2.idade);
        System.out.println("Nome: " + funcionario3.nome + " - Cargo: " + funcionario3.cargo + " - Idade: " + funcionario3.idade);
        System.out.println("Nome: " + funcionario4.nome + " - Cargo: " + funcionario4.cargo + " - Idade: " + funcionario4.idade);
    }
    
}
