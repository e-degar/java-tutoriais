package exemplos;

public class Ex12_CicloWhile {
	public static void main (String [] args) {

		// O ciclo while executa uma linha de código ENQUANTO uma condição for atendida.
		// Por exemplo:

		int a = 1;

		// Aqui vai ficar: ENQUANTO [condição] FAÇA	[bloco de código]
		while (a != 10) {
			System.out.println(a);
			// Vou colocar um incremento se não a condição nunca vai ser atendida
			a++;
			// Ele vai repetir esse código, imprimindo a e incrementando até a valer 10

			/* IMPORTANTE
			*  Se eu não viabilizar que as condições sejam satisfeitas, sem incrementar o a
			*  por exemplo, ele vai imprimir infinitamente.
			*/
		}
		// Uma variação disso é o do while, que você basicamente coloca a condição no final.
		int b = 1;
		do {
			System.out.println(b);
			b++;
		} while (b < 100);
		/* A diferença entre esses dois modos de usar o while é que no primeiro o bloco de
		 * código vai ser executado depois de ser feito o controle (a verificação condicional)
		 * e no segundo o bloco de vai ser executado antes.
		 */
	}
}