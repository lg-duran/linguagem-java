public class Boletim {   
    
    private Materia[] materiasDoAluno = new Materia[10];    
    
    public Boletim() {        
    }    
    
    public void criarBoletim(Materia[] materiasDoAluno) {
        this.materiasDoAluno = materiasDoAluno;                
    }
    
    /*
        String resultado = ""; 
        Materia  materia = Vetor.devolverConteudoDoArray(materiasDoAluno);
        
        
        boolean aprovacao;
        
        if(frequencia.validacao() == true) {
            resultado = "                                     Aluno Aprovado";
        } else {
            resultado = "                                     Aluno Reprovado";
        }
        
        return resultado;
    */
    
    @Override
    public String toString() {

        
        String boletim = "";
        
               
        
             
               
               boletim = boletim +
               
               
              "====================================================================================================" +                                                                   "\n" +
               "                                     BOLETIM             "        + "\n" +
               "===================================================================================================="
                                                                                  + "\n" +
               "====================================================================================================" + "\n";
                   
                 for (int i = 0; i < this.materiasDoAluno.length; i++) {
            
                    if (this.materiasDoAluno[i] != null) {

                        boletim = boletim +                                                                            
                                            this.materiasDoAluno[i].toString()                                        + "\n" +
                        "====================================================================================================" + "\n";
                
                    }

                 }
                 
                 /*return boletim + this.frequencia +                 
                 "====================================================================================================" + "\n" +   
                      //                               avaliacao() + "\n" +   
                 "===================================================================================================="
                 */
                return boletim;
    }
}