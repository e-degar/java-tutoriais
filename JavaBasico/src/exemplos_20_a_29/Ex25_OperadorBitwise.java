package exemplos_20_a_29;
/*
 * Operadores Bitwise são operadores que fazem operações lógicas bit a bit. Esse
 * operador faz uma comparação entre os bits de um numero binário com outro. Essa
 * comparação é feita bit por bit. Esse tipo de ooperador se aplica a programação 
 * de baixo nível, microcontroladores, programação de interface com rede, arduino.
 * Os operadores são: '&' - e, '|' - ou, '^' - ou-exclusivo, onde:
 * & - Só retorna verdadeiro se as duas condições forem verdadeiras
 * | - Retorna verdadeiro se ao menos um resultado for verdadeiro
 * ^ - Retorna verdadeiro se somente um resultado for verdadeiro
 */

import java.util.Scanner;

public class Ex25_OperadorBitwise {

	public static void main (String[] args) {

// Comparação de binários
		int n1 = 89;
		int n2 = 60;
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);

// Verificação de bit

		Scanner sc = new Scanner(System.in);
		int mask = 0b100000;
		int n = sc.nextInt();
		
		if ((n & mask) != 0) {
			System.out.println("6th bit is true!");
		} else {
			System.out.println("6th bit is false");
		}
	sc.close();
	}
}	