public class ExercicioMes2 {
    public static void main(String[] args) {
        String month = "Abril";
        String days = switch(month){
            case "Janeiro", "Marco", "Maio", "Julho", "Agosto", "Outubro", "Dezembro" -> "31";
            case "Abril", "Junho", "Setembro", "Novembro" -> "30";
            case "Fevereiro" -> "28";
            default -> "Desconhecido"; 
        };
        System.out.println("A quantidade de dias no mes de " + month + " e de : " + days);
    }
    
}
