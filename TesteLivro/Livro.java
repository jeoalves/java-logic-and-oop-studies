class Livro {
    public String titulo = "Desconhecido";
    private String autor = "Desconhecido";
    protected int anoPublicacao = 0;
    double preco = 0.00;

    public String getNomeAutor(){
       return autor;
    }
    public void setNomeAutor(String autorInit){
        autor = autorInit;
    }

    public int getAnoPublicacao(){
        return anoPublicacao;
    }
    public void setAnoPublicacao(int anoPublicacaoInit){
        anoPublicacao = anoPublicacaoInit;
    }
    public double getPreco(){
        return preco;
    }
    public void setPreco(double precoInit){
        preco = precoInit;
    }

    Livro(){
    }

    Livro(String tituloInit, String autorInit, int anoPublicacaoInit, double precoInit){
        titulo = tituloInit;
        autor = autorInit;
        anoPublicacao = anoPublicacaoInit;
        preco = precoInit;
    }

    Livro(String tituloInit, String autorInit){
        titulo = tituloInit;
        autor = autorInit;
    }

    public void imprimirDados(){
        System.out.println("Nome do livro: " + titulo + " Nome do autor: " + autor + " Ano de publicacao: " + anoPublicacao + " Preco do livro: " + preco + ".");
    }
    
}
