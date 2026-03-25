package ExSalario;

    public class Assistente extends Funcionario {
        Assistente(String nome, double salario){
        super(nome,salario);
        }

        @Override
        public double ganhoAnual(){
        return ((12*super.getSalario()) + 1000.00);
        }
    
}    

