import java.util.Scanner;

public class Parametros {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			imprimirTraco();
			
			String[] cursos = new String[] {"Java EE", "Spring", "Java OO Avançado"};
			
			imprimir("Escolha dentre os cursos abaixo");
			
			posicoesVetor(cursos);
	
			System.out.print("O curso que você deseja é o: ");
			Integer posicaoCursoEscolhido = scanner.nextInt();
			
			Boolean posicaoValida = verificaPosicaoEscolhida(posicaoCursoEscolhido, cursos); 
			
			if (!posicaoValida) {
				EncerrarPosicaoInvalida();
			}
			
			imprimirTraco();
			
			String[] formasPagamento = new String[] {"Cartão", "Boleto"};
			
			System.out.println("Escolha dentre as formas de pagamento abaixo: ");
			
			posicoesVetor(formasPagamento);
	
			System.out.print("Sua forma de pagamento escolhida é: ");
			Integer posicaoFormaPagamentoEscolhida = scanner.nextInt();
			
			posicaoValida = verificaPosicaoEscolhida(posicaoFormaPagamentoEscolhida, formasPagamento);
			
			if (!posicaoValida) {
				EncerrarPosicaoInvalida();
			}
			
			String cursoEscolhido = cursos[posicaoCursoEscolhido];
			String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];
			
			imprimirTraco();
			
			System.out.println("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento é " + formaPagamentoEscolhida);
			
			scanner.close();
		}
	
		static Boolean verificaPosicaoEscolhida(Integer posicao, String[]vetor) {
			Boolean valida =   posicao >= 0 && posicao < vetor.length;
			return valida;
		}
		
		static void imprimirTraco() {
			System.out.println("----------------------------------------------");
				}
						
		static void EncerrarPosicaoInvalida() {
			System.err.println("Posição inválida!");
			System.exit(1);
						
				}
						
		static void posicoesVetor(String[] vetor) {
			for(int i = 0; i < vetor.length; i++) {
				System.out.println("[" + i + "] " + vetor[i]);
					}
				}
		
		static void imprimir(String texto) {
			System.out.println(texto);
		}
			
			
		
	

}
