package exercicios;

import java.util.Scanner;

/*
 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números.
 * A saída deverá os dois valores e o resultado da soma. Por exemplo:
 * "A Soma de 5 mais 5 é: 10"
 */
public class Ex2_OperacoesParte1 {

	public static void main(String[] args) {
		int a, b, soma;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite dois numeros inteiros:");
		
		a = input.nextInt();
		b = input.nextInt();
		soma = a + b;
		System.out.printf("A soma de %d mais %d é: %d", a, b, soma);
		
		input.close();
	}

}
