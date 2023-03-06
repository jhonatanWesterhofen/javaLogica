import java.util.Scanner;
public class DiasDaSemana {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número referente ao dia da semana de 1 a 7: ");
		Integer semana = scanner.nextInt();
		
		switch (semana) {
		case 1: {
			System.out.println("domingo");
			break;
		}
		case 2: {
			System.out.println("Segunda-feira");
			break;
		}
		case 3: {
			System.out.println("Terça-feira");
			break;
		}
		case 4: {
			System.out.println("Quarta-feira");
			break;
		}
		case 5: {
			System.out.println("Quinta-feira");
			break;
		}
		case 6: {
			System.out.println("Sexta-feira");
			break;
		}
		case 7: {
			System.out.println("Sábado");
			break;
		}
		default:
			System.err.println("Digite um número referente ao dia da semana válido");
			scanner.close();
		}
	}

}
