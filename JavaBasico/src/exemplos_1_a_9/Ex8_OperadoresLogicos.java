package exemplos_1_a_9;
/*
 * Operadores lógicos são uma forma de trabalhar com valores boolean
 * usando mais de uma comparação. Os operadores são '&&', representando 'e',
 * '||', representando 'ou' e '!', representando 'não'.
 */
public class Ex8_OperadoresLogicos {

	public static void main(String[] args) {

		// Então supondo essas variáveis
		int a = 10;
		int b = 20;
		boolean comp;
		System.out.println("a: "+a+", b: "+b);
		
		// Vamos colocar em 'comp' um valor boolean dependendo do
		// resultado de uma expressão lógica.

// Operadores

	// Operador e: && - esse operador só retorna verdadeiro se todas as comparações
	// retornarem verdadeiro (se 'a' for maior ou igual a 'b' e 'b' for
	// diferente de 'a'). Nesse caso a primeira retorna falsa pq 'a' é menor que 'b'
	// a segunda retorna verdadeira pq 'a' é diferente de 'b'. Como uma delas retorna
	// falso, a expressão inteira retorna falso.
		comp = a >= b && a != b;
		System.out.println("a maior ou igual a b E a diferente de b? "+comp);

		// Vc pode mudar o valor das variáveis pra ver isso funcionando.
		// Repare que se 'a' fosse igual a 'b', a primeira comparação ia
		// retornar verdadeiro mas como a segunda ia retornar falsa
		// a expressão inteira vira falsa.

	// Operador ou: || - Esse operador determina que uma ou outra comparação retorne
	// verdadeira. Mesmo que uma seja falsa, se ao menos uma for verdadeira ele já
	// retorna verdadeiro. Nesse caso a primeira comparação retorna false, pq 'a' é
	// menor que 'b'. Mas a segunda é verdadeira pq 'b' é diferente de 5.
	// Então a expressão retorna verdadeiro.
		comp = a > b || b != 5;
		System.out.println("a maior que b OU b diferente de 5? "+comp);

	// Operador não: ! - O operador 'não' inverte o valor da comparação. Ele
	// recebe um único valor boolean e inverte. Ele bem antes do valor que vai
	// ser invertido e se eu for usá-lo em uma comparação, ou mesmo uma expressão
	// inteira, eu vou ter que colocar a comparação ou expressão entre parênteses
	// Nesse caso a expressão vai retornar falso, pq nem 'a' é maior ou igual a 'b'
	// nem 's' é maior que 50. Mas o operador '!' vai inverter esse valor.
	// Então ela vai ficar verdadeira.
		comp = !((a >= b) && (a > 50));
		System.out.println("a maior ou igual a b E a maior que 50? "+comp);

	}
}