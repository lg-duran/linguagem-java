public class Relatorio {

    private String nome;
    private Sala sala;
    private Nota nota;
    private Materia materia;
    private Frequencia frequencia;
    private Boletim boletim;
    
    public Relatorio(String nome, Sala sala, Nota nota, Materia materia, Frequencia frequencia, Boletim boletim) {
        this.nome = nome;
        this.sala = sala;
        this.nota= nota;
        this.materia = materia;
        this.frequencia = frequencia;
        this.boletim = boletim;
    }
    
    @Override
    public String toString() {
        return 
        "====================================================================================================" 
                                                             + " \n"  +
        "RELATORIO......: " + this.nome                      +  "\n"  +
        "NOME...........: " + this.nota.getAluno()           +  "\n"  +                                       
                              this.sala                      +  "\n"  +
                              this.materia                   +  "\n"  + 
        "NOTA...........: " + this.nota                      +  "\n"  +
        "MEDIA..........: " + this.nota.calcularMedia()      +  "\n"  +
                              this.frequencia                +  "\n"  +                               
        "===================================================================================================="        
                                                             + "\n"  + 
                              this.boletim                   + "\n";
        
    }
}