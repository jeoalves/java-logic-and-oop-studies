public class ContagemDoces {
    public static void main(String[] args) {
        int somaDoces = 1;
        while (somaDoces <= 3){
            if(somaDoces == 3){
                System.out.println("Voce consumiu " + somaDoces +" e atingiu o limite estabelecido de consumo de doces");
                break;
            }
            System.out.println("voce consumiu " + somaDoces + " doces.");
            somaDoces += 1;
        }
    }
    
}
