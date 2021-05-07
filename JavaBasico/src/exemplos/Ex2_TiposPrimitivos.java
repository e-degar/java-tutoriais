package exemplos;

public class Ex2_TiposPrimitivos {

	public static void main (String[] args) {

		// Variáveis de tipo primitivo

		// Inteiros

		// Muito pequenos: 8 bits (entre -128 até 127)
		byte a = 10;
		// Se passar disso da erro:
		// byte b = 128;

		// Pequenos: 16 bits (-32.768 a 32.767)
		short b = 5000;

		// Grandes: 32 bits (-2^31 a 2^31 – 1)
		int c = 204334;

		// Muito grandes: 64 bits (-2^63 a 2^63 -1)

		//Decimais

		// 32 bits (precisa cast)
		float d = (float) 23.23;

		// 64 bits (tem mais precisão)
		double e = 23.23;

		// Caracteres

		// Armazena um valor unicode pra representar texto
		// tem que ser declarada com aspas simples
		char f = 'a';

		// Boolean

		// Armazena um estado que pode ser verdadeiro ou falso

		boolean g = true;

		// Saída de variável
		System.out.println(a);

		// Concatenando variáveis no output
		System.out.println(b+""+c);

		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);

	}
}