public class Programa {

    public static void main(String[] args) {

        Serie serie = new Serie("1 ano Ensino Medio");

        Periodo periodo = new Periodo("matutino");

        Turma turma = new Turma("A");
        
        Nota nota = new Nota(90.0, 75.0, 98.0, 100.0);
        
        Aluno aluno1 = new Aluno("Lucas", 2008);
        
        serie.aluno = aluno1;
        
        System.out.println("O conteudo da variavel aluno1 --> " + aluno1);
        
        System.out.println("O conteudo da variavel nome --> " + aluno1.getNome());
        

        System.out.println(aluno1.getNome());
        
        System.out.println(aluno1.calcularIdade(2029));
        
        System.out.println(serie.nome);
        
        System.out.println(serie.aluno.getNome());
        
        //===================================================================
        
        Aluno aluno2 = new Aluno("Jonh Connor", 1985);
        
        Serie serie2 = new Serie("Lider da resistncia contra as maquinas");
        
        serie2.aluno = aluno2;
        
        System.out.println(aluno2.getNome());
        
        System.out.println(serie2.nome);
        
        System.out.println(aluno2.calcularIdade(2029));
        
        System.out.println(serie2.aluno.getNome());        
        
        System.out.println(serie2.aluno.calcularIdade(2029));
        
        
        //===================================================================
        
        System.out.println("=====================================================");
        System.out.println(serie.nome);
        System.out.println(serie.aluno.getNome());
        System.out.println(serie2.nome);
        System.out.println(serie2.aluno.getNome());
        
        System.out.println("=====================================================");

        
        /*Aluno aluno3 = new Aluno("Ninguem", 2008);        
 
        aluno3 = aluno1;
        aluno1 = aluno2;
        
        serie.aluno = aluno2;        
        serie2.aluno = aluno3;*/     

        
        System.out.println(serie.nome);
        System.out.println(serie.aluno.getNome());
        
        System.out.println(serie2.nome);
        System.out.println(serie2.aluno.getNome());
        
        System.out.println("=====================================================");
        
        Aluno aluno3 = new Aluno("Walter", 2006);
        
        Serie serie3 = new Serie("1 ano EM");
        
        Nota nota3 = new Nota(70.0, 58.0, 85.0, 88.0); 
        
        System.out.println(aluno3.getNome());
        
        System.out.println(serie3.nome); 
        
        System.out.println(aluno3.calcularIdade(2021)); 
        
        serie3.aluno = aluno3;
        nota3.aluno = aluno3;
        
        System.out.println(serie3.aluno.getNome()); 
        
        System.out.println(nota3.aluno.getNome()); 
        
        System.out.println(nota3.aluno.calcularIdade(2021)); 
        
        System.out.println(nota3.calcularMedia()); 
        
        System.out.println(""); 
        
        Aluno aluno4 = new Aluno("Angela", 2007);
        
        Serie serie4 = new Serie("9 ano");
        
        Nota nota4 = new Nota(98.0, 99.0, 100.0, 100.0); 
        
        System.out.println(aluno4.getNome());
        
        System.out.println(serie4.nome);
        
        System.out.println(aluno4.calcularIdade(2021)); 
        
        serie4.aluno = aluno4;
        nota4.aluno = aluno4;
        
        System.out.println(serie4.aluno.getNome());
        
        System.out.println(nota4.aluno.getNome()); 
        
        System.out.println(nota4.calcularMedia());

    }
} 