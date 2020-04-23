public class bubble {
	
	public void bubbleSort(double v[], String x[]) {
	   
	        for (int i = v.length; i >= 1; i--) {
	            for (int j = 1; j < i; j++) {
	            	
	                if (v[j - 1] >v[j]) {
	                    double aux =v[j];
	                    v[j] = v[j - 1];
	                    v[j - 1] = aux;
	                    
	                    String auxi =x[j];
	                    x[j] = x[j - 1];
	                    x[j - 1] = auxi;
	                }
	            }
	        }
	    }
	    
}


