package exemplos_1_a_9;
/*
 * Operadores comparativos são usados pra comparar dois valores 
 * dentro de uma expressão. Os resultados dessas comparações são
 * valores boolean (verdadeiro ou falso)
 */
public class Ex7_OperadoresComparativos {

	public static void main(String[] args){
		int a = 10;
		int b = 20;
		boolean comp;
		System.out.println("a: "+a+", b: "+b);

// Operadores

	// Maior que: >
		comp = a > b;
		System.out.println("a maior que b? "+comp);

	// Menor que: <
		comp = a < b;
		System.out.println("a menor que b? "+comp);

	// Maior ou igual: >=
		comp = a >= b;
		System.out.println("a maior ou igual a b? "+comp);

	// Menor ou igual: >=
		comp = a <= b;
		System.out.println("a menor ou igual a b? "+comp);

	// Igual a: ==
		comp = a == b;
		System.out.println("a é igual a b? "+comp);

	// Diferente de: !=
		comp = a != b;
		System.out.println("a é diferente de b? "+comp);

// Expressão condicional ternária

		/* A ideia dessa expressão é a seguinte: A variável maior vai receber um valor
		 * de retorno dependendo do resultado de uma comparação entre 'a' e 'b'. A comparação
		 * é se 'a' é maior que 'b'. A estrura da expressão é: a variável que vai receber o
		 * retorno, um sinal de '=', a comparação entre parênteses, um sinal de '?', um caso
		 * de retorno se verdadeiro, sinal de ':', caso de retorno se falso, ponto e virgula;
		 * Então nesse exemplo ele vai colocar na variável maior o numero 500, se a comparação
		 * der verdadeira, e 1000 se falsa.
		 */
		int maior;
		maior = (a > b) ? 500 : 1000;
		System.out.println(maior);

		// Outros tipos de variáveis podem ser usadas desde que a condição possa
		// retornar um valor booleano, ou seja, verdadeiro ou falso.
	}
}