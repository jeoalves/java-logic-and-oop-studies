public class controleestoquepadaria {
    public static void main (String[]args){
        ControleEstoquePadaria controle = new ControleEstoquePadaria();            
            System.out.println("A quantidade de farinha no estoque e de " + controle.quantidadeDeFarinha + " e a quantidade de acucar e de " + controle.quantidadeDeAcucar);          
    }
    static class ControleEstoquePadaria {
        int quantidadeDeFarinha = 10;
        int quantidadeDeAcucar = 5; 
    }
        
}
        