package ExDeprecated;

class MinhaClasse {
    MinhaClasse(){

    }

    public int calcularSoma(int a, int b){
        return a + b;
    }

    @Deprecated
    public double calcularProduto(int a, int b){
        return a*b;
    }
    
}

@SuppressWarnings("deprecation")
public class Principal {
    public static void main(String[] args) {
        MinhaClasse minhaClasse = new MinhaClasse();

        System.out.println(minhaClasse.calcularSoma(2, 5));
        System.out.println(minhaClasse.calcularProduto(10, 2));

    }

}
