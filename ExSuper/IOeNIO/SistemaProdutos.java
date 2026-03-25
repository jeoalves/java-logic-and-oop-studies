package IOeNIO;

import java.io.*;
import java.util.*;

class Produto {
private String nome;
private double preco;
private int quantidade;

    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
}

public class SistemaProdutos {
    public static void main(String[] args) {

        String nomeArquivo = "TesteProdutos.txt";
        List<Produto> conteudo = new ArrayList<>(); 

        conteudo.add(new Produto("Sabao", 2.5, 50));
        conteudo.add(new Produto("Shampoo", 15.40, 10));
        conteudo.add(new Produto("Escova", 8.8, 10));

        escreverArquivo(nomeArquivo, conteudo);
        lerArquivo(nomeArquivo);
    }
    
    public static void escreverArquivo(String nomeArquivo, List<Produto> conteudo){
        try{
            FileWriter writer = new FileWriter(nomeArquivo);
            for (Produto p : conteudo){
                writer.write("Produto: " + p.getNome() + ", Preco: " + p.getPreco() + ", Quantidade em estoque: " + p.getQuantidade() + "\n");
            }writer.close();
        }
            catch (IOException e){
                System.out.println("Erro de escrita: " + e.getMessage());
            }
    }
    

    public static void lerArquivo(String nomeArquivo){
        try{
            FileReader reader = new FileReader(nomeArquivo);
            int data = reader.read();
            while (data != -1) {
                System.out.print((char)data); 
                data = reader.read();               
            }
            reader.close();
        }catch (IOException e){
            System.out.println("Erro de leitura: " + e.getMessage());
        }
    }
}


