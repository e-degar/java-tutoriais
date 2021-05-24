package exemplos_10_a_19;

// Locale é uma propriedade que indica pro computador quais padrões de teclado
// e fuso horário que o programa vai usar.

import java.util.Locale;

public class Ex19_Locale {

	public static void main (String [] args) {

		// Repare que meus numeros decimais estão saindo com vírgula
		double z = 3.342323;
		System.out.printf("\nO numero é: %.2f", z);

		// Isso é uma especificidade do padrão da lingua portuguesa.
		// Pra mudar o padrão de formatação, eu tenho que mudar o locale.

		Locale.setDefault(Locale.US);
		// Agora ele sai com ponto ao invés de vígula
		System.out.printf("\nO numero é: %.2f", z);
	}
}