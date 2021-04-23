public class Programa {

    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno("Lucas", 2008);
        
        Aluno aluno2 = new Aluno("Jonh Connor", 1985);
        
        Aluno aluno3 = new Aluno("Walter", 2006);
        
        Aluno aluno4 = new Aluno("Angela", 2007);
        
        
        Serie primeiraSerie = new Serie("primeira serie");
        Serie segundaSerie= new Serie("segunda serie");
        Serie terceiraSerie = new Serie("terceira serie");
        Serie quartaSerie = new Serie("quarta serie");
        Serie quintaSerie = new Serie("quinta serie");
        Serie sextaSerie = new Serie("sexta serie");
        Serie setimaSerie = new Serie("setima serie");
        Serie oitavaSerie = new Serie("oitava serie");
        Serie nonaSerie = new Serie("nona serie");
        
        Turma turmaA = new Turma("turma A");
        Turma turmaB = new Turma("turma B");
        Turma turmaC = new Turma("turma C");
        
        
        Periodo periodoMatutino = new Periodo("matutino");
        Periodo periodoVespertino = new Periodo("vespertino");
        Periodo periodoNoturno = new Periodo("noturno");        
        
        
        Grau primeiroGrau = new Grau("primeiro grau");
        Grau segundoGrau = new Grau("segundo grau");
        


        
        Sala primeiraSala = new Sala("1 sala", primeiraSerie, turmaA, periodoMatutino, primeiroGrau);        
        Sala segundaSala = new Sala("2 sala", segundaSerie, turmaA, periodoMatutino, primeiroGrau);  
        Sala terceiraSala = new Sala("3 sala", oitavaSerie, turmaB, periodoVespertino, primeiroGrau);        
        
        
        
        Nota nota = new Nota(90.0, 75.0, 98.0, 100.0);
        
        Nota nota2 = new Nota(100.0, 99.0, 98.0, 100.0);

        Nota nota3 = new Nota(70.0, 58.0, 85.0, 88.0);
        
        Nota nota4 = new Nota(98.0, 99.0, 100.0, 100.0); 
        
        
        Relatorio primeiroRelatorio = new Relatorio("Primeiro", aluno1, primeiraSala, nota);
    
        Relatorio segundoRelatorio = new Relatorio("Segundo", aluno2, segundaSala, nota2);
        
        Relatorio terceiroRelatorio = new Relatorio("Terceiro", aluno3, terceiraSala, nota3);
        
        Relatorio quartoRelatorio = new Relatorio("Quarto", aluno4, terceiraSala, nota4);
        
        
        
        
        nota3.aluno = aluno3;
        
        nota4.aluno = aluno4;
        
        //*************************************************************************************************************************
        
        System.out.println(primeiroRelatorio.imprimirRelatorio());
        
        System.out.println(segundoRelatorio.imprimirRelatorio());
        
        System.out.println(terceiroRelatorio.imprimirRelatorio()); 
        
        System.out.println(quartoRelatorio.imprimirRelatorio()); 
                
    }
} 