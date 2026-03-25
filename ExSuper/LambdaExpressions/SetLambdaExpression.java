package LambdaExpressions;
import java.util.*;

public class SetLambdaExpression {
    public static void main(String[] args) {  

        Set<Integer> conjuntoInteiros = new HashSet<>(Arrays.asList(10,20,21,22,23,27,101,102,103,104));
            conjuntoInteiros.removeIf(numero -> numero % 2 != 0);
            //Deixando apenas numeros pares
                System.out.println(conjuntoInteiros);
    }

}
