public class Programa {

    public static void main(String[] args) { 
        
        Aluno aluno1 = new Aluno("Astoufino", 2008);
               
        Aluno aluno2 = new Aluno("Jurema", 2011);
        
        Materia materia1 = new Materia(aluno1, "Portugues");
        materia1.adicionarNota(95.0);
        materia1.adicionarNota(100.0);
        materia1.adicionarNota(89.0);
        materia1.adicionarNota(99.0);
        
        
        Materia materia2 = new Materia(aluno1, "Ciencias");
        materia2.adicionarNota(97.0);
        materia2.adicionarNota(92.0);
        materia2.adicionarNota(82.0);
        materia2.adicionarNota(100.0);
        
        
        Frequencia frequencia1 = new Frequencia(materia1);
        frequencia1.chamada("24/06");
        frequencia1.chamada("25/06");
        frequencia1.chamada("26/06");
        frequencia1.chamada("27/06");        
        frequencia1.chamada("28/06");
        
        Sala primeiraSala = new Sala("Sala 01", SerieGrau.PRIMEIRA_SERIE.getDescricao(), SerieGrau.PRIMEIRO_GRAU.getDescricao(),
                                                TurmaPeriodo.TURMA_A.getDescricao(), TurmaPeriodo.PERIODO_MATUTINO.getDescricao());
                                                
        
        Boletim boletim1 = new Boletim(aluno1);
        //boletim1.adicionarMateria("Historia", 90.0);
        //boletim1.adicionarMateria("Matematica", 75.0);
        //boletim1.adicionarMateria("Ciencias", 89.0);
        //boletim1.adicionarMateria("Arte", 100.0);
        
        Boletim boletim2 = new Boletim(aluno2);
        //boletim2.adicionarMateria("Arte", 89.0);
        //boletim2.adicionarMateria("Matematica", 100.0);
        //boletim2.adicionarMateria("Historia", 90.0);
        //boletim2.adicionarMateria("Ciencias", 75.0);
        
        
        Relatorio primeiroRelatorio = new Relatorio(aluno1, primeiraSala, boletim1);
        
        Relatorio segundoRelatorio = new Relatorio(aluno2, primeiraSala, boletim2);
        
  
        System.out.println(primeiroRelatorio);
        
        System.out.println(segundoRelatorio);   
    }
} 