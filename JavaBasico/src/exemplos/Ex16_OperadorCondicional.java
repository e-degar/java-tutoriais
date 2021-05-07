package exemplos;

public class Ex16_OperadorCondicional {

	public static void main(String[] args){
		int a = 10;
		int b = 20;
		int maior;

		/* A ideia do operador condicional é a seguinte: A variável maior vai
		 * receber um valor de retorno dependendo de uma determinada condição.
		 * A condição é se a for maior que b. É colocado uma interrogação entre
		 * a condição e os casos de retorno possíveis. Esses casos são separados
		 * por ":", sendo o primeiro se verdadeiro, o segundo se falso. Então no
		 * caso desse código ele vai colocar na variável maior 500, se a condição
		 * for verdadeira, e 1000 se falsa.
		 */
		maior = (a > b) ? 500 : 1000;
		System.out.println(maior);
		
		// Outros tipos de variáveis podem ser usadas desde que a condição possa
		// retornar um valor booleano, ou seja, verdadeiro ou falso.
	}
}