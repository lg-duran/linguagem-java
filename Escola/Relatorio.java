public class Relatorio {

    private String nome;
    private Sala sala;
    private Nota nota;
    
    public Relatorio(String nome, Sala sala, Nota nota) {
        this.nome = nome;
        this.sala = sala;
        this.nota= nota;
    }
    
    @Override
    public String toString() {
        return 
        "====================================================================================================" 
                      +                                   "\n"  +
        "RELATORIO......: " + this.nome                      +  "\n"  +
        "NOME...........: " + this.nota.getAluno()           +  "\n"  +                                       
                              this.sala                      +  "\n"  +
        "NOTA...........: " + this.nota                      +  "\n"  +
        "===================================================================================================="
                                                        + "\n"  + 
                                                          "\n"  ;
        
    }
}