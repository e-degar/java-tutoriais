package exemplos;

import java.util.Scanner;

public class Ex15_Switch {

	public static void main (String[]args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Digite um numero de 0 a 5");
		int num = input.nextInt();
		input.close();

		/* O switch possibilita executar uma linha de codigo se o numero
		 * inserido corresponder a cada caso específico. Eu posso comparar
		 * outros tipos de variáveis tbm mas a variável a ser comparada tem
		 * que ser de mesmo tipo das variáveis em cada caso.
		 */
		
		switch(num){
			case 1:
			System.out.println("Voce escolheu 1.");
			// Esse break faz parar a execução do programa. Se o numero inserido
			// corresponder ao numero do case.
			break;
			case 2:
			System.out.println("Voce escolheu 2.");
			// Se eu remover o break ele executa o código deste e do próximo case.
			case 3:
			System.out.println("Voce escolheu 3.");
			break;
			case 4:
			// Se eu não colocar nada ele considera que caso 4 ou 5 faça [...]
			// ou seja, ele executa a linha do próximo case
			case 5:
			System.out.println("Voce escolheu 5.");
			break;
			// O default estabelece um trecho de código a ser executado sempre
			// que o numero inserido não corresponder a nenhum dos casos especificados
			// acima.
			default:
			System.out.println("Suave.");
		}
	}
}
