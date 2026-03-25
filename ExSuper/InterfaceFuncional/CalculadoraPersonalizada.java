package InterfaceFuncional;

@FunctionalInterface
    interface OperacoesMatematicas {
    double executar(double a, double b);
}

public class CalculadoraPersonalizada{
    public static void main(String[] args) {
        OperacoesMatematicas potencia = (a,b) -> Math.pow(a,b);
        OperacoesMatematicas raizQuadrada = (a,b) -> Math.sqrt(a);
        
        System.out.println(potencia.executar(10, 20));
        System.out.println(raizQuadrada.executar(20, 0));
    }    
}
