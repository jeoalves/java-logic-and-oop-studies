package Serializacao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ExemploSerializacao{
    //Metodo para serializar os contatos 
    public static void serializarContatos(List<Contato> listaContatos) throws IOException {
        //Cria novo ObjectOutputStream e passa como parametro o file que sera criado ex: agenda.ser
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("agenda.ser"))) {
            outputStream.writeObject(listaContatos);
            System.out.println("Contatos salvos com sucesso!");
        }
    }

    @SuppressWarnings("unchecked")
    public static void deserializarContatos() throws IOException, ClassNotFoundException{
        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("agenda.ser"))){
            List<Contato> contatosLidos = (List<Contato>) inputStream.readObject();
            for(Contato contato : contatosLidos){
                System.out.println("Nome : " + contato.nome + "  - Telefone: " + contato.telefone);
            }
        }
    }
    public static void main(String[] args) {
        Contato contato1 = new Contato("Maria", "(11) 99992-2222");
        Contato contato2 = new Contato("Jose", "(12) 94567-8999");
        Contato contato3 = new Contato("Jose Maria", "(12) 93456-7789");

        List<Contato> listaContatos = new ArrayList<>();
            listaContatos.add(contato1);
            listaContatos.add(contato2);
            listaContatos.add(contato3);

        try{
            serializarContatos(listaContatos);
            deserializarContatos();
        }catch(IOException | ClassNotFoundException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
