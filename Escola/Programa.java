public class Programa {

    public static void main(String[] args) { 
        
        Aluno aluno1 = new Aluno("Astoufino", 2008);
               
        Aluno aluno2 = new Aluno("Jurema", 2011);
        
        
        Nota nota1 = new Nota(aluno1, 90.0, 75.0, 98.0, 100.0);
        
        Nota nota2 = new Nota(aluno2, 85.0, 79.0, 95.0, 97.0);             

        
        
        Sala primeiraSala = new Sala("Sala 01", SerieGrau.PRIMEIRA_SERIE_PRIMEIRO_GRAU.getDescricao(),
                                                TurmaPeriodo.TURMA_A_PERIODO_MATUTINO.getDescricao()); 
                
        Frequencia frequencia1 = new Frequencia(aluno1);
        
        frequencia1.chamada(true, "19/05/2021");
        
        
        Relatorio primeiroRelatorio = new Relatorio("Primeiro", primeiraSala, nota1, frequencia1);
        
        Relatorio segundoRelatorio = new Relatorio("Segundo", primeiraSala, nota2, null);
        
  
        System.out.println(primeiroRelatorio);
        
        System.out.println(segundoRelatorio);       
    }
} 