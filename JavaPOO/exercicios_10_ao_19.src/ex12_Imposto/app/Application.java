package ex12_Imposto.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ex12_Imposto.entities.Contribuinte;
import ex12_Imposto.entities.PessoaFisica;
import ex12_Imposto.entities.PessoaJuridica;

public class Application {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<Contribuinte> contribuintes = new ArrayList<>();

		System.out.print("Numero de contribuintes: ");
		int n = input.nextInt();
		input.nextLine();
		for (int i = 1; i <= n; i++) {
			System.out.println("CONTRIBUINTE Nº"+i+":");
			System.out.println("Pessoa física ou jurídica (f/j)? ");
			char r = input.next().charAt(0);
			input.nextLine();
			System.out.print("Nome: ");
			String nome = input.nextLine();
			System.out.print("Rendimento anual: ");
			double rendimento = input.nextDouble();
			if (r == 'f') {
				System.out.println("Gastos com saúde: ");
				double saude = input.nextDouble();
				contribuintes.add(new PessoaFisica(nome, rendimento, saude));
				} else {
					System.out.println("Número de funcionarios: ");
					int funcionarios = input.nextInt();
					contribuintes.add(new PessoaJuridica(nome, rendimento, funcionarios));
				}
		}
		System.out.println("\nRecolhimento:");
		double total = 0.0;
		for (Contribuinte cont : contribuintes) {
			System.out.println(cont.getNome()+": R$"+String.format("%.2f", cont.calculo()));
			total += cont.calculo();
		}
		System.out.println("RECOLHIMENTO TOTAL: R$"+String.format("%.2f", total));
		input.close();
	}
}