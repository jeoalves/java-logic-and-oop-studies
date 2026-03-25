public class EvenNumbersArray {
    public static void main(String[] args) {
        int [] numerosPares;
        numerosPares = new int[6];
        numerosPares[0] = 2;
        numerosPares[1] = 4;
        numerosPares[2] = 6;
        numerosPares[3] = 8;
        numerosPares[4] = 10;
        numerosPares[5] = 12;

        for(int i = 0; i < (numerosPares.length); i ++ ){
            System.out.print(" " + numerosPares[i] + " ");
        }
    }
    
}
