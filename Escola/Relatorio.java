public class Relatorio {

    private String nome;
    private Sala sala;
    private Nota nota;
    private Frequencia frequencia;
    
    public Relatorio(String nome, Sala sala, Nota nota, Frequencia frequencia) {
        this.nome = nome;
        this.sala = sala;
        this.nota= nota;
        this.frequencia = frequencia;
    }
    
    @Override
    public String toString() {
        return 
        "====================================================================================================" 
                                                             + " \n"  +
        "RELATORIO......: " + this.nome                      +  "\n"  +
        "NOME...........: " + this.nota.getAluno()           +  "\n"  +                                       
                              this.sala                      +  "\n"  +
                              this.frequencia                +  "\n"  +                                
        "NOTA...........: " + this.nota                      +  "\n"  +
        "===================================================================================================="
                                                             + "\n"  + 
                                                               "\n"  ;
        
    }
}