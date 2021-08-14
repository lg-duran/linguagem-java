public class Relatorio {
    
    private Boletim boletim;
    
    public Relatorio(Boletim boletim) {                
        this.boletim = boletim;
    }
    
    @Override
    public String toString() {
        return "" + this.boletim;
    }
}