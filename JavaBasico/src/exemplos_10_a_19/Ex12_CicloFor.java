package exemplos_10_a_19;
/*
 * O for é um outro tipo de estrutura de repetição que nos permite controlar o
 * fluxo de execução. Ele é um pouco mais complexo e permite algumas configurações.
 */
public class Ex12_CicloFor {

	public static void main (String[]args) {

// for
		// Ele carrega três configurações:
		// Dado que; Enquanto; Faça a cada ciclo;
		// Como exemplo vou fazer dado que i = 0, enquanto i < 50, a cada ciclo incremente 1.
		for(int i = 0; i < 50; ++i) {
			System.out.println(i);
		}

		/*
		 * A ultima configuração não é obrigatória, só que mais uma vez, isso faria ele
		 * imprimir infinitamente. A segunda configuração também não é, mas isso faria 
		 * ele imprimir e incrementar pra sempre. As duas primeiras configurações podem
		 * ser compostas: eu posso inicializar mais de uma variável e posso colocar mais
		 * de uma condição usando operadores lógicos.
		 */

// Sintaxe alternativa 

	// Essa forma de escrever um laço for é especialmente útil pra iterar em listas e vetores,
	// coleções em geral. Eu vou tratar de vetores no exemplo 15 mas como isso aqui é uma sintaxe
	// alternativa pro for, eu vou antecipar nesse exemplo mesmo pra mostrar como se usa.

		// Isso é um vetor contendo 7 itens do tipo int
		int[] x = {1,2,3,4,5,6,7};

		// Antes eu faria isso pra iterar nele:
		for (int i = 0; i < 6; ++i) {
			// acessando o vetor passando 'i' na posição, ou seja, a cada ciclo ele incrementa
			// 'i' e acessa  uma posição diferente.
			System.out.println("Posição = "+i+", valor "+x[i]);
		}

		// Agora eu posso fazer assim:
		// eu informo int que é o tipo de conteúdo do vetor e crio uma variável temporária que
		// vai receber os valores que estão dentro do vetor um de cada vez. Então a variável
		// pode ser entendida como um apelido pros itens do vetor. Depois eu coloco ':' e o nome
		// do vetor que eu quero iterar
		for (int indice :  x) {
			// A cada ciclo, 'indice' vai conter um elemento do vetor.
			System.out.println("valor "+indice);
		// A gente pode ler essa expressão como: para cada 'indice' em 'x', faça {bloco de código}
		}
	}
}