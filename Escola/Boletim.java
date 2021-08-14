public class Boletim {   

    private ListaDeMaterias lista;
    
    public Boletim(ListaDeMaterias lista) {
        this.lista = lista;
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
               "====================================================================================================" + "\n" +
                   this.lista;
        
        
        return boletim;
    }
}