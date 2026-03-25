class Pessoa{
    public String nome = "Desconhecido";
    private int idade = 0;
    protected String endereco = "Desconhecido";
    String telefone = "Desconhecido";

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public Pessoa(){

    }

    public String obterInfo(){
        return "Nome: " + nome + " Idade: " + idade + " Endereco: " + endereco + " Telefone: " + telefone;
    }

}