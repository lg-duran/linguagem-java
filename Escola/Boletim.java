public class Boletim {
    
    private Aluno aluno;
    private Nota nota;
    private Materia materia;
    private Frequencia frequencia;
    
    public Boletim(Aluno aluno, Nota nota, Materia materia, Frequencia frequencia) {
        this.aluno = aluno;
        this.nota = nota;
        this.materia = materia;
        this.frequencia = frequencia;        
    }
    
    @Override
    public String toString() {
        
        return
                                                                    "\n" +
        "===================================================================================================="
                                                                  + "\n" +                                                        
        "BOLETIM........: "                                       + "\n" +   
                                                  this.aluno      + "\n" +
                                                  this.materia    + "\n" +
        "NOTA...........: "        +              this.nota       + "\n" +                                                  
                                                  this.frequencia + "\n" +
        "====================================================================================================";                                                  
    }
}
