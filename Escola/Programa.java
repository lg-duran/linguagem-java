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
        
        Frequencia frequenciaDoAstoufinoPortugues = new Frequencia(astoufinoPortugues);
        frequenciaDoAstoufinoPortugues.chamada("16/08");
        frequenciaDoAstoufinoPortugues.chamada("17/08");
        frequenciaDoAstoufinoPortugues.chamada("18/08");
        frequenciaDoAstoufinoPortugues.chamada("19/08");
        frequenciaDoAstoufinoPortugues.chamada("20/08");      
        
        
        
        
        
        
       
        
        
        Aluno jurema = new Aluno("Jurema", 2011);
        
        Materia juremaCiencias = new Materia(jurema, "Ciencias");
        juremaCiencias.adicionarNota(99.0);
        juremaCiencias.adicionarNota(95.0);
        juremaCiencias.adicionarNota(100.0);
        juremaCiencias.adicionarNota(98.0);  
        
        Frequencia frequenciaJuremaCiencias = new Frequencia(juremaCiencias);
        frequenciaJuremaCiencias.chamada("16/08");
        frequenciaJuremaCiencias.chamada("17/08");        
        frequenciaJuremaCiencias.chamada("18/08");
        frequenciaJuremaCiencias.chamada("19/08");
        frequenciaJuremaCiencias.chamada("20/08");

        Materia juremaArte = new Materia(jurema, "Arte");
        juremaArte.adicionarNota(100.0);
        juremaArte.adicionarNota(10.0);
        juremaArte.adicionarNota(10.0);
        juremaArte.adicionarNota(10.0);
        
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
        //listaDeFrequencia.adicionar(frequenciaDoAstoufinoPortugues);
        
        //Essas 2 linhas de codigo eu nao presciso, isso so esta criando complexidade no codigo.
        //Frequencia[] frequenciasParaImpressao = new Frequencia[10];         
        //frequenciasParaImpressao = listaDeFrequencia.frequenciaDo(jurema);
        

//**************************************************************************************************************************************
//**************************************************************************************************************************************
//**************************************************************************************************************************************
        

       
        Boletim boletim = new Boletim(listaDeFrequencia);
        System.out.println(boletim.imprimir());
         
    }
} 