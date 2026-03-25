package Interfaces;

interface Produto {

    String getNome();
    int getQuantidade();

    void adicionarQuantidade(int alterarQuantidade);
    void removerQuantidade(int alterarQuantidade);

}

public class ProdutoImpl implements Produto {
    String nome; 
    int quantidade;// variaveis sao declaradas na classe, 
                    // nao na interface
    
    ProdutoImpl(String nome, int quantidade){ //construtor
        this.nome = nome;
        this.quantidade = quantidade;    
    }
    //GETTERS AND SETTERS
    @Override
    public String getNome(){
        return nome;
    }
    
    @Override
    public int getQuantidade(){
        return quantidade;
    }

    // IMPLEMETACAO DOS METODOS
    @Override
    public void adicionarQuantidade(int alterarQuantidade){
        quantidade += alterarQuantidade;   
    }
    @Override
    public void removerQuantidade(int alterarQuantidade){
        if(alterarQuantidade <= this.quantidade){
            this.quantidade -= alterarQuantidade;
        }else{
            System.out.println("Nao ha estoque suficiente para deducao dessa quantidade.");
        }
    }


    //METODO MAIS - RODAR CODIGO
    public static void main(String[] args) {
        ProdutoImpl produto1 = new ProdutoImpl("Chocolate branco", 25); //criando objeto produto1

        //metodos aplicados para produto1
        produto1.adicionarQuantidade(20);
        produto1.removerQuantidade(10);

        //impressao das alteracoes
        System.out.println("Produto: " + produto1.getNome() + " Quantidade em estoque: " + produto1.getQuantidade());
    }
}



