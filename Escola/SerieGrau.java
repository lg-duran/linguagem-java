public enum SerieGrau {    
   
    
    PRIMEIRA_SERIE("Primeira serie"),
    SEGUNDA_SERIE("Segunda serie"),
    TERCEIRA_SERIE("Terceira serie"),
    QUARTA_SERIE("Quarta serie"),
    QUINTA_SERIE("Quinta serie"),
    SEXTA_SERIE("Sexta serie"),
    SETIMA_SERIE("Setima serie"),
    OITAVA_SERIE("Oitava serie"),  
    NONA_SERIE("Nona serie"),
    
    
    PRIMEIRO_GRAU("Primeiro Grau"),
    SEGUNDO_GRAU("Segundo Grau");
    
    private String descricao;
    
    private SerieGrau(String descricao) {
        this.descricao = descricao;
    }
    
    public String getDescricao() {
        return this.descricao;
    }
}