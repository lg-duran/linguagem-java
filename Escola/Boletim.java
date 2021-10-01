public class Boletim {   
    
    private Aluno aluno;
    private Frequencia[] frequenciaDoAluno = new Frequencia[10];    
    
    public Boletim(Aluno aluno) {        
        this.aluno = aluno;
    }  
    
    public void criarBoletim(Frequencia[] frequenciaDoAluno) {
        this.frequenciaDoAluno = frequenciaDoAluno;                
    }
    
    public String aprovadoOuReprovado() {
        String resultado = ""; 
        boolean aprovado = true;
        
        for(int i = 0; i < this.frequenciaDoAluno.length; i++) {
            
            if (this.frequenciaDoAluno[i] != null) {
                
                if(this.frequenciaDoAluno[i].aprovacaoDeFrequencia() && this.frequenciaDoAluno[i].aporvacaoPorMateria() == false) {
                    aprovado = false;
                } 
                
            }
            
        }        
        
        if (aprovado == true) {
            resultado = "                                     Aluno Aprovado";
        } else {
            resultado = "                                     Aluno Reprovado";
        }
        
        return resultado;
    }
    
    @Override
    public String toString() {

        
        String boletim = "";
        
               
        
             
               
               boletim = boletim +
               
               
              "====================================================================================================" +                                                                   "\n" +
               "                                     BOLETIM             "        + "\n" +
               "===================================================================================================="
                                                                                  + "\n" +
               "====================================================================================================";
                   
                 for (int i = 0; i < this.frequenciaDoAluno.length; i++) {
            
                    if (this.frequenciaDoAluno[i] != null) {

                        boletim = boletim + "\n" +                                                                            
                                            this.frequenciaDoAluno[i].getMateria()                                        + "\n" +
                        "====================================================================================================" + "\n" +
                        this.frequenciaDoAluno[i] +                 
                        "===================================================================================================="; 
                    }

                 }
                 
                return boletim     + "\n" +   
                                                aprovadoOuReprovado() + "\n" +   
                        "====================================================================================================";
    }
}