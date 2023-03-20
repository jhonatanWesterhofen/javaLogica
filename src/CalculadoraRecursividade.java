import java.util.Scanner;

public class CalculadoraRecursividade {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Por gentileza informe um numero");
		Integer numero = scanner.nextInt();
			
		imprimirTabuada(numero, 0);
		
		scanner.close();

	}
	
	static void imprimirTabuada (Integer multiplicando, Integer multiplicador) {
		System.out.println(multiplicando + "x" + multiplicador + "=" + (multiplicando * multiplicador));
		
		if (++multiplicador <= 10) {
			imprimirTabuada(multiplicando, multiplicador);
		}
		
		
	}

}
