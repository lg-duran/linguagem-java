public class Materia {

    private Aluno aluno;
    private String[] materias = new String[3];
    
    public Materia(Aluno aluno) {
        this.aluno = aluno;
    }
    
    public void adicionarMateria(String materia) {
        int posicaoLivreDoArray = percorrerArray();
        
        this.materias[posicaoLivreDoArray] = materia; 
    }
    
    private int percorrerArray() {
        
        for (int i = 0; i < this.materias.length; i++) {
        
            if (this.materias[i] == null) {
                return i;
            }
            
        }
        
        return 0;
    } 
    
    @Override
    public String toString() {
        String materia = "";
        
        for (int i = 0; i < this.materias.length; i++) {            
            
            if(i == 0) {
                materia = materia + this.materias[i];    
            } else {
                materia = materia + " | " + this.materias[i];    
            }
            
        }
        
        return "MATERIA........: " + materia;
    }
}