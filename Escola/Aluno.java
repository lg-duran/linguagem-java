 public class Aluno {

    private String nome;
    private int anoDeNascimento;    
    

    public Aluno() {
    }
    
    public Aluno(String nome, int anoDeNascimento) {
        this.nome = nome;
        this.anoDeNascimento = anoDeNascimento;         
    }    
    
    public int calcularIdade(int anoAtual) {
        return anoAtual - this.anoDeNascimento;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    @Override
    public String toString() {
        return "====================================================================================================" + "\n" +        
               "                                     DADOS DO ALUNO"                                                  + "\n" +        
               "====================================================================================================" + "\n" +        
               "NOME.....: "   +  this.nome + "\n" +
               "IDADE....: "   +  this.calcularIdade(2021) + "\n";
    }
} 