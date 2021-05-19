public class Frequencia {

    private Aluno aluno;
    private boolean[] presenca = new boolean[5];
    private String[] data = new String[5];
        
    public Frequencia(Aluno aluno) {    
        this.aluno = aluno;
    }
    
    public void chamada(boolean p, String d) {
        this.presenca[0] = p;
        this.data[0] = d;
    }
    
    @Override
    public String toString() {
        return "FREQUENCIA.....: " + this.presenca[0] + "\n" +
               "DATA...........: " + this.data[0];
    }    
}