public final class Vetor {
    
    public static int percorrerArray(double[] array) {        
        for(int i = 0; i < array.length; i++) {        
            if(array[i] == 0) {            
                return i;                
            }            
        }        
        return 0;
    }       
    
    public static int percorrerArray(String[] array) {        
        for(int i = 0; i < array.length; i++) {        
            if(array[i] == null) {            
                return i;                
            }            
        }        
        return 0;
    }
    
    public static int percorrerArray(Object[] obj) {        
        for(int i = 0; i < obj.length; i++) {        
            if(obj[i] == null) {            
                return i;                
            }            
        }        
        return 0;
    }    
    
    public static Materia devolverConteudoDoArray(int posicao, Materia[] materia) {
        if(materia[posicao] != null) {            
            return materia[posicao];                
        }            
        return null;
    }
    
    public static double calcularMedia(double[] array) {
        double nota = 0;  
        for(int i = 0; i < array.length; i++) {
            nota = nota + array[i];
        }        
        return nota / 4;
    }
}