package exemplos;

public class Ex13_CicloFor {

	public static void main (String[]args) {

		// O ciclo for é um outro tipo de repetição. Ele carrega três configuração:
		// Dado que; Enquanto; Faça a cada ciclo;
		// Como exemplo vou fazer dado que i = 0, enquanto i < 50, a cada ciclo incremente 1.
		for(int i = 0; i < 50; ++i) {
			System.out.println(i);

		// A ultima configuração não é obrigatória, só que mais uma vez, isso faria ele imprimir infinitamente.
		// A segunda configuração também não é, mas isso faria ele imprimir e incrementar pra sempre.
		// As duas primeiras configurações podem ser compostas: eu posso inicializar mais de uma variável e
		// posso colocar mais de uma condição usando operadores lógicos.
		}
	}

}
