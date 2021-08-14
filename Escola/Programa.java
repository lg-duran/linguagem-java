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


        Materia materia3 = new Materia(aluno2, "Arte");
        materia3.adicionarNota(02.0);
        materia3.adicionarNota(62.0);
        materia3.adicionarNota(05.0);
        materia3.adicionarNota(12.0);
        
        
        Materia materia4 = new Materia(aluno2, "Matematica");
        materia4.adicionarNota(100.0);
        materia4.adicionarNota(99.0);
        materia4.adicionarNota(95.0);
        materia4.adicionarNota(98.0);


        
        ListaDeMaterias lista1 = new ListaDeMaterias();
        lista1.chamada(materia1);
        lista1.chamada(materia2);
        lista1.chamada(materia3);
        lista1.chamada(materia4);    
       



        Materia[] materiasDoAluno = new Materia[10];

        materiasDoAluno = lista1.materiasDo(aluno2);

        for (int i = 0; i < materiasDoAluno.length; i++) {
            
            System.out.println(materiasDoAluno[i]);

        }


        
        
        
        /*
        Frequencia frequencia1 = new Frequencia(materia1);
        frequencia1.chamada("24/06");
        frequencia1.chamada("25/06");
        frequencia1.chamada("26/06");
        frequencia1.chamada("27/06");        
        frequencia1.chamada("28/06");
        
        Sala primeiraSala = new Sala("Sala 01", SerieGrau.PRIMEIRA_SERIE.getDescricao(), SerieGrau.PRIMEIRO_GRAU.getDescricao(),
                                                TurmaPeriodo.TURMA_A.getDescricao(), TurmaPeriodo.PERIODO_MATUTINO.getDescricao());
        */                                        
        //associaçao de boletim com aluno nao esta muito clara.
        Boletim boletim1 = new Boletim(lista1);
        //boletim1.adicionarMateria("Historia", 90.0);
        //boletim1.adicionarMateria("Matematica", 75.0);
        //boletim1.adicionarMateria("Ciencias", 89.0);
        //boletim1.adicionarMateria("Arte", 100.0);
        
        //Boletim boletim2 = new Boletim(lista2);
        //boletim2.adicionarMateria("Arte", 89.0);
        //boletim2.adicionarMateria("Matematica", 100.0);
        //boletim2.adicionarMateria("Historia", 90.0);
        //boletim2.adicionarMateria("Ciencias", 75.0);
        
        
        Relatorio primeiroRelatorio = new Relatorio(boletim1);
        
        //Relatorio segundoRelatorio = new Relatorio(boletim2);
        
  
        System.out.println(primeiroRelatorio);
        
        //System.out.println(segundoRelatorio);   
    }
} 