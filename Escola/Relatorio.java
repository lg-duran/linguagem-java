public class Relatorio {

    private Aluno aluno;
    private Sala sala;
    private Boletim boletim;
    
    public Relatorio(Aluno aluno, Sala sala, Boletim boletim) {        
        this.aluno = aluno;
        this.sala = sala;        
        this.boletim = boletim;
    }
    
    @Override
    public String toString() {
        return 
        
        "                                         DADOS DO ALUNO                                             "
                                                             + " \n"  +                                          
        "====================================================================================================" 
                                                             + " \n"  +        
        "NOME...........: " + this.aluno.getNome()           +  "\n"  +                                       
                              this.sala                      +  "\n"  +                              
        "===================================================================================================="        
                                                             +  "\n"  + 
                              this.boletim                   +  "\n";
        
    }
}