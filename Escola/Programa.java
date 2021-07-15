public class Programa {

    public static void main(String[] args) { 
        
        Aluno aluno1 = new Aluno("Astoufino", 2008);
               
        Aluno aluno2 = new Aluno("Jurema", 2011);
        
        
        Frequencia frequencia1 = new Frequencia(aluno1);
        frequencia1.chamada(true, "24/06");
        frequencia1.chamada(true, "25/06");
        frequencia1.chamada(true, "26/06");
        frequencia1.chamada(false, "27/06");        
        frequencia1.chamada(false, "28/06");
        
        Sala primeiraSala = new Sala("Sala 01", SerieGrau.PRIMEIRA_SERIE_PRIMEIRO_GRAU.getDescricao(),
                                                TurmaPeriodo.TURMA_A_PERIODO_MATUTINO.getDescricao());
                                                
        
        Boletim boletim1 = new Boletim(aluno1, frequencia1);
        boletim1.adicionarMateria("Historia", 90.0);
        boletim1.adicionarMateria("Matematica", 75.0);
        boletim1.adicionarMateria("Ciencias", 89.0);
        boletim1.adicionarMateria("Arte", 100.0);
        
        Boletim boletim2 = new Boletim(aluno2, frequencia1);
        boletim2.adicionarMateria("Arte", 89.0);
        boletim2.adicionarMateria("Matematica", 100.0);
        boletim2.adicionarMateria("Historia", 90.0);
        boletim2.adicionarMateria("Ciencias", 75.0);
        
        
        Relatorio primeiroRelatorio = new Relatorio("Primeiro", aluno1, primeiraSala, boletim1);
        
        Relatorio segundoRelatorio = new Relatorio("Segundo", aluno2, primeiraSala, boletim2);
        
  
        System.out.println(primeiroRelatorio);
        
        System.out.println(segundoRelatorio);       
    }
} 