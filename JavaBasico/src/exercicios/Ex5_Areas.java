package exercicios;

import java.util.Scanner;

/*
 * Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
 * mostre:
 * a) a área do triângulo retângulo que tem A por base e C por altura.
 * b) a área do círculo de raio C. (pi = 3.14159)
 * c) a área do trapézio que tem A e B por bases e C por altura.
 * d) a área do quadrado que tem lado B.
 * e) a área do retângulo que tem lados A e B.
 */
public class Ex5_Areas {

	public static void main(String[] args) {
		double a, b, c, areaRetangulo, areaCirculo, areaTrapezio, areaQuadrado, areaTriangulo;
		final double PI = 3.14159;
		Scanner input = new Scanner(System.in);

		System.out.print("Digite os valores de A, B e C: ");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		input.close();

		areaTriangulo = (a*c)/2.0;
		areaCirculo = 2*PI*c;
		areaTrapezio = (a + b) / 2.0 * c;
		areaQuadrado = Math.pow(b, 2);
		areaRetangulo = a * b;

		System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);
		System.out.printf("CIRCULO: %.3f%n", areaCirculo);
		System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
		System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
		System.out.printf("RETANGULO: %.3f%n", areaRetangulo);
	}
}