package LambdaExpressions;

import java.util.ArrayList;
import java.util.List;

public class ListAndLambda {
    public static void main(String[] args) {
        List <String> listaDeStrings = new ArrayList<>();
        listaDeStrings.add("Jose");
        listaDeStrings.add("Maria");
        listaDeStrings.add("Jose Maria");
        listaDeStrings.add("Maria Jose");
        
        listaDeStrings.removeIf(nome -> nome.length() > 5);
        System.out.println(listaDeStrings);

        listaDeStrings.add(0, "Ariel");
        listaDeStrings.forEach(nome -> System.out.println(nome));
        //ou pode ser escrito como: 
        // nome -> System.out::println
    }
    
}
