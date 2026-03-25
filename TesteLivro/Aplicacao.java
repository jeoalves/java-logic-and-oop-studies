public class Aplicacao{
    public static void main(String[]args){

        Livro livro1 = new Livro("titulo livro1", "autor livro1");
        Livro livro2 = new Livro();
        Livro livro3 = new Livro("titulo livro3", "autor livro 3", 1999, 45.55);
    
        livro1.imprimirDados();
        livro2.imprimirDados();
        livro3.imprimirDados();
    }
}
