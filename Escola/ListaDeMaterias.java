public class ListaDeMaterias {
        
    private Materia[] materias = new Materia[10];    
    
    public ListaDeMaterias() {        
    }
    
    public void adicionar(Materia materia) {
        int posicaoVazia = Vetor.percorrerArray(this.materias);
        this.materias[posicaoVazia] = materia;        
    }    

    public Materia[] materiasDo(Aluno aluno) {
        Materia[] listaDefinitiva = new Materia[10];
        for (int i = 0; i < this.materias.length; i++) {            
            if (this.materias[i] != null) {             
                if (this.materias[i].getAluno() == aluno) {                
                    listaDefinitiva[i] = this.materias[i];
                } 
            }
        }        
        return listaDefinitiva;
    }
    
    public boolean aprovacaoFinalPorMedia() {        
        for(int i = 0; i < this.materias.length; i++) {
            Materia materia = Vetor.devolverConteudoDoArray(i, this.materias);            
            if (materia.aprovadoPorMedia() == false) {
                return false;
            } 
        }        
        return true;
    }
    
    public boolean aprovacaoPorFrequencia() {
        for(int i = 0; i < this.materias.length; i++) {
            Materia materia = Vetor.devolverConteudoDoArray(i, this.materias);            
            if (materia.aprovadoPorMedia() == false) {
                return false;
            } 
        }        
        return true;
    }
    
    @Override
    public String toString() {
        String materias = "";        
        for(int i = 0; i < this.materias.length; i++) {        
            if(this.materias[i] == null) {            
            } else {
                materias =                
                "" + this.materias[i];
            }            
        }        
        return materias;
    }
}