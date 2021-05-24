package exercicios;

import java.util.Locale;
/*
 * A proposta desse exercício é fixar o básico de como concatenar variáveis num print. O programa já
 * vem com as variáveis no esquema e o que você tem que fazer é escrever a saída de forma que o resultado 
 * seja:
 * 
 * Feira!!
 * O preço da laranja é R$10,00 o KG.
 * O preço da uva é R$4,50 meio KG.
 * 
 * Nome do cachorro: João, idade 5 anos, sexo: M.
 * 
 * Numero decimal: 32,9867796000
 * Com quatro casas decimais: 32,9867
 * Padrão decimal US: 32.9867
 */
public class EX1_Output {

	public static void main(String[] args) {

		String item1 = "laranja";
		String item2 = "uva";
		int idade = 5;
		String nome = "João";
		char sexo = 'M';
		double preco1 = 10.00;
		double preco2 = 4.50;
		double numero = 32.9867796;

		// Resolução
		System.out.println("Feira!!");
		System.out.printf("O preço da %s é R$%.2f o KG.\n", item1, preco1);
		System.out.printf("O preço da %s é R$%.2f o KG.\n", item2, preco2);
		System.out.println();
		System.out.printf("Nome do cachorro: %s, idade %d anos, sexo: %c.\n", nome, idade, sexo);
		System.out.println();
		System.out.printf("Numero decimal: %.10f%n", numero);
		System.out.printf("Com quatro casas decimais: %.4f%n", numero);
		Locale.setDefault(Locale.US);
		System.out.printf("Padrão decimal US: %.4f%n", numero);

	}
}