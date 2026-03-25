package ExVeiculos2;

public class Carro extends Veiculos2{
    int quantPortas;

    Carro(String marca, String modelo, int ano, int quantPortas){
        super(marca, modelo, ano);
        this.quantPortas = quantPortas;
    }

    @Override
    public String obterInfo(){
        return "Modelo: " + super.getModelo() + " Marca: " + super.getMarca() + " Ano: " + super.getAno() + " Quantidade de portas: " + quantPortas; 
    }    
    
}
