public class ArrayStudies{
   public static void main(String[] args) {
    double[]notaAlunos;
    int tamanho = 5;

    notaAlunos = new double [5];
    notaAlunos[0] = 8;
    notaAlunos[1] = 9;
    notaAlunos[2] = 10;
    notaAlunos[3] = 7;
    notaAlunos[4] = 6;

    for(int i = 0; i < tamanho; i++){
        System.out.println(notaAlunos[i]);
    }

   }
    
}