package ExConstantes;

public class FinalVariables {
    final int NUMERO_MAXIMO = 100;
    final String MENSAGEM = "Bem-vindo ao mundo da programação!";

    public void imprimirMensagens(){
        System.out.println(NUMERO_MAXIMO);
        System.out.println(MENSAGEM);

        /*NUMERO_MAXIMO = 200;
        MENSAGEM = "BLABLABLA";*/
        
    }
    public static void main(String[] args) {
        FinalVariables exemplo = new FinalVariables();
        exemplo.imprimirMensagens();
    }
}

