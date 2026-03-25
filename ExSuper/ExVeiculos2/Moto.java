package ExVeiculos2;

public class Moto extends Veiculos2 {
    int cilindradas;

    
    Moto(String marca, String modelo, int ano, int cilindradas){
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }

    public String obterInfo(){
        return "Modelo: " + super.getModelo() + " Marca: " + super.getMarca() + " Ano: " + super.getAno() + " Cilindradas: " + cilindradas; 
    }
    
}
