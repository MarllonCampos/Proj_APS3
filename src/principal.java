import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class principal {
	
	static char v[] = { '1', '2', '3', '4', '5', '6', '7', '8' };
	
	  public static void main(String[] args)   {
		String maior,menor;
		DecimalFormat formato = new DecimalFormat("#,##0");
		String r = "";
		permutacao permuta = new permutacao();
		permuta.permuta(v);
		
    	distancias dist=new distancias();
	    dist.calculadistancia(permuta.vetorBubble);
	    
	    double tempoBubble = calc_bubble(dist.vBubble, permuta.vetorBubble);
	    String rB = "BubbleSort - Tempo utilizado: "+tempoBubble;
	    
	    double tempoInsertion = calc_insertion(dist.vInsert, permuta.vetorInsert);
	    String rI = "InsertionSort - Tempo utilizado: "+ tempoInsertion;  
	    
	    double temposelection = calc_selection(dist.vSelect, permuta.vetorSelect);
	    String rS = "SelectionSort - Tempo utilizado: "+temposelection;  
	    
	    //Verificando o Menor
	    menor="Bubble";
	    if(tempoInsertion < tempoBubble && tempoInsertion < temposelection) {
	    	menor = "Insertion";
	    }
	    if(temposelection < tempoBubble && temposelection < tempoInsertion) {
	    	menor = "Selection";
	    }
	    
	  //Verificando o Maior
	    maior="Bubble";
	    if(tempoInsertion > tempoBubble && tempoInsertion > temposelection) {
	    	maior = "Insertion";
	    }
	    if(temposelection > tempoBubble && temposelection > tempoInsertion) {
	    	maior = "Selection";
	    }
	    
	    for (int i=0;i<10;i++)
	    {
	    	r= r + "A Rota " + permuta.vetorBubble[i] +" Com a distancia " + String.format("%.2f",dist.vBubble[i]) + " " + (i+1) + "º Lugar \n";
	    }
	    r = r + "\nA ultima Rota foi " + permuta.vetorBubble[permuta.vetorBubble.length-2] + " E sua distância é " + String.format("%.2f",dist.vBubble[dist.vBubble.length-1]);
	    
	    r = r + "\n" + rB + "ms" + "\n" + rI + "ms" + "\n"+ rS + "ms";
	    
	    r=r + "\n O método mais rapido de Ordenação foi " + menor;
	    r=r + "\n O método mais lento de Ordenação foi " + maior;
	    
	    
	    JOptionPane.showMessageDialog(null,r);
	}

	public static double calc_bubble(double vetor [], String v[]) {
		
	    
		
		double tempo=0;
		
		
		bubble blu= new bubble();
		
		long tempoInicial = System.currentTimeMillis();

		
		blu.bubbleSort(vetor,v);

        long tempoFinal = System.currentTimeMillis();

        tempo =(tempoFinal-tempoInicial); 
        
		return tempo;
	}	
	public static double calc_insertion(double vetor [], String v[]) {
		double tempo=0;
		
		
		insertion ins= new insertion();
		
		long tempoInicial = System.currentTimeMillis();

		ins.insertionSort(vetor,v);

		long tempoFinal = System.currentTimeMillis();

        tempo =(tempoFinal-tempoInicial); 
        
       
		return tempo;
	}	
	public static double calc_selection(double vetor [], String v[]) {
		double tempo=0;
		
		selection select= new selection();
		
		long tempoInicial = System.currentTimeMillis();

		select.selectionSort(vetor,v);

        long tempoFinal = System.currentTimeMillis();

        tempo =(tempoFinal-tempoInicial); 
        
       
		return tempo;
	}
}
