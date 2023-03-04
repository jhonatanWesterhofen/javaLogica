import java.util.Scanner;

public class Compra {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o valor do produto:");
		Double produto = scanner.nextDouble();
		
		Double frete = 15.00;
		Double resultado;
		
		if (produto < 100 ) {
			resultado = produto + frete;
		}else {
			resultado = produto;
		}
		
		System.out.println("Valor da sua compra é: " + resultado);
		
		
	}

}
