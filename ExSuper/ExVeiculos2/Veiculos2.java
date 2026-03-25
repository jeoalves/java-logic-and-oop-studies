package ExVeiculos2;

public class Veiculos2 {
    private String marca;
    private String modelo;
    private int ano;
    
    public String getMarca(){
        return marca;
    } 
    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public int getAno(){
        return ano;
    }
    public void setAno(int ano){
        this.ano = ano;
    }

    Veiculos2(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String obterInfo(){
        return "Modelo: " + modelo + " Marca: " + marca + " Ano: " + ano; 
    }
}
