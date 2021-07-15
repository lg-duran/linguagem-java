public class Relatorio {

    private String nome;
    private Aluno aluno;
    private Sala sala;
    private Boletim boletim;
    
    public Relatorio(String nome, Aluno aluno, Sala sala, Boletim boletim) {
        this.nome = nome;
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
        "RELATORIO......: " + this.nome                      +  "\n"  +
        "NOME...........: " + this.aluno.getNome()           +  "\n"  +                                       
                              this.sala                      +  "\n"  +                              
        "===================================================================================================="        
                                                             +  "\n"  + 
                              this.boletim                   +  "\n";
        
    }
}