package ex4.application;

import java.util.Scanner;

import ex4.util.Conversor;

public class Application {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Qual o preço do dólar? R$ ");
		double precoDolar = in.nextDouble();
		System.out.print("Qual a quatidade a ser comprada? USD ");
		double qtdeDolar = in.nextDouble();	
		in.close();

		double valorTotal = Conversor.Converter(precoDolar, qtdeDolar);
		System.out.printf("Valor total: R$ %.2f",valorTotal);
	}
}