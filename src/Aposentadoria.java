import java.util.Scanner;
public class Aposentadoria {

	public static void main(String[] args) {
		  
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite sua idade: ");
		Integer idade = scanner.nextInt();
		
		System.out.println("Digite com quantos começou a trabalhar: ");
		Integer idadeInicioTrabalho = scanner.nextInt();
		
		
		Integer anosTrabalhados = idade - idadeInicioTrabalho; 
		
		
		Boolean simAposenta = anosTrabalhados >=25 && idade >= 55;
		
			if(simAposenta) {
				System.out.println("Voce tem idade para se aposentar :");
			} else {
				System.out.println("Voce não tem idade para se aposentar");
			}
		
		
		
	}

}
