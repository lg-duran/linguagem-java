public class Sala {
    
    private String numeracao;
    private Serie serie;
    private Turma turma;
    private Periodo periodo;
    private Grau grau;
    
    public Sala(String numeracao, Serie serie, Turma turma, Periodo periodo, Grau grau) {
        this.numeracao = numeracao;
        this.serie = serie;
        this.turma = turma;
        this.periodo = periodo;
        this.grau = grau;
    }
    
    @Override
    public String toString() {
    return 
    "SALA.....: " + this.numeracao + "\n" +
    "SERIE....: " + this.serie     + "\n" +
    "Turma....: " + this.turma     + "\n" + 
    "Periodo..: " + this.periodo   + "\n" +
    "Grau.....: " + this.grau;
    }
}
