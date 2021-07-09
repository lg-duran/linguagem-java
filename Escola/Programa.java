public class Programa {

    public static void main(String[] args) { 
        
        Aluno aluno1 = new Aluno("Astoufino", 2008);
               
        Aluno aluno2 = new Aluno("Jurema", 2011);
         

        Nota nota1 = new Nota(aluno1);
        nota1.adicionarNota(90.0);        
        nota1.adicionarNota(75.0);
        nota1.adicionarNota(89.0);
        nota1.adicionarNota(100.0);               
        
        Nota nota2 = new Nota(aluno2); 
        nota2.adicionarNota(99.0);
        nota2.adicionarNota(90.0);
        nota2.adicionarNota(100.0);
        nota2.adicionarNota(95.0);
        
        
        Materia materia1 = new Materia(nota1);
        
        materia1.adicionarNota(nota1);
        
        
        
        
        Frequencia frequencia1 = new Frequencia(aluno1);
        frequencia1.chamada(true, "24/06/");
        frequencia1.chamada(true, "25/06");
        frequencia1.chamada(true, "28/06");
        frequencia1.chamada(false, "29/06");
        frequencia1.chamada(true, "30/06");
        
        
        Sala primeiraSala = new Sala("Sala 01", SerieGrau.PRIMEIRA_SERIE_PRIMEIRO_GRAU.getDescricao(),
                                                TurmaPeriodo.TURMA_A_PERIODO_MATUTINO.getDescricao()); 
       
        
        Boletim boletim1 = new Boletim(aluno1, nota1);
        boletim1.adicionarMateria("Historia");
        boletim1.adicionarMateria("Matematica");
        boletim1.adicionarMateria("Ciencias");
        boletim1.adicionarMateria("Arte");
        
        Boletim boletim2 = new Boletim(aluno2, nota2);
        boletim2.adicionarMateria("Arte");
        boletim2.adicionarMateria("Matematica");
        boletim2.adicionarMateria("Historia");
        boletim2.adicionarMateria("Ciencias");
        
        
        Relatorio primeiroRelatorio = new Relatorio("Primeiro", primeiraSala, nota1, materia1, frequencia1, boletim1);
        
        Relatorio segundoRelatorio = new Relatorio("Segundo", primeiraSala, nota2, materia1, frequencia1, boletim2);
        
  
        System.out.println(primeiroRelatorio);
        
        System.out.println(segundoRelatorio);       
    }
} 