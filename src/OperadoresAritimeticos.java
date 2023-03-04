
public class OperadoresAritimeticos {
	
	public static void main(String[] args) {
		Integer adicao = 1+1;
		System.out.println("Adição: "+ adicao);
		
		Integer subtracao = 1-1;
		System.out.println("subtracao: "+ subtracao);
		
		Integer divisao = 4/2;
		System.out.println("Divisao: "+ divisao);
		
		Integer multi= 5*6;
		System.out.println("multiplicação: "+ multi);
		
		Integer modulo = 7 % 4;
		System.out.println("Módulo : " + modulo);
		
		Integer precedencia01 = 1 + 1 * 5;
		System.out.println("Resultado precedencia: " + precedencia01);
		
		Integer precedencia02 = (1 + 1) * 5;
		System.out.println("Resultado precedencia: " + precedencia02);
		
		Integer um = 1;
		Integer cinco = 5;
		
		Integer precedencia03 = cinco + (um + um);
		System.out.println("Resultado precedencia: " + precedencia03);
		
		
	}
	
}
