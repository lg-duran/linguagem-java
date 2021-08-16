public class Relatorio {
    
    private Aluno aluno;
    private Boletim boletim;
    
    public Relatorio(Aluno aluno, Boletim boletim) {                
        this.aluno = aluno;
        this.boletim = boletim;
    }
    
    @Override
    public String toString() {
        return "" + this.aluno + this.boletim;
    }
}