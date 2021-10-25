public class Boletim { 
    
    private ListaDeFrequencia listaDeFrequencia;
    
    public Boletim(ListaDeFrequencia listaDeFrequencia) { 
        this.listaDeFrequencia = listaDeFrequencia;
    }    
    
    public String imprimir() {

        
        String boletim = "";
        
               boletim = boletim +
               
               
              "====================================================================================================" +                                                                   "\n" +
               "                                     BOLETIM             "        + "\n" +
               "===================================================================================================="
                                                                                  + "\n" +
                listaDeFrequencia.toString()                                      + "\n" +          
               "====================================================================================================";
               return boletim;         
    }
}