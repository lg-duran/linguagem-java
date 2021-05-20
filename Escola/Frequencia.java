public class Frequencia {

    private Aluno aluno;
    private boolean[] presenca = new boolean[5];
    private String[] data = new String[5];
        
    public Frequencia(Aluno aluno) {    
        this.aluno = aluno;
    }
    
    /*
    public String varrerArray(boolean presenca, String data) {
        for (int i = 0; i < this.presenca.length; i++) {
            if (i % 3 != 0) {
                this.presenca[i] = presenca;
            }
        } 
        return "";
        return "FREQUENCIA: " + this.presenca[0] + " | " + this.presenca[1] +
                      " | " + this.presenca[2] + " | " + this.presenca[3] +
                      " | " + this.presenca[4];
    }*/
    
    public void chamada(boolean p, String d) {
        /*this.presenca[0] = p;
        this.data[0] = d;*/
        for (int i = 0; i < this.presenca.length; i++) {
            if (i % 3 != 0) {
                this.presenca[i] = p;
            }
        }
    }
    
    @Override
    public String toString() {
        return "FREQUENCIA.....: " + this.presenca[0] + " | " + this.presenca[1] +
                             " | " + this.presenca[2] + " | " + this.presenca[3] +
                             " | " + this.presenca[4] + "\n" +
               "DATA...........: " + this.data[0];
    }    
}