public class Frequencia {
    
    //private Vetor vetor = new Vetor();
    private Materia materia;
    private String[] data = new String[5];
        
    public Frequencia(Materia materia) {
        this.materia = materia;
    }
        
    public void chamada(String data) {        
        int posicaoLivreDoArray = Vetor.percorrerArray(this.data);
        this.data[posicaoLivreDoArray] = data;
    }
    
    public Aluno getAluno() {
        return this.materia.getAluno();
    }
    
    public Materia getMateria() {
        return this.materia;
    }
    
    private double porcentagemDePresenca() {
        double aulas = aulasAssistidas();        
        return aulas / this.data.length * 100;
    }
    
    private int aulasAssistidas() {    
        int contadorDePosicoesOcupados = 0;        
        for(int i = 0; i < this.data.length; i++) {            
            if (this.data[i] != null) {
                contadorDePosicoesOcupados++;
            }            
        }        
        return contadorDePosicoesOcupados;
    }     
    
    public boolean aprovacaoDeFrequencia() {
        return porcentagemDePresenca() >= 75;
    }    
    
    public boolean aporvacaoPorMateria() {
        return this.materia.aprovadoPorMedia();
    }
    
    @Override
    public String toString() {   
        return "FREQUENCIA.....: " + porcentagemDePresenca() + "%" + "\n" +
        "====================================================================================================";
    }    
}