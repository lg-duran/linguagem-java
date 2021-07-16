public enum TurmaPeriodo {
    
    TURMA_A("A"),
    TURMA_B("B"),
    TURMA_C("C"),
    
    PERIODO_MATUTINO("Matutino"),
    PERIODO_VESPERTINO("Vespertino"),
    PERIODO_NOTURNO("Noturno");
    
    private String descricao;
    
    private TurmaPeriodo(String descricao) {        
        this.descricao = descricao;        
    }
    
    public String getDescricao() {    
        return this.descricao;        
    }
}