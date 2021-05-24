package exemplos_1_a_9;

public class Ex1_Output {

	// Método principal (main). Ele marca o ponto inicial do meu programa.
	public static void main(String[] args) {

// Saída de dados

	// Saída simples
		
		// Saída de dados no console.
		System.out.print("Alô meu chapa");
		System.out.print("Alô");

		// Quebra de linha

		// Pra quebrar uma linha eu posso colocar um \n na saída.
		// \n é um caractere de escape
		System.out.print("\nPulando\nlinha\n");

		// Se ao invés de escrever print eu colocar println ele vai
		// pular linha depois de escrever o que tá na saída.		 

		System.out.println("- Alô meu chapa");
		System.out.println("- Alô");
		
	// Saída com variáveis
		
		// Variáveis
		int x = 3;
		int y = 5;
		
		// Saída de dados concatenando variáves
		System.out.println("valor de x: "+x+", valor de y: "+y);
		
		// Saída de dados com formatação: 
		
		// O %d nesse caso funciona como um marcador indicando que ali será
		// inserido um valor inteiro. No final eu coloco as variáveis na ordem em 
		// que eu quero que elas apareçam.
		System.out.printf("%d vezes %d é igual à %d.", x, y, (x*y));
		
		// Uma das vantagens desse método de saída é poder controlar o numero de casas
		// decimais de um numero de tipo float ou double
		
		double z = 3.342323;
		// Nesse caso eu uso o marcador %f. Mas se eu colocar um ponto e um numero entre o % e o f
		// eu posso especificar quandos numeros após a virgula eu quero que ele imprima.
		System.out.printf("\nO numero é: %.2f", z);
		
		/*
		 *  Lista de marcadores
		 *  
		 *  %s			-	String de caracteres
		 *  %d			-	Número inteiro decimal
		 *  %u			-	Número inteiro decimal sem sinal
		 *  %o			-	Número inteiro octal sem sinal
		 *  %x, %X		-	Número inteiro hexadecimal sem sinal, minúsculo ou maiúsculo
		 *  %f			-	Float
		 *  %2f			-	Double
		 *  %e, %E		-	Número real, em notação científica, minúsculo ou maiúsculo
		 *  %b			-	Boolean
		 *  %c			-	Caractere (char)
		 */

		/*
		 * 	Lista de caracteres de escape
		 * 
		 * \t			-	Tabulação
		 * \b			-	Backspace
		 * \n			-	Nova Linha
		 * \r			-	Retorno de carro
		 * \'			-	Aspa simples
		 * \"			-	Aspa dupla
		 * \\			-	Barra invertida
		 * 
		 * Específico para o printf:
		 * 
		 * %%			-	Símbolo de porcentagem
		 */
	}
}