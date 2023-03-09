import java.util.Scanner;

public class Tarefas {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("digite");
		
		
		String[] tarefasDiarias = new String[5];
		
		for(int i = 0 ; i < tarefasDiarias.length ; i++) {
			System.out.println("Tarefas" + i + ":");
			tarefasDiarias[i] = scanner.nextLine();
		}
		
		System.out.println("Tarefas sao: ");
		for(int i = 0 ; i < tarefasDiarias.length ; i++) {
			System.out.println(i + ":" + tarefasDiarias[i]);
			
		}
		
		scanner.close();
	}

}
