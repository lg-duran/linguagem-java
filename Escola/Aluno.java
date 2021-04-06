public class Aluno {

    String nome;
    private int anoDeNascimento;
    Serie serie;
    Periodo periodo;
    Turma turma;
    Nota nota;

    public Aluno(String nome, int anoDeNascimento, Serie serie, Periodo periodo, Turma turma, Nota nota) {
        this.nome = nome;
        this.anoDeNascimento = anoDeNascimento;   
        this.serie = serie;
        this.periodo = periodo;
        this.turma = turma;
        this.nota = nota;
    }

    public int calcularIdade(int anoAtual) {
        return anoAtual - this.anoDeNascimento;
    }
} 