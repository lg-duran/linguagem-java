public class Periodo {
    
    // matutino
    // vespertino
    // noturno
    
    private String nome;

    public Periodo(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String toString() {
        return this.nome;
    }
}