package EstudoCollections;
import java.util.*;

public class SetExercise{
    public static void main(String[] args){

        Set <Integer> conjuntoInteiros = new HashSet<>();
            conjuntoInteiros.add(1);
            conjuntoInteiros.add(5);
            conjuntoInteiros.add(10);
            conjuntoInteiros.add(500);
            conjuntoInteiros.add(1000);
            System.out.println("Conjunto de inteiros: " + conjuntoInteiros);

            System.out.println("Contem '500'? " + conjuntoInteiros.contains(500));

            conjuntoInteiros.remove(10);
            System.out.println("Conjunto apos remocao do item '10' " + conjuntoInteiros);
            
    }
}