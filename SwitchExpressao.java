public class SwitchExpressao {
    public static void main(String[] args) {
        int day = 10;
        switch (day) {
            case 1 -> System.out.println("Segunda-feira");             
            case 2 -> System.out.println("Terca-feira");
            case 3 -> System.out.println("Quarta-feira");
            case 4 -> System.out.println("Quinta-feira");
            case 5 -> System.out.println("Sexta-feira");
            case 6 -> System.out.println("Sabado");
            case 7 -> System.out.println("Domingo");
        
            default -> System.out.println("Desconhecido");
        }
    }
    
}
