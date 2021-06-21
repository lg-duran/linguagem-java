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
    //    return (this.primeiroBimestre + this.segundoBimestre + this.terceiroBimestre + this.quartoBimestre) / 4;  
    return 0;
    }
    
    public String getAluno() {
        return this.aluno.getNome();
    }
    
    @Override
    public String toString() {
    //    return this.primeiroBimestre + " | " + this.segundoBimestre + " | " + this.terceiroBimestre + " | " + this.quartoBimestre;  
    return "";
    }
}