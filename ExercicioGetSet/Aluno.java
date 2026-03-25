public class Aluno{
    private String nome;

    public void setNome(String novoNome){ //void nao 'retorna' nada - metodo set para dar nome
        nome = novoNome;
    }
    public String getNome(){ // metodo que retorna uma string - nome que sera aplicado no setNome
        return nome;
    }
}