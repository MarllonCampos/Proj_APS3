import java.awt.image.ConvolveOp;

public class distancias {
	static char[] rotas = new char[40320];
	static char v[] = { '1', '2', '3', '4', '5', '6', '7', '8' };
	//Vetor para receber todas as distancias totais
	static double[] vDistancias = new double[40320];
	static double[] vBubble = new double[40320];
	static double[] vInsert = new double[40320];
	static double[] vSelect = new double[40320];
	static Double m[][]={
			{0.0,	5.3,	3.6,	3.4,	8.6,	5.7,	9.1,	10.9,	8.7},
			{6.9	,0.0	,4.5	,5.3	,3.4	,6.6	,11.1	,9.5,	9.8},
			{4.4	,2.2	,0.0	,3.0	,5.9	,2.9	,8.5	,7.1	,5.4},
			{2.2	,4.8	,3.,0.0	,9.0	,6.5	,6.4	,11.7	,9.5},
			{8.9	,4.1	,5.1	,7.4	,0.	,7.3	,13.1	,12.1	,10.4},
			{5.2	,5.	,2.8	,3.7	,8.7	,0.	,5.3	,5.7	,4.},
			{6.2	,10.6	,8.7	,9.6	,14.4	,6.7	,0.	,6.3	,5.},
			{11.7	,10.5	,9.1	,10.2	,14.2	,4.9	,5.7	,0.	,2.3},
			{8.1	,7.6	,6.2	,6.6	,11.3	,3.3	,7.3	,2.4,	0.}
			};
	static double distancia;
	static int i = 0;
	

	public static void calculadistancia(String vetorcerto[])
	{

				for (int i = 0; i < 40320; i++) {
					
					String k = vetorcerto[i];
					
					distancia = 0;
					for (int j = 0; j < 9; j++) {
						//Pega a posição do vetor e transforma num array para calcular as distancias
						char rotas[] = k.toCharArray();
						int cont=0;
						//Serve pra poder achar as distancias na matriz; entre um ponto e outro
						int lin = Integer.parseInt(String.valueOf(rotas[j]));
						int col = Integer.parseInt(String.valueOf(rotas[j + 1]));
						
						//Soma o total de distancias de cada rota
						distancia = distancia + m[lin][col];
						
					}
				
					vBubble[i]=distancia;
					vInsert[i]=distancia;
					vSelect[i]=distancia;

					
				}
		
		
	}
}
