package ex2.application;
/*
 * Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto).
 * Em seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida,
 * aumentar o salário do funcionário com base em uma porcentagem dada (somente o salário
 * bruto é afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a
 * classe projetada abaixo.
 */
import java.util.Scanner;

import ex2.entities.Funcionario;

public class App {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Funcionario proletario = new Funcionario();

		System.out.print("Nome: ");
		proletario.nome = input.nextLine();
		System.out.print("Salário bruto: ");
		proletario.salarioBruto = input.nextDouble();
		System.out.print("Descontos: ");
		proletario.desconto = input.nextDouble();

		System.out.println();
		System.out.println("Dados do funcionário" + proletario);
		System.out.println();
		System.out.print("Porcentagem do aumento? ");
		double porcentagem = input.nextDouble();
		proletario.aumentarSalario(porcentagem);
		System.out.println();
		System.out.println("Dados atualizados!" + proletario);
		
		input.close();
	}
}