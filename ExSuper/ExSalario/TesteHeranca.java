package ExSalario;

public class TesteHeranca {
    public static void main(String[] args) {
        Assistente assistente1 = new Assistente("Maria", 5000.00);

        assistente1.addAumento(250.00);

        System.out.println("O valor do salario de " + assistente1.getNome() + " e de " + assistente1.getSalario() + " totalizando em um valor anual adicionado de bonus : " + assistente1.ganhoAnual());
    }
    
}
