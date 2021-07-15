public class Frequencia {

    private Aluno aluno;
    private boolean[] presenca = new boolean[5];
    private String[] data = new String[5];
        
    public Frequencia(Aluno aluno) {    
        this.aluno = aluno;
    }
        
    public void chamada(boolean presenca, String data) {        
        int posicaoLivreDoArray = percorrerArray();        
        this.presenca[posicaoLivreDoArray] = presenca;
        
        int posicaoLivreDoArrayData = percorrerArrayData();
        this.data[posicaoLivreDoArrayData] = data;
    }
    
    private int percorrerArray() {
    
        for(int i = 0; i < this.presenca.length; i++) {
            
            if(this.presenca[i] == false) {
                return i;
            }    
            
        }
        
        return -1;
    }
    
    public int devolvreConteudoArrayPresenca() {
    
        for(int i = 0; i < this.presenca.length; i++) {
            
            if(this.presenca[i] == false) {
                return i;
            }    
            
        }
        
        return -1;        
    }
    
    public int verificacao() {
        
        int verificacao = 0;
        
        for(int i = 0; i < this.presenca.length; i++) {
        
            if (this.presenca[i] == true) {
                verificacao = verificacao + 1;
            } 
            
        }
        
        return verificacao;
    }
    
    private int percorrerArrayData() {
    
        for(int i = 0; i < this.data.length; i++) {
        
            if(this.data[i] == null) {
                return i;
            }
            
        }
        
        return -1;
    }
    
    @Override
    public String toString() {
        
        String presenca = "";
        String data = "";
        
        for(int i = 0; i < this.presenca.length; i++) {
            
            if(i == 0) {
                presenca = presenca + this.presenca[i];
            } else {
                presenca = presenca + " | " + this.presenca[i]; 
            }
            
        }
        
        for(int i = 0; i < this.data.length; i++) {
            
            if(i == 0) {
                data = data + this.data[i];
            } else {
                data = data + " | " + this.data[i]; 
            }
            
        }
        
        return "FREQUENCIA.....: " + presenca + "\n" +
               "DATA...........: " + data;
    }    
}