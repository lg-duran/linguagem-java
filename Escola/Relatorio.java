public class Relatorio {

    private String nome;
    private Aluno aluno;
    private Sala sala;
    private Nota nota;
    
    public Relatorio(String nome, Aluno aluno, Sala sala, Nota nota) {
        this.nome = nome;
        this.aluno = aluno;
        this.sala = sala;
        this.nota= nota;
    }
    
    public String imprimirRelatorio() {
        return 
        "====================================================================================================" 
                      +                                   "\n"  +
        "RELATORIO: " + this.nome                      +  "\n"  +
        "NOME.....: " + this.aluno.getNome()           +  "\n"  +
        "IDADE....: " + this.aluno.calcularIdade(2021) +  "\n"  +
                        this.sala.toString()           +  "\n"  +
        "NOTA.....: " + this.nota.toString()           +  "\n"  +
        "===================================================================================================="
                                                        + "\n"  + 
                                                          "\n"  ;
        
    }
}