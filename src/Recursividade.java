import java.util.Scanner;

public class Recursividade {
	
	public static void main(String[] args) {
		
		
		//Teste regra de tres
//			
//			Double [] premissaInicial = new Double[] {50.0, 100.0};
//			Double proporcao = 20.0;
//			
//			Double resultadoFinal = regraDeTres(premissaInicial, proporcao);
//			
//			System.out.println("Resultado: " +resultadoFinal);
//		}
	//	
//		static Double regraDeTres(Double [] premissa, Double proporcao) {
//			Double resultado = (premissa[0] * proporcao)/premissa[1];
//			
//			return resultado;
//		}
		
				Scanner scanner = new Scanner(System.in);
				
				imprimirTraco();
				
				String[] cursos = new String[] {"Java EE", "Spring", "Java OO Avançado"};
				
				imprimir("Escolha dentre os cursos abaixo");
				
				posicoesVetor(cursos);
			
				Integer posicaoCursoEscolhido = recebeNumeroInteiro("O curso que você deseja: " ,scanner);
				
				Boolean posicaoValida = verificaPosicaoEscolhida(posicaoCursoEscolhido, cursos); 
				
				if (!posicaoValida) {
					EncerrarPosicaoInvalida();
				}
				
				imprimirTraco();
				
				String[] formasPagamento = new String[] {"Cartão", "Boleto"};
				
				System.out.println("Escolha dentre as formas de pagamento abaixo: ");
				
				posicoesVetor(formasPagamento);
		
				Integer posicaoFormaPagamentoEscolhida = recebeNumeroInteiro("Sua forma de pagamento escolhida é: " ,scanner);
				
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
		
		static Integer recebeNumeroInteiro (String texto, Scanner scanner) {
			System.out.print("O curso que você deseja é o: ");
			Integer numero = scanner.nextInt();
			
			return numero;
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
				posicoesVetor(vetor,0);
					}
			
			static void posicoesVetor(String[] vetor, Integer i) {
				System.out.println("[" + i + "] " + vetor[i]);
				
				if (++i < vetor.length) {
					posicoesVetor(vetor, i);
				}
				
					}
			
			static void imprimir(String texto) {
				System.out.println(texto);
			}



}

//public static void main(String[] args) {
//	
//	String[] alunos = new String[] {"Jhonatan", "Jose", "Pedro"};
//
//	IterarNumeros(alunos, 0);
//
//}
//
//static void IterarNumeros (String[] alunos, Integer i) {
//	System.out.println("Aluno: " + alunos[i]);
//	
//	if(++i < alunos.length) {
//		IterarNumeros(alunos, i);
//	}
//}
//	


