package exemplos_10_a_19;
/*
 * Break e Continue são comandos também são comandos que possibilitam o
 * controle do fluxo de execução do programa. Especialmente úteis no controle
 * de estruturas de repetição.
 */
import java.util.Scanner;

public class Ex13_BreakContinue {

	public static void main (String[]args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Digite um numero de 0 a 10");
		int numero = input.nextInt();
		input.close();

// break: como o nome já diz o 'break' para a execução.

		// Nesse exemplo o break está posicionado pra interromper o ciclo

		// 'i' vai sendo incrementado até chegar em 10. E a cada ciclo uma comparação
		// vai ser feita.
		for(int i = 0; i <= 10; ++i) {
			if(i == numero) {
				// se 'i' for igual ao numero digitado pelo usuário,
				// esse trecho vai ser executado.
				System.out.println("O seu número é "+i);
				// O break vai fazer com que ele pule pra fora desse
				// ciclo for.
				break;
			} else {
				// Caso o numero não seja igual a 'i', ele pula a primeira
				// parte e executa isso
				System.out.println("O seu número não é "+i);
			}
			// No fim de cada ciclo, depois da comparação no 'if', ele vem
			// pra cá. Isso tá dentro do 'for', mas só é executado quando
			// 'i' é diferente do número digitado porque quando é igual, o
			// 'break' faz ele sair do ciclo e pular essa parte do código.
			System.out.println("Fim do ciclo.");
		}
		// Isso aqui ele só imprime em duas situações: Uma se o valor inserido é
		// menor que 0 ou maior que 10. Daí ele vai executar até 'i' valer 10 e vai
		// encerrar o ciclo. A outra se 'i' for igual ao numero inserido, o que vai
		// fazer ele entrar no primeiro bloco do 'if' e executar o comando 'break'
		// que vai pular fora do ciclo.
		System.out.println("Fim do programa\n");

// continue

		// O 'continue' indica ao computador pra pular o que vem depois dele
		// e recomeçar o ciclo.
		for(int i = 0; i <= 10; ++i) {
			if(i == numero) {
				// Quando ele cai aqui, ou seja, quando 'i' é igual ao numero
				// inserido, ele executa essa linha
				System.out.println("O seu número é "+i);
			} else {
				System.out.println("O seu número não é "+i);
				// Quando ele cai aqui, quando 'i' é diferente do numero inserido,
				// ele vai encontrar o comando continue e vai pular tudo que vem
				// depois desse 'if'. 
				continue;
			}
			// Ele só vai chegar aqui quando ele cair no primeiro bloco de código
			// do 'if', porque se ele cai no segundo, vai encontrar o comando 'continue'
			// que indica pra ele pular o que vem depois e recomeçar o ciclo.
			System.out.println("Numero encontrado.");

		// Do jeito que está, mesmo encontrando o numero ele vai continuar o ciclo até
		// 'i' valer 10. Pra parar o programa quando ele encontrar o numero é só colocar
		// o comando 'break' no final do primeiro bloco de código do 'if'.
		}
	}
}