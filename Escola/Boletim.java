public class Boletim {
    
    private Aluno aluno;
    private Nota nota;
    private String[] materias = new String[4];    
    
    public Boletim(Aluno aluno, Nota nota) {
        this.aluno = aluno;
        this.nota = nota;        
    }
    
    public void adicionarMateria(String materia) {
        int posicaoVazia = percorrerArray();
        this.materias[posicaoVazia] = materia;
    }
    
    private int percorrerArray() {
        
        for (int i = 0; i < this.materias.length; i++) {
        
            if (this.materias[i] == null) {
                return i;
            }
            
        }
        
        return 0;
    } 
    
    
    private String teste() {        
        String nota = "" + this.nota.devolveOConteudoDaPosicao();        
        String materia = "";        
        String juncao = "";
        
        for (int i = 0; i < this.materias.length; i++) {
            
            materia = materia + this.materias[i] + "\n"; 
            
            juncao =    
                                                                        "\n" +
            "===================================================================================================="
                                                                      + "\n" +                                                        
            "BOLETIM........: "                                       + "\n" +   
            "ALUNO..........: "         +   this.aluno.getNome()      + "\n" +            
            "MATERIA........: "         +   materias[i]               + "\n" +
            "NOTA...........: "         +   nota                      + "\n" +                                                                                                    
            "====================================================================================================";           
        }    
        
                        
        return juncao;                
    }
    
    
    @Override
    public String toString() {
        
        return teste();
              /*                                                      "\n" +
        "===================================================================================================="
                                                                  + "\n" +                                                        
        "BOLETIM........: "                                       + "\n" +   
                                                  this.aluno      + "\n" +
                                                  this.materia    + "\n" +
        "NOTA...........: "        +              this.nota       + "\n" +                                                                                                    
        "====================================================================================================";*/
    }
}