public class Nota {

    private double primeiroBimestre;
    private double segundoBimestre;
    private double terceiroBimestre;
    private double quartoBimestre;
    private Aluno aluno;
    
    public Nota(Aluno aluno, double primeiroBimestre, double segundoBimestre, double terceiroBimestre, double quartoBimestre) {
        this.aluno = aluno;
        this.primeiroBimestre = primeiroBimestre;
        this.segundoBimestre = segundoBimestre;
        this.terceiroBimestre = terceiroBimestre;
        this.quartoBimestre = quartoBimestre;        
    }
    
    public double calcularMedia() {    
        return (this.primeiroBimestre + this.segundoBimestre + this.terceiroBimestre + this.quartoBimestre) / 4;   
    }
    
    public String getAluno() {
        return this.aluno.getNome();
    }
    
    @Override
    public String toString() {
        return this.primeiroBimestre + " | " + this.segundoBimestre + " | " + this.terceiroBimestre + " | " + this.quartoBimestre;  
    }
}