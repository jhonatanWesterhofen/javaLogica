
public class OperadoresLogicos {

	public static void main(String[] args) {
		
		Boolean carrinhoMaiorQue100 = false;
		Boolean periodoDePromocao = true;
		Boolean jaFezCompraNaLoja = true;
		Boolean pagamentoAvista = true;
				
				Boolean aplicarDesconto = periodoDePromocao && (carrinhoMaiorQue100 || jaFezCompraNaLoja) && pagamentoAvista;
				
				if(aplicarDesconto) {
					System.out.println("Sim pode ser aplicado o desconto: ");
				} else {
					System.out.println("Não aplique o desconto: ");
				}
				
	}

}
