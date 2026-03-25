package IOeNIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ManipulacaoDeArquivos {
    public static void main(String[] args) {
    
        String nomeDoArquivo = "AlgumaCoisa.txt";
        String conteudo = "Ola mundo";
        

    escreverNoArquivo(nomeDoArquivo, conteudo);
    lerEscrita(nomeDoArquivo);
    
}

    public static void escreverNoArquivo(String nomeDoArquivo, String conteudo){
        Path path = Paths.get(nomeDoArquivo);

        try{
            Files.write(path, conteudo.getBytes());
        }catch(IOException e){
            System.out.println("Erro de escrita: " + e.getMessage());
        }    
    }

    public static void lerEscrita(String nomeDoArquivo){
        Path path = Paths.get(nomeDoArquivo);

        try{
            byte[] bytes = Files.readAllBytes(path);
            String content = new String(bytes);
            System.out.println(content);
            
    }catch (IOException e){
            System.out.print("Erro de excecao: " + e.getMessage());
        }
    }

}
