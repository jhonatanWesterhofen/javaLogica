import java.util.Scanner;


public class calculoGastoFamiliar {
	
	public static void main(String[] args) {
		
		Double valorFinal = 0.0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor da sua conta de luz");
		valorFinal += scanner.nextDouble();
		
		System.out.println("Digite o valor da sua conta de agua");
		valorFinal += scanner.nextDouble();
		
		System.out.println("Digite o valor da sua conta de telefone");
		valorFinal += scanner.nextDouble();
		
		System.out.println("Digite o valor da sua da mensalidade da escola");
		valorFinal += scanner.nextDouble();
		
		System.out.println("Digite o valor da sua fatura do cartão de crédito");
		valorFinal += scanner.nextDouble();
		
		System.out.println("Digite o valor gasto do supermercado");
		valorFinal += scanner.nextDouble();
		
		System.out.println("Valor total das contas: " + valorFinal);
		
		scanner.close();
		
		
		
	}

}
