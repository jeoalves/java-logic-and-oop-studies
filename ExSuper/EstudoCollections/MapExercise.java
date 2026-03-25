package EstudoCollections;
import java.util.*;

public class MapExercise {
    public static void main(String[] args) {
        Map <String,Integer> estoque = new HashMap<>();
        estoque.put("Camiseta Preta", 10);
        estoque.put("Camiseta branca", 5);
        estoque.put("Camiseta amarela", 3);
        estoque.put("Camiseta azul", 5);
        estoque.put("Camiseta rosa", 7);

        System.out.println(estoque);
        System.out.println("Quantidade em estoque de camisetas amarelas: " + estoque.get("Camiseta amarela"));
        
        estoque.put("Camiseta azul", 15);
        estoque.remove("Camiseta branca");
        System.out.println("Quantidades em estoque: " + estoque);
    }
}
