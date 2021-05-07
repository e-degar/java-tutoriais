package exemplos;

import java.util.Scanner;

public class Ex14_BreakContinue {

	public static void main (String[]args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Digite um numero de 0 a 10");
		int numero = input.nextInt();
		input.close();

		/* Do jeito que esse código tá, ele vai comparar o numero fornecido
		 * pelo usuário com i até chegar em 10. Se o numero for igual ele vai 
		 * dizer "Seu numero é x", se for diferente ele vai dizer "Seu numero
		 * não é x". O break aqui serve pra ele parar a execução quando ele 
		 * encontrar o numero. Sem o break, supondo que o numero seja 5, ele
		 * vai continuar comparando até o 10 mesmo já tendo encontrado o
		 * numero. Com o break ele para a execução assim que ele encontrar
		 * o numero fornecido pelo usuário. 
		 */
		for(int i = 0; i <= 10; ++i) {
			if(i == numero) {
				System.out.println("O seu número é "+i);
				break;
			} else {
				System.out.println("O seu número não é "+i);
			}
			System.out.println("Fim do ciclo.");
		}
		
		/* Repare que ao fim de cada ciclo do for ele executa primeiro o if, 
		 * depois o códifo que tá fora do if, e ai recomeça o ciclo for.
		 * Aqui em baixo da pra ver o que acontece quand eu uso o continue.
		 * O código vai continuar comparando mesmo após ter encontrado o numero.
		 * Mas ao fim do if, toda vez que o numero for diferente do numero
		 * inserido pelo usuário, o continue vai fazer o programa pular o código
		 * vem depois do if, recomeçando o ciclo for. A frase "Numero encontrado"
		 * só vai aparecer quando o numero do contador for igual ao numero 
		 * que o usuário digitou.
		 */
		for(int i = 0; i <= 10; ++i) {
			if(i == numero) {
				System.out.println("O seu número é "+i);
			} else {
				System.out.println("O seu número não é "+i);
				continue;
			}
			System.out.println("Numero encontrado.");
		}
	}
}