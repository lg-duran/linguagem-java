public class Relatorio {

    private String nome;
    private Aluno aluno;
    private Sala sala;
    private Nota nota;
    
    public Relatorio(String nome, Aluno aluno, Sala sala, Nota nota) {
        this.nome = nome;
        this.aluno = aluno;
        this.sala = sala;
        this.nota= nota;
    }
    
    @Override
    public String toString() {
        return 
        "====================================================================================================" 
                      +                                   "\n"  +
        "RELATORIO: " + this.nome                      +  "\n"  +
                        this.aluno                     +  "\n"  +                                       
                        this.sala                      +  "\n"  +
        "NOTA.....: " + this.nota                      +  "\n"  +
        "===================================================================================================="
                                                        + "\n"  + 
                                                          "\n"  ;
        
    }
}