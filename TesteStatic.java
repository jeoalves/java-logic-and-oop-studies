public class TesteStatic {
 public static void exibirValor(int a){
    System.out.println("O valor do inteiro e " + a);
 }   
 public static void main(String[] args) {
    TesteStatic.exibirValor(10);//nome da classe.metodo ou so o metodo
                                // ex: exibirValor(10); - ja funcionaria
                                // nao e necessario criar objeto pois esta dentro da classe, os dois sao static
                                // so pode fazer referencia direta se os dois metodos forem static
}
}
