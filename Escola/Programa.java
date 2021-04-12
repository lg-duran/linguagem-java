public class Programa {

    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno("Lucas", 2008);
        
        Aluno aluno2 = new Aluno("Jonh Connor", 1985);
        
        Aluno aluno3 = new Aluno("Walter", 2006);
        
        Aluno aluno4 = new Aluno("Angela", 2007);
        
        
        Serie serie = new Serie("1 ano Ensino Medio");
        
        Serie serie2 = new Serie("Lider da resistncia contra as maquinas");
        
        Serie serie3 = new Serie("1 ano EM");
        
        Serie serie4 = new Serie("9 ano");
        

        Periodo periodo = new Periodo("matutino");
        


        Turma turma = new Turma("A");
        
        Turma turma2 = new Turma("A");
        
        Turma turma3 = new Turma("A");
        
        Turma turma4 = new Turma("A");
        
        
        Nota nota = new Nota(90.0, 75.0, 98.0, 100.0);
        
        Nota nota2 = new Nota(100.0, 99.0, 98.0, 100.0);

        Nota nota3 = new Nota(70.0, 58.0, 85.0, 88.0);
        
        Nota nota4 = new Nota(98.0, 99.0, 100.0, 100.0); 
        
        
        
        serie.aluno = aluno1;
        
        serie2.aluno = aluno2;
        
        serie3.aluno = aluno3;
        
        serie4.aluno = aluno4;
        
        
        nota3.aluno = aluno3;
        
        nota4.aluno = aluno4;
        
        //*************************************************************************************************************************
        
        System.out.println("====================================================================================================");
        
        System.out.println("NOME...: " + aluno1.getNome());
        
        System.out.println("IDADE..: " + aluno1.calcularIdade(2029));
        
        System.out.println("SERIE..: "  + serie.getNome());
        
        System.out.println("SERIE..: "  + serie.aluno.getNome());
        
        System.out.println("TURMA..: " + turma.nome);
        
        System.out.println("NOTA...: " + nota);
        
        System.out.println("MEDIA..: " + nota.calcularMedia());
        
        System.out.println("====================================================================================================");
        
        System.out.println(""); 
        System.out.println("");
        
        System.out.println("====================================================================================================");
        
        System.out.println("NOME...: " + aluno2.getNome());
        
        System.out.println("IDADE..: " + aluno2.calcularIdade(2029));
        
        System.out.println("SERIE..: "  + serie2.getNome());
        
        System.out.println("SERIE..: "  + serie2.aluno.getNome());
        
        System.out.println("TURMA..: " + turma2.nome);
        
        System.out.println("NOTA...: " + nota2);
        
        System.out.println("MEDIA..: " + nota.calcularMedia());
        
        System.out.println("====================================================================================================");
        
        System.out.println(""); 
        System.out.println("");
        
        System.out.println("====================================================================================================");
        
        System.out.println("NOME...: " + aluno3.getNome());
        
        System.out.println("IDADE..: " + aluno3.calcularIdade(2029));
        
        System.out.println("SERIE..: "  + serie3.getNome());
        
        System.out.println("SERIE..: "  + serie3.aluno.getNome());
        
        System.out.println("TURMA..: " + turma3.nome);
        
        System.out.println("NOTA...: " + nota3);
        
        System.out.println("MEDIA..: " + nota.calcularMedia());
        
        System.out.println("===================================================================================================="); 
        
        System.out.println(""); 
        System.out.println("");
        
        System.out.println("====================================================================================================");
        
        System.out.println("NOME...: " + aluno4.getNome());
        
        System.out.println("IDADE..: " + aluno4.calcularIdade(2021));
        
        System.out.println("SERIE..: "  + serie4.getNome());
        
        System.out.println("SERIE..: "  + serie4.aluno.getNome());
        
        System.out.println("TURMA..: " + turma4.nome);
        
        System.out.println("NOTA...: " + nota4);
        
        System.out.println("MEDIA..: " + nota.calcularMedia());
        
        System.out.println("====================================================================================================");
    }
} 