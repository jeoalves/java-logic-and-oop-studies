package ClassesAbstratas;

public abstract class Loja {
    String razaoSocial;
    String cnpj;
    boolean aberta;

    public String getStatus(){
    return aberta ? "Aberta" : "Fechada"; // operador ternario
    }

    abstract void abrir();
    abstract void fechar();
}

class LojaComercial extends Loja{

    LojaComercial(String razaoSocial, String cnpj, boolean aberta){
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.aberta = aberta;
    }
    public void abrir(){
        aberta = true;
        System.out.println("A loja " + razaoSocial + " abriu.");
    }
    public void fechar(){
        aberta = false;
        System.out.println("A loja " + razaoSocial + " fechou.");
    }

    public static void main(String[] args) {
        LojaComercial l1Comercial = new LojaComercial("Vendinha do Jose", "053247859000190", true);

        System.out.println("Nome do estabelecimento:  " + l1Comercial.razaoSocial + " CNPJ: " + l1Comercial.cnpj + " e esta: " + l1Comercial.getStatus());
        l1Comercial.fechar();
        l1Comercial.abrir();
    }

}
