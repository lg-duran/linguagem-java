public class Programa {
    
    public static void main(String[] args) {

        Serie serie = new Serie("1 ano Ensino Medio");
        
        Periodo periodo = new Periodo("matutino");
        
        Turma turma = new Turma("A");
        
        Aluno aluno1 = new Aluno("Gerostolfo", 2008, serie, periodo, turma);
              
        
        System.out.println(aluno1.nome);
        System.out.println(aluno1.calcularIdade(2029));
        System.out.println(aluno1.serie.nome);
        System.out.println(aluno1.periodo.nome);
        System.out.println(aluno1.turma.nome);
        
    }
}