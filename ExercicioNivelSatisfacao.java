public class ExercicioNivelSatisfacao {
    public static void main(String[] args) {
        int nivel = 2;
        String resultado = switch(nivel){
            case 1 -> "Muito insatisfeito";
            case 2 -> "Insatisfeito";
            case 3 -> "Neutro";
            case 4 -> "Satisfeito";
            case 5 -> "Muito insatisfeito";
            default -> "Opção inválida (deve estar entre 1 e 5)";
        };
        System.out.println(resultado);
    }
    
}
