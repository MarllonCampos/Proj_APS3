
public class insertion {
	
	    
	public static void insertionSort(double vetor [], String v[]) {
	   int j,i;
	    for ( j = 1; j < vetor.length; j++)
	    {
	      double key = vetor[j];
	      String keys = v[j];
	      for ( i = j - 1; (i >= 0) && (vetor[i] > key); i--)
	      {
	         vetor[i + 1] = vetor[i];
	         v[i + 1] = v[i];
	       }
	        vetor[i + 1] = key;
	        v[i + 1] = keys;
	        
	        
	    }
	    
	}
    
}
