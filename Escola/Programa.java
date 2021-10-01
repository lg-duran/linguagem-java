public class Programa {

    public static void main(String[] args) {        

        ListaDeFrequencia listaDeFrequencia = new ListaDeFrequencia();
        
        
        
        
         
        /* aluno **************************************************************************** */
        Aluno astoufino = new Aluno("Astoufino", 2008);        
        // ***********************************************************************************************
        
        /* astoufino *************************************************************************************/        
        
        Materia astoufinoPortugues = new Materia(astoufino, "Portugues");
        astoufinoPortugues.adicionarNota(95.0);
        astoufinoPortugues.adicionarNota(100.0);
        astoufinoPortugues.adicionarNota(89.0);
        astoufinoPortugues.adicionarNota(99.0);
        
        Frequencia frequenciaDoAstoufino = new Frequencia(astoufinoPortugues);
        frequenciaDoAstoufino.chamada("16/08");
        frequenciaDoAstoufino.chamada("17/08");
        frequenciaDoAstoufino.chamada("18/08");
        frequenciaDoAstoufino.chamada("19/08");
        frequenciaDoAstoufino.chamada("20/08");      
        

        
        
        
        
       
        
        
        Aluno jurema = new Aluno("Jurema", 2011);
        
        Materia juremaCiencias = new Materia(jurema, "Ciencias");
        juremaCiencias.adicionarNota(95.0);
        juremaCiencias.adicionarNota(98.0);
        juremaCiencias.adicionarNota(100.0);
        juremaCiencias.adicionarNota(92.0);  
        
        Frequencia frequenciaJuremaCiencias = new Frequencia(juremaCiencias);
        frequenciaJuremaCiencias.chamada("16/08");
        frequenciaJuremaCiencias.chamada("17/08");
        frequenciaJuremaCiencias.chamada("18/08");
        frequenciaJuremaCiencias.chamada("19/08");
        frequenciaJuremaCiencias.chamada("20/08");

        Materia juremaArte = new Materia(jurema, "Arte");
        juremaArte.adicionarNota(100.0);
        juremaArte.adicionarNota(100.0);
        juremaArte.adicionarNota(100.0);
        juremaArte.adicionarNota(100.0);
        
        Frequencia frequenciaJuremaArte = new Frequencia(juremaArte);
        frequenciaJuremaArte.chamada("16/08");
        frequenciaJuremaArte.chamada("17/08");
        frequenciaJuremaArte.chamada("18/08");
        frequenciaJuremaArte.chamada("19/08");
        frequenciaJuremaArte.chamada("20/08");
        
        
        Materia juremaMatematica = new Materia(jurema, "Matematica");
        juremaMatematica.adicionarNota(100.0);
        juremaMatematica.adicionarNota(99.0);
        juremaMatematica.adicionarNota(95.0);
        juremaMatematica.adicionarNota(98.0);
        
        Frequencia frequenciaJuremaMatematica = new Frequencia(juremaMatematica);
        frequenciaJuremaMatematica.chamada("16/08");
        frequenciaJuremaMatematica.chamada("17/08");
        frequenciaJuremaMatematica.chamada("18/08");
        frequenciaJuremaMatematica.chamada("19/08");
        frequenciaJuremaMatematica.chamada("20/08");
        
        
       //************************************************************************************************************
        listaDeFrequencia.adicionar(frequenciaJuremaCiencias);
        listaDeFrequencia.adicionar(frequenciaJuremaArte);
        listaDeFrequencia.adicionar(frequenciaJuremaMatematica);
        
        Frequencia[] frequenciasParaImpressao = new Frequencia[10];
         
        frequenciasParaImpressao = listaDeFrequencia.frequenciaDo(jurema);
        

//**************************************************************************************************************************************
//**************************************************************************************************************************************
//**************************************************************************************************************************************
        
       
/*
        Frequencia frequencia1 = new Frequencia(mateira1);
        frequencia1.chamada("16/08");
        frequencia1.chamada("17/08");
        frequencia1.chamada("18/08");
        frequencia1.chamada("19/08");
        frequencia1.chamada("20/08");*/
        
        
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
        Boletim boletimDaJurema = new Boletim(jurema);
        boletimDaJurema.criarBoletim(frequenciasParaImpressao);
        
        
        //Boletim boletim2 = new Boletim(lista2);
        //boletim2.adicionarMateria("Arte", 89.0);
        //boletim2.adicionarMateria("Matematica", 100.0);
        //boletim2.adicionarMateria("Historia", 90.0);
        //boletim2.adicionarMateria("Ciencias", 75.0);
        
        
        Relatorio primeiroRelatorio = new Relatorio(jurema, boletimDaJurema);
        
        //Relatorio segundoRelatorio = new Relatorio(boletim2);
        
  
        System.out.println(primeiroRelatorio);
        
      
        
        //System.out.println(segundoRelatorio);   
    }
} 