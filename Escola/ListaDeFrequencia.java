public class ListaDeFrequencia {
        
    private Frequencia[] frequencia = new Frequencia[10];    
    
    public ListaDeFrequencia() {        
    }
    
    public void adicionar(Frequencia frequencia) {
        int posicaoVazia = Vetor.percorrerArray(this.frequencia);
        this.frequencia[posicaoVazia] = frequencia;        
    } 
    
    private Aluno getAluno() {
        Aluno aluno = null;
        for(int i = 0; i < this.frequencia.length; i++){
            if (this.frequencia[i] != null) {
                aluno = frequencia[i].getAluno();
            }
        }
        return aluno;
    }
    
    public String getMaterias() {
        String materias = "";
        for(int i = 0; i < this.frequencia.length; i++){
            if (this.frequencia[i] != null) {
                materias = materias +
                
                "\n" + frequencia[i].getMateria();
            }
        }
        return materias;
    }    
    /*
    public String aprovadoOuReprovado() {
        String resultado = ""; 
        boolean aprovado = true;
        
        for(int i = 0; i < this.frequencia.length; i++) {
            
            if (this.frequencia[i] != null) {
                
                if(this.frequencia[i].aprovacaoDeFrequencia() || this.frequencia[i].aporvacaoPorMateria() == false) {
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
    */
   
    private String aprovadoOuReprovado() {        
        
        for(int i = 0; i < this.frequencia.length; i++) {
            
            if (this.frequencia[i] != null) {
                
                if(this.frequencia[i].aprovacaoDeFrequencia() && this.frequencia[i].aporvacaoPorMateria()) {
                    System.out.println(this.frequencia[i].getAluno());
                    System.out.println(this.frequencia[i].aprovacaoDeFrequencia());
                    System.out.println(this.frequencia[i].aporvacaoPorMateria());
                    System.out.println(i);
                    return "                                     Aluno Aprovado";
                } else {
                    return "                                     Aluno Reprovado";
                } 
                
            }
            
        }
        
        return null;
    }
   
    @Override
    public String toString() {
        return
        getAluno() + 
        getMaterias() + "\n" +
        aprovadoOuReprovado();
    }
}