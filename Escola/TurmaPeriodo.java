public enum TurmaPeriodo {
    
    TURMA_A_PERIODO_MATUTINO("Turma A do periodo matutino"),
    TURMA_B_PERIODO_MATUTINO("Turma B do periodo matutino"),
    TURMA_C_PERIODO_MATUTINO("Turma C do periodo matutino"),
    TURMA_A_PERIODO_VESPERTINO("Turma A do periodo vespertino"),
    TURMA_B_PERIODO_VESPERTINO("Turma B do periodo vespertino"),
    TURMA_C_PERIODO_VESPERTINO("Turma C do periodo vespertino"),
    TURMA_A_PERIODO_NOTURNO("Turma A do periodo noturno"),
    TURMA_B_PERIODO_NOTURNO("Turma B do periodo noturno"),
    TURMA_C_PERIODO_NOTURNO("Turma C do periodo noturno");
    
    private String descricao;
    
    private TurmaPeriodo(String descricao) {
        this.descricao = descricao;
    }
    
    public String getDescricao() {
        return this.descricao;
    }
}