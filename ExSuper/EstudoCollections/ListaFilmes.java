package EstudoCollections;
import java.util.*;

public class ListaFilmes {
    public static void main(String[] args) {

    List <String> listaFilmes = new ArrayList<>();
        listaFilmes.add("Alladin");
        listaFilmes.add("Pocahontas");
        listaFilmes.add("A Bela e a Fera");
        listaFilmes.add("Pokemon");
        System.out.println(listaFilmes);
        System.out.println("Contem 'Alladin'? " + listaFilmes.contains("Alladin"));
    }
}
