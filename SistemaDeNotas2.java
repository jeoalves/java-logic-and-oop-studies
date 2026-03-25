public class SistemaDeNotas2 {
    public static void main(String[] args) {
        int nota1 = 8;
        int nota2 = 5;
        double frequencia = 0.60;
        double media = (nota1 + nota2)/2;
        if (media >= 6 && frequencia >= 0.75) {
            System.out.println("O aluno foi aprovado com media " + media + " e " + (frequencia*100) + "% de aproveitamento");
        }else{
            System.out.println("O aluno foi reprovado com media " + media + " e " + (frequencia*100) + "% de aproveitamento");
        }
        
    }
    
}
