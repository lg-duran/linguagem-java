public class Boletim {   

    private Materia[] materiasDoAluno = new Materia[10];
    
    public Boletim(Materia[] materiasDoAluno) {
        this.materiasDoAluno = materiasDoAluno;
    }    
    
    public String avaliacao(Frequencia frequencia) {    
        String resultado = "";        
        double media = 0;
        
        for(int i = 0; i < this.materiasDoAluno.length; i++) {
            
            media = media + this.materiasDoAluno[i].devolverMedia();
            
        }
        
        if(media >= 75.0 && frequencia.verificacao() >= 3) {
            resultado = "Aluno Aprovado";
        } else {
            resultado = "Aluno Reprovado";
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
               "====================================================================================================" + "\n";
                   
                 for (int i = 0; i < this.materiasDoAluno.length; i++) {
            
                    if (this.materiasDoAluno[i] != null) {

                        boletim = boletim +                                                                            
                                            this.materiasDoAluno[i].toString()                                        + "\n" +
                        "====================================================================================================" + "\n";
                
                    }

                 }
                 
                    
        
        return boletim;
    }
}