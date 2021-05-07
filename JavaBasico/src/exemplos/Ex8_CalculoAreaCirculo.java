package exemplos;

import java.util.Scanner;
public class Ex8_CalculoAreaCirculo {

	public static void main (String[]args) {

		// Por convenção as variáveis constante são nomeadas com letras maiúsculas
		final double PI = 3.1415;
		Scanner input = new Scanner(System.in);

		// Entrada de dados
		System.out.println("Informe o valor do raio: ");
		double raio = input.nextDouble();

		input.close();

		// Cálculo e saída do resultado
		double area = raio*raio*PI;
		System.out.println("O valor da área do circulo é: "+area);
	}
}