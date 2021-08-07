public class Boletim {
    
    private Aluno aluno;
    private Frequencia frequencia;
    private Materia materia;
    private double[] notas = new double[4];
    private String[] materias = new String[4];    
    
    public Boletim(Aluno aluno/*, Frequencia frequencia, Materia materia*/) {
        this.aluno = aluno;/*
        this.frequencia = frequencia;
        this.materia = materia;*/
    }
    
    public void adicionarMateria(String materia, double nota) {
        int posicaoVazia = percorrerArray();
        this.materias[posicaoVazia] = materia;
        
        int posicaoVaziaNotas = percorrerArrayNota();
        this.notas[posicaoVaziaNotas] = nota;
    }
    
    private int percorrerArray() {
        
        for (int i = 0; i < this.materias.length; i++) {
        
            if (this.materias[i] == null) {
                return i;
            }
            
        }
        
        return 0;
    } 
    
    
    private int percorrerArrayNota() {
        
        for (int i = 0; i < this.notas.length; i++) {
        
            if (this.notas[i] == 0) {
                return i;
            }
            
        }
        
        return 0;
    } 
    
    private String devolverConteudoDoArrayNotas() {
    
        String nota = "";
    
        for(int i = 0; i < this.notas.length; i++) {
        
            nota = nota + this.notas[i];
        
        }
        
        return nota;
    }
    
    public double calcularMedia() {    
    
        double media = 0.0;
        
        for (int i = 0; i < notas.length; i++) {
            
            media = media + this.notas[i];
            
        }
        
        return media / 4;    
    }
    /*
    private String teste() {    
        String resultado = "";        
        double media = calcularMedia();
        int conclusao = this.frequencia.verificacao();
        
        if(media >= 75.0 && conclusao >= 3) {
            resultado = "Aluno Aprovado";
        } else {
            resultado = "Aluno Reprovado";
        }
        
        return resultado;
    }*/
    
    @Override
    public String toString() {
        
        String boletim = "";
        
        for(int i = 0; i < this.materias.length; i++) {        
        
           if(i == 0) {
               
               boletim = boletim +
               
                                                                                  "\n" +
               "                                     BOLETIM                                                        "
                                                                                + "\n" +
               "===================================================================================================="
                                                                                + "\n" +
                                               this.materia                     + "\n" +
               
               "====================================================================================================";
           
           } else {
               boletim = boletim +
                                                                                 "\n" +    
               "===================================================================================================="
                                                                               + "\n" +
                                                  this.materia                 + "\n" + 
                                                                               
               //"MATERIA........: "         +      this.materias[i]             + "\n" +
               //"NOTA...........: "         +      this.notas[i]                + "\n" +   
               "====================================================================================================";
           }
                   
        }
        
        return boletim                                                                                 
                                                                                                       + "\n" +
        "====================================================================================================" 
                                                                                                       + "\n" +
                              this.frequencia                                                          + "\n" +  
        "===================================================================================================="
                                                                                                       + "\n" +
        //"MEDIA..........: " + calcularMedia()                                                          + "\n" +
        "===================================================================================================="
                                                                                                       + "\n" +
                                                                                                         "\n" +
        "===================================================================================================="
                                                                                                       + "\n" + 
        "                                  SITUACAO FINAL: " /*+ teste()*/                             + "\n" +
        "===================================================================================================="
                                                                                                       + "\n" +
                                                                                                         "\n" +
                                           this.materia;                                                                  
    }
}