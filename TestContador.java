class Contador{ //nome do arquivo sera TestContador pois ele 
                //e public e contem main dentro dele
    
    static int contagem = 0;
    public Contador(){
        contagem ++;
    }
}
public class TestContador{
    public static void main(String[] args) {
        Contador c1 = new Contador();
        Contador c2 = new Contador();
        System.out.println("Numero de objetos criados: " + Contador.contagem);
        }
} 


