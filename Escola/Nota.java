public class Nota {
    
    private Aluno aluno;
    private double[] notas = new double[4];
    
    public Nota(Aluno aluno) {
        this.aluno = aluno;      
    }
    
    public void adicionarNota(double nota) {
        int posicaoVazia = procurarUmaPosicaoVaziaNoArrayNotas();
        this.notas[posicaoVazia] = nota;
    }
    
    private int procurarUmaPosicaoVaziaNoArrayNotas() {
        
        for (int i = 0; i < notas.length; i++) {
            
            if (notas[i] == 0) {
                return i;                
            }
            
        }
        
        return -1;
    }
        
    public double calcularMedia() {    
    
        double media = 0.0;
        
        for (int i = 0; i < notas.length; i++) {
            
            media = media + this.notas[i];
            
        }
        
        return media / 4;    
    }
    
    public String devolveOConteudoDaPosicao() {
        String nota = "";
        
        for (int i = 0; i < this.notas.length; i++) {                        
            
            nota = nota + this.notas[i] + "\n";                
            
        }
        
        return nota;
    }
    
    public String getAluno() {
        return this.aluno.getNome();
    }
    
    @Override
    public String toString() {
    
        String nota = "";
        
        for (int i = 0; i < this.notas.length; i++) {            
            
            if(i == 0) {
                nota = nota + this.notas[i];    
            } else {
                nota = nota + " | " + this.notas[i];    
            }
            
        }
        
        return nota;
    }
}
