public class Carro extends Veiculo { //classe com extends (classe filho)
    String nome;

    Carro(String tipo, String nome){ // construtor chama parametro 
                                    // classe pai atraves do super
        super(tipo);
        this.nome = nome;
    }

    @Override
    public void acelerar(){ //metodo sobrescreve metodo classe pai
        System.out.println("O " + tipo + " de nome " + nome + " esta acelerando!");
    }
    
}
