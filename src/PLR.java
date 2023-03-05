import java.util.Scanner;

public class PLR {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Double metaAnual = 100000.0;
		Double calculoMetaAnual =   metaAnual * 0.80;
		
		System.out.println("Digite o valor médio do seu salário ");
		Double mediaSalario = scanner.nextDouble();
		
		System.out.println("Digite o lucro real da empresa do ano de 2022 ");
		Double lucroReal = scanner.nextDouble();
		
		Double calculoLucroReal = lucroReal * 0.80;
		Double percentualSalario = mediaSalario * 0.80;
		
		Boolean MetaAtingida = lucroReal >= metaAnual;
		Boolean percentualMediaSalarial = (lucroReal < metaAnual) && lucroReal >= calculoMetaAnual;
		
		if(MetaAtingida) {
			System.out.println("A meta anual foi atingida!! , o funcionário ira receber o bônus de " + mediaSalario);
		} else if (percentualMediaSalarial) {
			System.out.println("A empresa não atingiu 100% da meta anual, mas seu bônus foi de " + percentualSalario);
		} else {
			System.out.println("Empresa não atingiu a meta anual");
		}
		
		
	}

}
