package Interfaces;

interface Veiculos {
    void iniciar();
    void parar();
    default void buzinar(){
        System.out.println("Buzinando");
    }
}

class Carro implements Veiculos{
    public void iniciar(){
        System.out.println("Iniciando...");
    }

    public void parar(){
        System.out.println("Parando...");
    }
}

class Caminhao implements Veiculos{
        public void iniciar(){
        System.out.println("Iniciando o caminhao ...");
    }

    public void parar(){
        System.out.println("Parando o caminhao...");
    }
}

public class VeiculosMain {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Caminhao caminhao1 = new Caminhao();
        
        carro1.iniciar();
        carro1.buzinar();
        carro1.parar();
        
        caminhao1.iniciar();
        caminhao1.buzinar();
        caminhao1.parar();
        
    }
}

