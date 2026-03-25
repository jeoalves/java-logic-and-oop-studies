package Generics;

class Peixe {
    String nome;
    String tamanho;
    
}
class Polvo{
    String nome;
    int tentaculos;
}

class Cesto <T> { // T = type (Generics)/ classe s/ tipo def.
    public T conteudo; //variavel 
    
    public void guardar(T conteudo){ // 'metodo set' de T - 
        this.conteudo = conteudo;   //variavel da classe
    }

    public T pegar(){ //'metodo get' de T - variavel da classe
        return conteudo;
    }
}

public class MainCesto{
    public static void main(String[] args) {
        Cesto <Peixe> cestoDePeixe = new Cesto<>();
        Cesto <Polvo> cestoDePolvo = new Cesto<>();

        Peixe peixe1 = new Peixe();
        peixe1.nome = "Linguado";
        peixe1.tamanho = "grande";

        Polvo polvo1 = new Polvo();
        polvo1.nome = "Polvo";
        polvo1.tentaculos = 8;

        cestoDePeixe.guardar(peixe1);
        cestoDePolvo.guardar(polvo1);

        System.out.println("Nome: " + cestoDePeixe.pegar().nome + " Tamanho: " + cestoDePeixe.pegar().tamanho);
        System.out.println("Nome: " + cestoDePolvo.pegar().nome + " Tentaculos: " + cestoDePolvo.pegar().tentaculos);
    }
}