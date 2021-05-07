package exercicios;

import java.util.Scanner;

/* Pra esse exercício tem que ser feito um código que receba um ano do usuário e verifique se
 * esse ano é bissexo ou não. Da pra fazer isso usando as seguintes condições: São bissextos os
 * anos múltiplos de 400; São bissextos todos os anos múltiplos de 4 e não múltiplos de 100;
 * Não são bissextos todos os demais anos. Leve em consideração que utilizamos o calendário
 * gregoriano.
 */
public class Ex1_AnosBissextos {

	public static void main (String[]args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Digite um ano:");
		int ano = input.nextInt();
		input.close();

		if (ano < 1582) {
			System.out.println("Para este programa, estão sendo considerados os anos desde a promulgação\n"
			+ "do Calendário gregoriano em 1582. Antes disso não é possível calcular da mesma forma.\n"
			+ "Por gentileza, digite um ano após 1582 para garantir um cálculo correto.");
		} else if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
			System.out.println(ano+" é um ano bissexto.");
		} else {
			System.out.println(ano+" não é um ano bissexto.");
		}
	}
}