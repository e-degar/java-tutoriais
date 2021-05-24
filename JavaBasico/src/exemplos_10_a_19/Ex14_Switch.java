package exemplos_10_a_19;
/*
 * O switch case é uma estrutura de caso. Particularmente útil pra evitar
 * ter que ficar encadeando um monte de 'if - else if'. É definido um 'switch'
 * (interruptor), e em cada caso - a depender do estado desse switch - um trecho
 * de código é executado.
 */
import java.util.Scanner;

public class Ex14_Switch {

	public static void main (String[]args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Digite um numero de 0 a 5");
		int num = input.nextInt();
		input.close();

		// Eu posso comparar outros tipos de variáveis tbm mas a variável a
		// ser comparada tem que ser de mesmo tipo das variáveis em cada caso.

		// Aqui é definido um switch. Ele recebe 'num' como argumento.
		// Aqui eu posso trabalhar com comparações e operadores lógicos
		// também mas vou deixar assim pra simplificar.
		switch(num){
			// Em seguida começam os casos:
			// Caso 'num' seja 1
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