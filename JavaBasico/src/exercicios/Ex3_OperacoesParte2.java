package exercicios;

import java.util.Scanner;

/*
 * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
 * de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
 */

public class Ex3_OperacoesParte2 {

	public static void main(String[] args) {

		int a, b, c, d, calc;
		Scanner input = new Scanner(System.in);

		System.out.print("Digite o valor de A: ");
		a = input.nextInt();
		System.out.print("Digite o valor de B: ");
		b = input.nextInt();
		System.out.print("Digite o valor de C: ");
		c = input.nextInt();
		System.out.print("Digite o valor de D: ");
		d = input.nextInt();

		input.close();

		calc = a*b-c*d;
		System.out.printf("\nA diferença entre os produtos de A x B e C x D é: %d",calc);
	}
}