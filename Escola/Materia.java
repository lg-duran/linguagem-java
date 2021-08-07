public class Materia {

    private Aluno aluno;
    private String nome;
    private double[] notas = new double[4];
        
    public Materia(Aluno aluno, String nome) {
        this.aluno = aluno;
        this.nome = nome;
    }
    
    public void adicionarNota(double nota) {
        int posicaoVazia = percorrerArray();
        this.notas[posicaoVazia] = nota;       
    }
    
    private int percorrerArray() {
        
        for(int i = 0; i < this.notas.length; i++) {
        
            if(this.notas[i] == 0) {
            
                return i;
                
            }
            
        }
        
        return 0;
    }   
    
    @Override
    public String toString() {
        String nota = "";
        
        for (int i = 0; i < this.notas.length; i++) {            
            
            if(i == 0) {
                nota = nota + " " + this.notas[i];    
            } else {
                nota = nota + " | " + this.notas[i];    
            }
            
        }
        
        return "MATERIA........: " + nome + "\n" + 
               "NOTA...........: " + nota ;
    }
}