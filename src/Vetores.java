import java.util.Scanner;
public class Vetores {

	public static void main(String[] args) {
		 
		String[] cardapio = new String[] {"Calabresa" , "Quatro queijo" , "Bacon" , "Presunto"};
		
		System.out.println("Escolha o sabor de pizza: ");
		
		for(int i = 0 ; i < cardapio.length ; i++) {
			System.out.println(" [ " + i + " ] " + cardapio[i]);
			
		}
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o numero referente ao sabor");
		Integer sabor = scanner.nextInt();
		
		System.out.println("Sabor escolhido: " + cardapio[sabor]);
		
		scanner.close();
		//aletrando a posicao 3
		cardapio[3] = "Milho";
		
		
	}

}
