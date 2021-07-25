public class Avaliacao {

    private Aluno aluno;
    private Nota nota;
    private Frequencia frequencia;
    
    public Avaliacao(Aluno aluno, Nota nota, Frequencia frequencia) {    
        this.aluno = aluno;
        this.nota = nota;
        this.frequencia = frequencia;
    }
    
    private String teste() {    
        String resultado = "";        
        double media = this.nota.calcularMedia();
        
        if(media >= 75.0) {
            resultado = "Aluno Aprovado";
        } else {
            resultado = "Aluno Reprovado";
        }
        
        return resultado;
    }
    
    
    
    
    
    
    
    
}