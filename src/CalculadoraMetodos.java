import java.util.Scanner; 
public class CalculadoraMetodos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Double numeroEsquerda = informeNumero(scanner);
		
		imprimirTraco();
		
		Integer operacao = escolhaAOperacao(scanner);
		
		imprimirTraco();
		
		Double numeroDireita = informeNumero(scanner);
		
		imprimirTraco();
		
		Double resultado = RealizarCalculo(operacao, numeroEsquerda, numeroDireita);
		
		System.out.println("O resultado é: " + resultado);
		
		scanner.close();

	}
	
	static Double RealizarCalculo (Integer operacao, Double primeiroValor, Double segundoValor) {
		Double resultado = null;
		
		switch (operacao) {
		
		case 0:
			resultado = subtracao(primeiroValor, segundoValor);
			break;
			
		case 1:
			resultado = adicao(primeiroValor, segundoValor);
			break;
		case 2:
			resultado = multiplicacao(primeiroValor, segundoValor);
			break;
		case 3:
			resultado = divisao(primeiroValor, segundoValor);	
			break;
			
			default:
				System.err.println("Escolha uma opcao valida: ");
				System.exit(0);
		}
		
		return resultado;
		
	}
	
	static Double subtracao(Double numeroEsquerda, Double numeroDireita) {
		return numeroEsquerda - numeroDireita;
	}
	
	static Double adicao(Double numeroEsquerda, Double numeroDireita) {
		return numeroEsquerda + numeroDireita;
	}
	static Double multiplicacao(Double numeroEsquerda, Double numeroDireita) {
		return numeroEsquerda * numeroDireita;
	}
	static Double divisao(Double numeroEsquerda, Double numeroDireita) {
		return numeroEsquerda / numeroDireita;
	}
	
	static Integer escolhaAOperacao(Scanner scanner) {
		System.out.println("ESCOLHA A OPERAÇÃO");
		
		String[] operacoes = new String[] {"Subtração", "Adição", "Multiplicacao", "Divisao"};
		
		for(int i = 0; i < operacoes.length; i++) {
			System.out.println("[" + i + "] " + operacoes[i]);
		}
		
		System.out.print("Digite a operação: ");
		
		return scanner.nextInt();
	}
	
	static Double informeNumero(Scanner scanner) {
		System.out.print("Informe o número: ");
		return scanner.nextDouble();
	}
	
	static void imprimirTraco() {
		System.out.println("---------------------------------------");

}
}
