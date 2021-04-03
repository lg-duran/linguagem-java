public class Aluno {
    
    String nome;
    private int anoDeNascimento;
    Serie serie;
    Periodo periodo;
    Turma turma;
    
    public Aluno(String nome, int anoDeNascimento, Serie serie, Periodo periodo, Turma turma) {
        this.nome = nome;
        this.anoDeNascimento = anoDeNascimento;   
        this.serie = serie;
        this.periodo = periodo;
        this.turma = turma;
    }
    
    public int calcularIdade(int anoAtual) {
        return anoAtual - this.anoDeNascimento;
    }
}