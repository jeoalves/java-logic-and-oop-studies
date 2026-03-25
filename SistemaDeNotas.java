public class SistemaDeNotas {
    public static void main(String[] args) {
        int nota1 = 6;
        int nota2 = 8;
        double media = (nota1+nota2)/2;

        if (media >= 6){
            System.out.println("O aluno foi aprovado com media " + media);
        }else{System.out.println("O aluno foi reprovado com media " + media);}
    }
    
}
