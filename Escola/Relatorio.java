public class Relatorio {

    private String nome;
    private Sala sala;
    private Nota nota;
    private Materia materia;
    
    public Relatorio(String nome, Sala sala, Nota nota, Materia materia) {
        this.nome = nome;
        this.sala = sala;
        this.nota= nota;
        this.materia = materia;
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
        "===================================================================================================="
                                                             + "\n"  + 
                                                               "\n"  ;
        
    }
}