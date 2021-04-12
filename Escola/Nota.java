public class Nota {

    private double primeiroBimestre;
    private double segundoBimestre;
    private double terceiroBimestre;
    private double quartoBimestre;
    Aluno aluno;
    
    public Nota(double primeiroBimestre, double segundoBimestre, double terceiroBimestre, double quartoBimestre) {
        this.primeiroBimestre = primeiroBimestre;
        this.segundoBimestre = segundoBimestre;
        this.terceiroBimestre = terceiroBimestre;
        this.quartoBimestre = quartoBimestre;
    }
    
    public double calcularMedia() {    
        return (this.primeiroBimestre + this.segundoBimestre + this.terceiroBimestre + this.quartoBimestre) / 4;   
    }
    
    @Override
    public String toString() {
        return this.primeiroBimestre + " | " + this.segundoBimestre + " | " + this.terceiroBimestre + " | " + this.quartoBimestre;
    }
}