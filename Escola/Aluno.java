public class Aluno {

    private String nome;
    private int anoDeNascimento;  

    public Aluno(String nome, int anoDeNascimento) {
        this.nome = nome;
        this.anoDeNascimento = anoDeNascimento;         
    }

    public int calcularIdade(int anoAtual) {
        return anoAtual - this.anoDeNascimento;
    }
    
    public String getNome() {
        return this.nome;
    }
       
} 