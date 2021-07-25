public class Sala {
    
    private String numeracao;
    private String serie;
    private String grau;
    private String turma;
    private String periodo;
    
    public Sala(String numeracao, String serie, String grau, String turma, String periodo) {
        this.numeracao = numeracao;
        this.serie = serie;
        this.grau = grau;
        this.turma = turma;
        this.periodo = periodo;
    }
    
    @Override
    public String toString() {
        return 
        "SALA...........: " + this.numeracao + "\n" +
        "SERIE..........: " + this.serie     + "\n" +
        "GRAU...........: " + this.grau      + "\n" +
        "TURMA..........: " + this.turma     + "\n" +               
        "PERIODO........: " + this.periodo;
    }
}
