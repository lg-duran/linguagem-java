public class Materia {

    private Nota nota;
    private Nota[] notas = new Nota[4];
        
    public Materia(Nota nota) {
        this.nota = nota;
    }
    
    public void adicionarNota(Nota nota) {
        int posicaoVazia = percorrerArray();
        this.notas[posicaoVazia] = nota;
    }
    
    private int percorrerArray() {
        
        for (int i = 0; i < this.notas.length; i++) {
        
            if (this.notas[i] == null) {
                return i;
            }
            
        }
        
        return 0;
    } 
    
    @Override
    public String toString() {
        String nota = "";
        
        for (int i = 0; i < this.notas.length; i++) {            
            
            if(i == 0) {
                nota = nota + this.notas[i];    
            } else {
                nota = nota + " | " + this.notas[i];    
            }
            
        }
        
        return "NOTA...........: " + nota;
    }
}