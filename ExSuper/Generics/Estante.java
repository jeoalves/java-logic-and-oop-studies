/*package Generics;

public class Estante <T> {
    T[] itens;
    int capacidade;

    public Estante (int capacidade){
        this.capacidade= capacidade;
        this.itens = (T[]) new Object [capacidade];
                    //(T[]) cast
                    //cria new objet array
    }
    public void guardar(T item, int indice){
        itens[indice] = item;
    }
    public T pegar(int indice){
        return itens[indice];
    }

    public void mostrarEstante(){
        for(int i = 0; i < capacidade; i++){
            System.out.println("Posição " + i + ": " + itens[i]);
        }
    }

    public static void main(String[] args) {
        Estante <Integer> prateleira1 = new Estante<>(10);
        Estante<String> prateleira2 = new Estante<>(10);

        prateleira1.guardar(5, 1);
        prateleira1.guardar(2, 2);
        prateleira2.guardar("Ola", 2);
        prateleira2.guardar("Tchau", 3);

        prateleira1.mostrarEstante();
        prateleira2.mostrarEstante();
        System.out.println(prateleira1.pegar(1));
        System.out.println(prateleira2.pegar(3));
    }
}
*/