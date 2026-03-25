public class ComplementaryArrayExercise {
    public static void main(String[] args) {
        
        int soma = 0; 
        int [] numeros;
        numeros = new int[1000];

        for (int i = 1; i<=1000; i++){
            soma += i;
        }

        System.out.println("A soma dos " + numeros.length + " itens do array e igual a = " + soma);

    }
}
