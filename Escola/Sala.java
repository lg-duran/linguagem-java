public class Sala {
    
    private String numeracao;
    private String serieGrau;
    private String turmaPeriodo;
    
    public Sala(String numeracao, String serieGrau, String turmaPeriodo) {
        this.numeracao = numeracao;
        this.serieGrau = serieGrau;
        this.turmaPeriodo = turmaPeriodo;
    }
    
    @Override
    public String toString() {
    return 
    "SALA...........: " + this.numeracao + "\n" +
    "SERIE E GRAU...: " + this.serieGrau + "\n" +
    "TURMA E PERIODO: " + this.turmaPeriodo;     
    
    //+
    //"Turma....: " + this.turma     + "\n" + 
    //"Periodo..: " + this.periodo   + "\n" +
    //"Grau.....: " + this.grau
    //;
    }
}
