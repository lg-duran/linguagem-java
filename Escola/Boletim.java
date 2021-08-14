public class Boletim {   

    private Materia[] materiasDoAluno = new Materia[10];
    
    public Boletim(Materia[] materiasDoAluno) {
        this.materiasDoAluno = materiasDoAluno;
    }

    
    /*
    private String teste() {    
        String resultado = "";        
        double media = calcularMedia();
        int conclusao = this.frequencia.verificacao();
        
        if(media >= 75.0 && conclusao >= 3) {
            resultado = "Aluno Aprovado";
        } else {
            resultado = "Aluno Reprovado";
        }
        
        return resultado;
    }*/   




    @Override
    public String toString() {

        
        String boletim = "";
        
               
        
             
               
               boletim = boletim +
               
               
              "====================================================================================================" +                                                                   "\n" +
               "                                     BOLETIM             "        + "\n" +
               "===================================================================================================="
                                                                                + "\n" +
                                              // this.materia.getAluno()          + "\n" +
               "====================================================================================================" + "\n" ;
                   
                 for (int i = 0; i < this.materiasDoAluno.length; i++) {
            
                    if (this.materiasDoAluno[i] != null) {

                        boletim = boletim + this.materiasDoAluno[i].toString() + "\n";
                
                    }

                 }
        
        
        return boletim;
    }
}