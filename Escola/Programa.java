public class Programa {

    public static void main(String[] args) { 
        
        Aluno aluno1 = new Aluno("Astoufino", 2008);
               
        Aluno aluno2 = new Aluno("Jurema", 2011);
         
        
        Materia materia1 = new Materia(aluno1);
        
        materia1.adicionarMateria("Matematica");
        
        materia1.adicionarMateria("Ciencias");
        
        materia1.adicionarMateria("Historia");
        
        
                
        Nota nota1 = new Nota(aluno1);
        
        Nota nota2 = new Nota(aluno2); 
        
        nota1.adicionarNota(90.0);
        
        nota1.adicionarNota(75.0);
        
        
        
        
        
        
        
        
        Sala primeiraSala = new Sala("Sala 01", SerieGrau.PRIMEIRA_SERIE_PRIMEIRO_GRAU.getDescricao(),
                                                TurmaPeriodo.TURMA_A_PERIODO_MATUTINO.getDescricao()); 
       
        
       
        
        
        Relatorio primeiroRelatorio = new Relatorio("Primeiro", primeiraSala, nota1, materia1);
        
        Relatorio segundoRelatorio = new Relatorio("Segundo", primeiraSala, nota2, materia1);
        
  
        System.out.println(primeiroRelatorio);
        
        System.out.println(segundoRelatorio);       
    }
} 