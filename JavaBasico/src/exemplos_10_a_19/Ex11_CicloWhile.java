package exemplos_10_a_19;
/*
 * A expressão While é uma estrutura de repetição que, assim como o if serve pra
 * controlar o fluxo de execução do programa. Essa estrutura também é combinada
 * com operadores comparativos e lógicos, se vc não sabe o que eles são, volte
 * aos exemplos 7 e 8.
 */
public class Ex11_CicloWhile {
	public static void main (String [] args) {

// while

		// While em inglês significa 'enquanto'. Dada uma certa comparação, enquanto
		// o resultado dessa comparação não for true, ele vai executar o bloco de código
		// que está entre as chaves.

		int a = 1;

		// Aqui vai ficar: ENQUANTO [condição] FAÇA	[bloco de código]
		while (a != 10) {
			System.out.println(a);
			// Vou colocar um incremento se não a condição nunca vai ser atendida
			a++;
			// Ele vai repetir esse código, imprimindo 'a' e incrementando até 'a' valer 10.
			// É importante ter em mente que ele verifica, depois executa, depois verifica de
			// novo, depois executa de novo até que a expressão retorne true.

			 // IMPORTANTE
			 // Se eu não viabilizar que as condições sejam satisfeitas, sem incrementar o 'a'
			 // por exemplo, ele vai imprimir infinitamente.
		}

// do while

		/*
		 *  do while é uma variação dessa estrutura. Pelo próprio nome já dá pra entender a
		 *  diferença, se 'while' significa 'enquanto', 'do while' se traduz 'faça enquanto'
		 *  ou seja, ele vai executar e depois verificar. Se a verificação retorna false, ele
		 *  executa de novo e faz uma nova verificação, e assim por diante.
		 */

		int b = 1;
		do {
			System.out.println(b);
			b++;
		} while (b < 100);

		// A diferença entre os dois é que no 'while', ele verifica e depois executa. Se de cara
		// a expressão retorna true ele simplesmente pula o código. No 'do while', o código é
		// executado pelo menos uma vez antes de ocorrer a verificação.
	}
}