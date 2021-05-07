package exercicios;

/* A ideia desse exercício é criar um joguiho de adivinhar numeros. Ele deve usar a
 * biblioteca random pra gerar um numero inteiro aleatório. Deverá dar dicas se o usuário
 * digitou um numero maior ou menor que o numero gerado. E pode ter também um contador de
 * tentativas. Vai ser um jogo impossível mesmo.
 */

import java.util.Random;
import java.util.Scanner;

public class Ex2_NumeroSecreto {

	public static void main(String[]args) {

		Scanner input = new Scanner(System.in);
		Random random = new Random();

		boolean certo = false;
		int tentativas = 10;
		int numSecreto = random.nextInt();
		long chute = 0;

		// Hack
		System.out.println(numSecreto);	

		while (tentativas > 0 && certo == false) {
			System.out.println("Adivinhe o número");
			chute = input.nextLong();

			if (numSecreto == chute) {
				certo = true;
				System.out.println("Você acertou!!!");
				input.close();
			} else if (chute < numSecreto){
				--tentativas;
				System.out.println("Numero muito pequeno. "+tentativas+" restantes.");				
			} else {
				--tentativas;
				System.out.println("Numero muito grande. "+tentativas+" restantes.");		
			}
		}
	}
}
