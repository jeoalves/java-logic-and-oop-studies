package ClasseObject;

abstract class Veiculos {
    private String placa;
    private int ano;

    Veiculos(String placa, int ano){
        this.placa = placa;
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public int getAno() {
        return ano;
    }

    abstract void exibirInfo();

}

class Onibus extends Veiculos{
    int assentos;

    Onibus(String placa, int ano, int assentos) {
        super(placa, ano);
        this.assentos = assentos;
    }    
    
    @Override
    void exibirInfo(){
        System.out.println("Placa: " + getPlaca() + " Ano: " + getAno() + " Numero de assentos: " + assentos);

    }
}

class Caminhao extends Veiculos{
    int eixos;

    Caminhao(String placa, int ano, int eixos) {
        super(placa, ano);
        this.eixos = eixos;    
    }

    @Override
    void exibirInfo(){
        System.out.println("Placa: " + getPlaca() + " Ano: " + getAno() + " Numero de eixos: " + eixos);

        }
    }
    public class MainVeiculos{
        public static void main(String[] args) {
            Veiculos onibus1 = new Onibus("ABC5522",  1990, 50);
            Veiculos caminhao1 = new Caminhao("DEF6633",2002, 5);
            
            onibus1.exibirInfo();
            caminhao1.exibirInfo();
        }

}

