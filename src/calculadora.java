import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite um número");
		Double primeiroNumero = scanner.nextDouble();
		
		System.out.println("Operadores que sera feita a multiplicação [1 = + 2| 2 = - | 3 = * | 4 = /]");
		Integer operadores = scanner.nextInt();
		
		System.out.println("Digite outro número");
		Double segundoNumero = scanner.nextDouble();
		
		Double resultado = null;
		
		if (operadores.equals(1)) {
			resultado = primeiroNumero + segundoNumero;
		}
		
		if (operadores.equals(2)) {
			resultado = primeiroNumero - segundoNumero;
		}
		
		if (operadores.equals(3)) {
			resultado = primeiroNumero * segundoNumero;
		}
		
		if (operadores.equals(4)) {
			resultado = primeiroNumero / segundoNumero;
		}
		System.out.println("Resultado: " + resultado);
	}
	
}
