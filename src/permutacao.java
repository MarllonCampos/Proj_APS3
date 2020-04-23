public class permutacao {
 
    //numero da permutacao atual
    private static int cont=0; 
     
    //armazena a permutacao corrente
    private static char[] p;    
    static String[] vetorcerto= new String [40321];
    static String[] vetorBubble = new String [40321];
    static String[] vetorInsert = new String [40321];
    static String[] vetorSelect = new String [40321];
    private static int l=0;
     
    /**
     * metodo principal: recebe o vetor cujos elementos que serao permutados
     * @param vet
     */
    public static void permuta(char [] vet) {
         
        p = new char[vet.length];
        permuta(vet,0);
    }
             
 
    /**
     * método recursivo que implementa as permutacoes
     * @param vet
     * @param n
     */
    private static void permuta(char []vet, int n) {
         
        if (n==vet.length) {
            cont++;
            imprime();
                             
        } else {
                     
            for (int i=0; i < vet.length; i++) {
             
                boolean achou = false;
             
                for (int j = 0; j < n; j++) {
                 
                    if (p[j]==vet[i]) achou = true;
                }
             
                if (!achou) {
     
                     
                    p[n] =vet[i];
                    permuta(vet,n+1);
                }
            }
        }
    }    
    /** imprime a permutacao corrente */
    private static void imprime() {
         
        
        String q="";
        for (int i=0; i < p.length; i++) { 
        	q=q+p[i];
        }
 
        vetorBubble[l] = "0"+q+"0";
        vetorInsert[l] = "0"+q+"0";
        vetorSelect[l] = "0"+q+"0";
    	l++;
         
    } 
     
}
