public class Programa {

    public static void main(String[] args) { 
        
        Aluno aluno1 = new Aluno("Astoufino", 2008);
               
        Aluno aluno2 = new Aluno("Jurema", 2011);
        
        
        Nota nota1 = new Nota(aluno1, 90.0, 75.0, 98.0, 100.0);
        
        Nota nota2 = new Nota(aluno2, 85.0, 79.0, 95.0, 97.0);        
        
        
        Serie primeiraSerie = new Serie("primeira serie");
        
        
        Turma turmaA = new Turma("turma A");        
        
        
        Periodo periodoMatutino = new Periodo("matutino");        
        
        
        Grau primeiroGrau = new Grau("primeiro grau");
        
        
        Sala primeiraSala = new Sala("1 sala", primeiraSerie, turmaA, periodoMatutino, primeiroGrau); 
                
        
        Relatorio primeiroRelatorio = new Relatorio("Primeiro", aluno1, primeiraSala, nota1); 
        
        Relatorio segundoRelatorio = new Relatorio("Segundo", aluno2, primeiraSala, nota2);
        
  
        System.out.println(primeiroRelatorio);
        
        System.out.println(segundoRelatorio);       
    }
} 