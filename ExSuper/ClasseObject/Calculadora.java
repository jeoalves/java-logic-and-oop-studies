package ClasseObject;

abstract class Operacao {
   
    public abstract double calcular(double n1, double n2);

}

class Soma extends Operacao{

    @Override
    public double calcular(double n1, double n2){
        return n1+n2;
    }
}

class Subtracao extends Operacao{
    
    @Override
    public double calcular(double n1, double n2){
        return n1-n2;
    }

}

class Multiplicacao extends Operacao{
    
    @Override
    public double calcular(double n1, double n2){
        return n1*n2;
    }

}

class Divisao extends Operacao{
    
    @Override
    public double calcular(double n1, double n2){
        if(n2!= 0 && n1>n2) {
            return n1/n2;
        } else{
            System.out.println("Nao e possivel fazer essa divisao.");
            return Double.NaN;
        }
    }

}

public class Calculadora{
    public static void main(String[] args) {
        Operacao op1 = new Soma();
        Operacao op2 = new Subtracao();
        Operacao op3 = new Multiplicacao();
        Operacao op4 = new Divisao();

        double n1 = 20;
        double n2 = 2;

        System.out.println("Resultado da soma: " + op1.calcular(n1,n2));
        System.out.println("Resultado da subtracao: " + op2.calcular(n1, n2));   
        System.out.println("Resultado da multiplicacao: " + op3.calcular(n1, n2));
        System.out.println("Resultado da divisao: " + op4.calcular(n1, n2));  
    }
}

