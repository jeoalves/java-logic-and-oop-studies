public class Bolo {
    int quantidadeDeAcucar;
    public static void main(String[] args) {
        Bolo boloDechocolate = new Bolo(); //criando 1 objeto
        boloDechocolate.quantidadeDeAcucar = 200; //atribuindo o valor 
        //Bolo e a classe, ou o molde
        //boloDechocolate e o objeto
        //quantidadeDeAcucar e o atributo

        Bolo boloDeBaunilha = new Bolo();
        boloDeBaunilha.quantidadeDeAcucar = 300;

        System.out.println("Quantidade de acucar no bolo de chocolate: " + boloDechocolate.quantidadeDeAcucar);
        System.out.println("Quantidade de acucar no bolo de baunilha " + boloDeBaunilha.quantidadeDeAcucar); 
    }
    
}
