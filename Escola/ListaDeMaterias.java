public class ListaDeMaterias {
    
    private Materia[] materias = new Materia[10];    
    
    public ListaDeMaterias() {        
    }
    
    public void chamada(Materia materia) {
        int posicaoVazia = percorrerArray();
        this.materias[posicaoVazia] = materia;        
    }
    
    
    private int percorrerArray() {
    
        for(int i = 0; i < this.materias.length; i++) {        
            
            if(this.materias[i] == null) {
                return i;
            }
            
        }
        
        return 0;
    }

    public Materia[] materiasDo(Aluno aluno) {

        Materia[] listaDefinitiva = new Materia[10];

        for (int i = 0; i < this.materias.length; i++) {
            
            if (this.materias[i] != null) {                

                if (this.materias[i].getAluno() == aluno) {                
                    listaDefinitiva[i] = this.materias[i];

                    System.out.println("###" + this.materias[i]);
                } 

            }


        }

        return listaDefinitiva;


    }
    
    
    @Override
    public String toString() {
        String materias = "";
        
        for(int i = 0; i < this.materias.length; i++) {
        
            if(this.materias[i] == null) {
            
            } else {
                materias =
                
                "" + this.materias[i];
            }
            
        }
        
        return materias;
    }
}