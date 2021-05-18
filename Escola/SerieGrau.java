public enum SerieGrau {
    
    PRIMEIRA_SERIE_PRIMEIRO_GRAU("Primeira serie do primeiro grau"),
    SEGUNDA_SERIE_PRIMEIRO_GRAU("Segunda serie do primeiro grau"),
    TERCEIRA_SERIE_PRIMEIRO_GRAU("Terceira serie do primeiro grau"),
    QUARTA_SERIE_PRIMEIRO_GRAU("Quarta serie do primeiro grau"),
    QUINTA_SERIE_PRIMEIRO_GRAU("Quinta serie do primeiro grau"),
    SEXTA_SERIE_PRIMEIRO_GRAU("Sexta serie do primeiro grau"),
    SETIMA_SERIE_PRIMEIRO_GRAU("Setima serie do primeiro grau"),
    OITAVA_SERIE_PRIMEIRO_GRAU("Oitava serie do primeiro grau"),
    NONA_SERIE_PRIMEIRO_GRAU("Nona serie do primeiro grau"),     
    
    PRIMEIRA_SERIE_SEGUNDO_GRAU("Primeira serie do segundo grau"),
    SEGUNDA_SERIE_SEGUNDO_GRAU("Segunda serie do segundo grau"),
    TERCEIRA_SERIE_SEGUNDO_GRAU("Terceira serie do segundo grau");
    
    private String descricao;
    
    private SerieGrau(String descricao) {
        this.descricao = descricao;
    }
    
    public String getDescricao() {
        return this.descricao;
    }
}