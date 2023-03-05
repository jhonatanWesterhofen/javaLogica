import java.util.Scanner;
public class ProvaConcurso {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a sua nota em Português .");
		Double notaPortugues = scanner.nextDouble();
		
		System.out.println("Digite a sua nota em Matemática .");
		Double notaMatematica = scanner.nextDouble();
		
		Boolean passouMatematica = notaMatematica >= 60;
		Boolean passouPortugues = notaPortugues >= 60;
		
		Double notasMaterias = notaMatematica + notaPortugues;
		
		Boolean somatorioDasNotas = notasMaterias >=150;
		
//		Boolean alunoAprovado = somatorioDasNotas && (passouMatematica && passouPortugues);
		
		if(somatorioDasNotas && (passouMatematica && passouPortugues)) {
			System.out.println("Passou");
		} else {
			System.out.println("Não passou");
		}
		
		
	
	

	}

}
