class Personagem {
    String nome;
    int nivelPoder;

    public Personagem (String nome, int nivelPoder){
        this.nome = nome;
        this.nivelPoder = nivelPoder;
    }

    public int tentarAumentarNivelPoder(int novoNivelPoder){
        return nivelPoder += novoNivelPoder; 
    }

    public String mudarNome(String novoNome){
        return nome = novoNome;
    }

    public String obterInfo(){
        return "Nome do Personagem: " + nome + " Nivel de poder: " + nivelPoder;
    }
}
