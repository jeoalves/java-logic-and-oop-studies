public class SwitchExpressionDiasUteis {
    public static void main(String[] args) {
        String day = "Sabado";
        String tipoDeDia = switch(day){
            case "Segunda", "Terca", "Quarta", "Quinta", "Sexta" -> "dia util";
            case "Sabado", "Domingo" -> "final de semana";
            default -> "Desconhecido";
        };
        System.out.println(tipoDeDia);
    }
    
}
