package ex6.application;

import java.util.Scanner;

import ex6.entities.Aluguel;

public class App {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Quantos quartos serão locados? ");
		int alugueis = input.nextInt();
		Aluguel [] quartos = new Aluguel [8];

		for (int i = 0; i < alugueis; i++) {

			input.nextLine();
			System.out.printf("Locação nº %d\n", i+1);
			System.out.print("Nome: ");
			String nome = input.nextLine();
			System.out.print("E-mail: ");
			String email = input.nextLine();
			System.out.print("Quarto: ");
			int numQuarto = input.nextInt()-1;
			quartos[numQuarto] = new Aluguel(nome, email);
		}
		System.out.println("\nQuartos ocupados:");
		for (int i=0; i<quartos.length; i++) {
			if (quartos[i] != null) {
				System.out.printf((i+1)+": "+quartos[i]+"\n");
			}
		}
		input.close();
	}
}