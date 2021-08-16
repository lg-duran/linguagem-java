public class Frequencia {
    
    private String[] data = new String[5];
        
    public Frequencia() {
    }
        
    public void chamada(String data) {        
        int posicaoLivreDoArrayData = percorrerArray();
        this.data[posicaoLivreDoArrayData] = data;
    }

    private int percorrerArray() {
    
        for(int i = 0; i < this.data.length; i++) {
        
            if(this.data[i] == null) {
                return i;
            }
            
        }
        
        return -1;
    }
    
    public int verificacao() {
        
        int verificacao = 0;
        
        for(int i = 0; i < this.data.length; i++) {
        
            if (this.data[i] != null) {
                verificacao = verificacao + 1;
            } 
            
        }
        
        return verificacao;
    }
    
    
    
    @Override
    public String toString() {
        String data = "";
        
        for(int i = 0; i < this.data.length; i++) {
            
            if(i == 0) {
                data = data + this.data[i];
            } else {
                data = data + " | " + this.data[i]; 
            }
            
        }
        
        return "FREQUENCIA.....: " + data + "\n";
               
    }    
}