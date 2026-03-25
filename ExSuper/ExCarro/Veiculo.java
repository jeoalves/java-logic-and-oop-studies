public class Veiculo { // classe 
    String tipo;       
    
    Veiculo(String tipo){ // construtor
        this.tipo = tipo;
    }

    public void acelerar(){ //metodo

        System.out.println("O veiculo do tipo " + tipo + " esta acelerando!");
    }
}
