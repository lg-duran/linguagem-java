public class Boletim {   

    private Materia[] materiasDoAluno = new Materia[10];
    
    public Boletim(Materia[] materiasDoAluno) {
        this.materiasDoAluno = materiasDoAluno;
    }

    
    /*
    private String teste() {    
        String resultado = "";        
        
    }*/
    
    @Override
    public String toString() {

        
        String boletim = "";
        
               
        
             
               
               boletim = boletim +
               
               
              "====================================================================================================" +                                                                   "\n" +
               "                                     BOLETIM             "        + "\n" +
               "===================================================================================================="
                                                                                  + "\n" +
               "====================================================================================================" + "\n" ;
                   
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