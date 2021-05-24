package exercicios;

import java.util.Scanner;

/*
 * Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
 * hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
 * decimais.
 */
public class Ex4_CalcularSalario {

	public static void main(String[] args) {
		int num; double valorHora, horasTrabalhadas, salario;
		Scanner input = new Scanner(System.in);

		System.out.println("Digite o número do funcionário, o valor da hora de trabalho "
				+ "e a quantidade de horas trabalhadas separados por espaço: ");
		num = input.nextInt();
		valorHora = input.nextDouble();
		horasTrabalhadas = input.nextDouble();
		input.close();

		salario = valorHora * horasTrabalhadas;
		System.out.println("### Folha de pagamento ###");
		System.out.printf("\nCódigo do funcionário: %d",num);
		System.out.printf("\nHoras trabalhadas: %.2f hrs", horasTrabalhadas);
		System.out.printf("\nSalário: R$ %.2f", salario);
	}
}