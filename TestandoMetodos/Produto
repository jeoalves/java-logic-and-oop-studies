public class Produto{
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nomeInit,double precoInit, int quantidadeEstoqueInit){
        nome = nomeInit;
        preco = precoInit;
        quantidadeEstoque = quantidadeEstoqueInit;
    }
    public Produto(){

    }

    public String obterDados(){
        return "Nome: " + nome + " Preco: " + preco + " Quantidade em estoque: " + quantidadeEstoque;
    }

    public static void main(String[]args){
        Produto produto1 = new Produto("Papel",10.00, 25);
        System.out.println(produto1.obterDados());
    }
}