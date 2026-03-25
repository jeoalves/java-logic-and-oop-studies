public class OperadorTernario {
    public static void main(String[] args) {
     
        int numero = 15;
        //salva o resultado em uma string e compara ela
        String resultado = (numero % 2 == 0)? "Par" : "Impar";
        // se o resultado da divisao por 2 for = 0 entao(?) sera par, senao(:) impar
        System.out.println("O resultado e : " + resultado);
    }    
}
