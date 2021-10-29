public class Boletim { 
    
    private Frequencia[] lista;
    
    public Boletim() {
    }    
    
    public void registrarLista(Frequencia[] lista) {
        this.lista = lista;
    }
    
    public boolean aprovacaoFinal() {    
        boolean retorno = false;
        
        for(int i = 0; i < this.lista.length; i++) {            
            if(this.lista[i] != null) {
                if(this.lista[i].aprovacaoDeFrequencia() && this.lista[i].aporvacaoPorMateria()) {
                    retorno = true;
                } else {
                    return false;
                }
            }            
        } 
        return retorno;
    }
    
    private void imprimirCabecalho() {        
        for(int i = 0; i < this.lista.length; i++) {            
            if(this.lista[i] != null) {
                System.out.println(this.lista[i].getAluno());
                break;
            }            
        }                
    }
    
    private void imprimirDados() {
        for(int i = 0; i < this.lista.length; i++) {            
            if(this.lista[i] != null) {
                System.out.println(this.lista[i].getMateria());
                System.out.println(this.lista[i]);
            }            
        }
    }
    
    private void imprimirRodape() {        
        System.out.println("====================================================================================================");                                                              
        if (aprovacaoFinal()) {
            System.out.println("                                     Aluno Aprovado             ");
        } else {
            System.out.println("                                     Aluno Reprovado             ");
        }
        System.out.println("====================================================================================================");
    }
    
    public void imprimir() {
        this.imprimirLayout();
        this.imprimirCabecalho();
        this.imprimirDados();
        this.imprimirRodape();
    }
    
    public void imprimirLayout() {        
        System.out.println("====================================================================================================");                                                              
        System.out.println("                                     BOLETIM             ");
        System.out.println("====================================================================================================");
    }
}