import java.util.Scanner;

public class ValorFumante {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		//Declaração de variáveis
		float preco_maco, qtd_maco, anos, dias_fumante, custo;
		// Solicitar os dados ao usuário
	 System.out.println("Digite o preço do maço:");
	 preco_maco = entrada.nextFloat();
	 System.out.println("Digite a quantidade de maços:");
	 qtd_maco = entrada.nextFloat();
	 System.out.println("Digite a qtd. de anos que fuma:");
	 anos = entrada.nextFloat();
	 // calcula a qtd. de dias como fumante
	 dias_fumante = anos * 365;
	 // calcula a qtd. de dias como fumante
	 dias_fumante = anos * 365;
	 // calcula o gasto do tempo que fuma
	 custo = dias_fumante * preco_maco;
	 // Exibe o custo
	 System.out.println("Você já gastou R$ " + custo + "Fumando");
	}
}