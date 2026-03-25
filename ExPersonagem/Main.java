public class Main {
    public static void main(String[] args) {
        Personagem p1 = new Personagem("teste1",123);

        p1.mudarNome("Mulher Maravilha");
        p1.tentarAumentarNivelPoder(10);

        System.out.println(p1.obterInfo());

    }
    
}
