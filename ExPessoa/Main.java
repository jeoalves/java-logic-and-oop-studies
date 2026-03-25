public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Jessica";
        pessoa1.setEndereco("123, asdfghjj");
        pessoa1.telefone = "111111122222";
        pessoa1.setIdade(21);
  
        System.out.println(pessoa1.obterInfo());
    }
}
