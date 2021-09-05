public class Frequencia {
    
    //private Vetor vetor = new Vetor();
    private Materia materia;
    private String[] data = new String[200];
        
    public Frequencia(Materia materia) {
        this.materia = materia;
    }
        
    public void chamada(String data) {        
        int posicaoLivreDoArray = Vetor.percorrerArray(this.data);
        this.data[posicaoLivreDoArray] = data;
    }
    
    private double porcentagemDePresenca() {
        int aulas = aulasAssistidas();        
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
    
    @Override
    public String toString() {   
        return "FREQUENCIA.....: " + porcentagemDePresenca() + "%" + "\n";
    }    
}