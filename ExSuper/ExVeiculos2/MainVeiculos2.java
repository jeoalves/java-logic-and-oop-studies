package ExVeiculos2;

public class MainVeiculos2 {

    public static void main(String[] args) {
        Carro carro1 = new Carro("Yaris", "Toyota", 2025, 4);
        Moto moto1 = new Moto("BMW", "ABC123", 2025, 12345);
        Veiculos2 veiculos2 = new Veiculos2("yamaha", "lancha", 1992);

        System.out.println(carro1.obterInfo());
        System.out.println(moto1.obterInfo());
        System.out.println(veiculos2.obterInfo());
    }

}
