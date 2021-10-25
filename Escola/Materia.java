public class Materia {

    private Aluno aluno;
    //private Vetor vetor = new Vetor();
    private String nome;
    private double[] notas = new double[4];
        
    public Materia(Aluno aluno, String nome) {
        this.aluno = aluno;
        this.nome = nome;
    }
    
    public void adicionarNota(double nota) {
        int posicaoVazia = Vetor.percorrerArray(this.notas);
        this.notas[posicaoVazia] = nota;       
    }    
    
    public Aluno getAluno() {
        return this.aluno;
    }
    
    public double[] getNotas() {
        return notas;
    }
    
    public boolean aprovadoPorMedia() {
        double media = Vetor.calcularMedia(notas);        
        return media >= 70;
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
       
        return 
               "====================================================================================================" + "\n" +
               "MATERIA........: " + " "  + nome + "\n" + 
               "NOTAS..........: " + nota + "\n" +
               "MEDIA..........: " + " "  + Vetor.calcularMedia(notas) + "\n" +
               "====================================================================================================";
    }
}