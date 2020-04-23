
public class selection {
	static char v[] = { '1', '2', '3', '4', '5', '6', '7', '8' };
	
	                  
	 public static void selectionSort(double vetor [], String v[]) {
	  for (int fixo = 0; fixo < vetor.length - 1; fixo++) {
	    int menor = fixo;
	   
	    for (int i = menor + 1; i < vetor.length; i++) {
	       if (vetor[i] < vetor[menor]) {
	          menor = i;
	       }
	    }
	    if (menor != fixo) {
	      double t = vetor[fixo];
	      vetor[fixo] = vetor[menor];
	      vetor[menor] = t;
	      
	      String r = v[fixo];
	      v[fixo] = v[menor];
	      v[menor] = r;
	    }
	  }
	}

	public static void main(String[] args) {
		permutacao permuta = new permutacao();
		permuta.permuta(v);

		distancias dist = new distancias();
		dist.calculadistancia(permuta.vetorcerto);
		
		selectionSort(dist.vDistancias,permuta.vetorcerto);
		
		 for(int i=0;i<7;i++)
	    	{
	    		System.out.println(" Distancia: "+dist.vDistancias[i]+" Rota:"+ permuta.vetorcerto[i]);
	    	}
	}
}
