public class ExercicioMes {
    public static void main(String[] args) {
        int month = 15;
        String nameMonth = switch(month){
            case 1 -> "Janeiro";
            case 2 -> "Fevereiro";
            case 3 -> "Marco";
            case 4 -> "Abril";
            case 5 -> "Maio";
            case 6 -> "Junho";
            case 7 -> "Julho";
            case 8 -> "Agosto"; 
            case 9 -> "Setembro";
            case 10 -> "Outubro";
            case 11 -> "Novembro";
            case 12 -> "Dezembro";
            default -> "Desconhecido";
        };
        System.out.println(nameMonth);
    }  
}
