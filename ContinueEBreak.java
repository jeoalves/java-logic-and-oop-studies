public class ContinueEBreak {
    public static void main(String[] args) {
     int codigoDeSaida = 9;
    
     for(int codigoCarteirinha = 1; codigoCarteirinha <= 10; codigoCarteirinha ++){
        if (codigoCarteirinha == codigoDeSaida) {
            System.out.println("Código de saída encontrado, interrompendo o loop.");
            break;
        }
        if (codigoCarteirinha == 3 || codigoCarteirinha == 7 || codigoCarteirinha == 10) {
            System.out.println("O codigo " + codigoCarteirinha + " e aceito");
        }else{
            System.out.println("O codigo " + codigoCarteirinha + " nao e aceito");
        }
        }
    }      
}    

