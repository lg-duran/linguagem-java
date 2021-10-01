public class ListaDeFrequencia {
        
    private Frequencia[] frequencia = new Frequencia[10];    
    
    public ListaDeFrequencia() {        
    }
    
    public void adicionar(Frequencia frequencia) {
        int posicaoVazia = Vetor.percorrerArray(this.frequencia);
        this.frequencia[posicaoVazia] = frequencia;        
    }        
    
    public Frequencia[] frequenciaDo(Aluno aluno) {
        Frequencia[] listaDefinitiva = new Frequencia[10];
                
        for (int i = 0; i < this.frequencia.length; i++) { 
            //System.out.println("1 " + this.frequencia[i].getAluno());
            //System.out.println("2 " + aluno);
            if (this.frequencia[i] != null) { 
                if (this.frequencia[i].getAluno() == aluno) {                
                    listaDefinitiva[i] = this.frequencia[i];
                } 
            }
        }        
        return listaDefinitiva;
    }
    /*
    @Override
    public String toString() {
        String frequencia = null;        
        for(int i = 0; i < this.frequencia.length; i++) {        
            if(this.frequencia[i] == null) {            
            } else {
                frequencia =                
                this.frequencia[i];
            }            
        }        
        return frequencia;
    }*/
}