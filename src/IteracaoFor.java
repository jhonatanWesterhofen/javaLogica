import java.util.Iterator;

public class IteracaoFor {

	public static void main(String[] args) {
//		for(int i = 0 ; i < 5 ; i++) {
//			System.out.println("Teste frase");
//		}
		
//		Double[] carrinhoDeCompras = new Double[] {50.0, 51.0, 52.0};
//		Double total = 0.0;
//		
//		for(int i = 0; i<carrinhoDeCompras.length; i++) {
//			total = total + carrinhoDeCompras[i];
//			System.out.println("TESTE: " + i + " total: " + total);
//			
//		}
//		
//		System.out.println("Total: " + total);
		
//			for(int i = 0 ; i < 10; i++) {
//				if(i == 5) {
//					System.out.println("Parou: ");
//					break;
//					
//				}
//				System.out.println("Interação : " +i);
//				
//			}
		
//		for(int i = 0 ; i < 10; i++) {
//			if(i == 5) {
//				System.out.println("Continuar: ");
//				continue;
//				
//			}
//			System.out.println("Interação : " +i);
//			
//		}
		
		Integer[] produtos = new Integer[] {100, 225, 300};
		
		for(int i = 0 ; i < produtos.length ; i++) {
			Integer produto = produtos[i];
			
			System.out.println("Produto de código: " + produto);
			
			if (produto.equals(225)) {
				System.out.println("Produto encontrado: ");
				break;
				
			}
		}
//		
	}

}
