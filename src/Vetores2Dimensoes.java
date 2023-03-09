
public class Vetores2Dimensoes {

	public static void main(String[] args) {
		
		//Double faturamentoDia = 1000.0;
		
		Double [] faturamentoJaneiro = new Double[] {1000.0, 2000.0, 1700.0 };
		Double [] faturamentoFevereiro = new Double[] {1000.0, 2000.0, 1800.0 };
		
		Double [][] faturamentoAnual = new Double [][] {faturamentoJaneiro, faturamentoFevereiro};
		
//		System.out.println("Faturamento de janeiro: " + faturamentoAnual[0][2]);
//		System.out.println("Faturamento de Fevereiro : " + faturamentoAnual[1][2]);
		
		for(int i = 0 ; i < faturamentoAnual.length ; i++) {
			System.out.println("MÊS: " + ( i + 1));
			
			//Double [] mes = faturamentoAnual[i];
			
			for(int y = 0 ; y < faturamentoAnual[i].length ; y++) {
				Double dia = faturamentoAnual[i][y];
				System.out.println("Dia " + ( y + 1) + " : " + dia);
				
			}
			
		}
		

	}

}
