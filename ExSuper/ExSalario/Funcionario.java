package ExSalario;

public class Funcionario {
    private String nome;
    private double salario;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    
    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public void addAumento(double aumento){
        salario += aumento;
    }

    public double ganhoAnual(){
        return (12*salario);
    }
}
