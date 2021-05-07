package exemplos;

public class Ex3_Operadores {

	public static void main (String[]args) {

		int x = 3;
		int y = 3;

		// Operadores
		System.out.println("Operadores");

		// Soma
		// Jeitinho básico
		int soma = x + y;
		System.out.println("Variável soma: "+soma);
		// Ou eu posso usar o operador direto no output
		System.out.println("Soma direto no output: "+(x+y));

		// Subtração
		System.out.println("Subtração: "+(x-y));

		// Multiplicação
		System.out.println("Multiplicação: "+(x*y));

		// Divisão inteira
		System.out.println("Divisão: "+(x/y));

		// Resto da divisão
		System.out.println("Resto da divisão: "+(x%y));

		// Divisão inteira vs com valor real

		/* Se você dividir duas variáveis inteiras normalmente,
		 * ele irá retornar a parte inteira do resultado, no caso de 32/3 seria 10.
		 */
		int resultado = 32/3;
		System.out.println("Divisão com variável inteira: "+resultado);

		/* Se você quisesse o valor real(double ou float)
		 *  aí você faria um cast explicíto, dessa forma:
		 */
		float result = (float)32/3;
		System.out.println("Divisão com casting pra float: "+result);

		/* Se eu dividir números inteiros sem fazer casting, mesmo
		 * mandando pra uma variável double ou float ele me retorna um resultado inteiro.
		 */

		int a = 32;
		int b = 3;
		float div = a/b;
		System.out.println("Divisão de int pra float sem casting: "+div);

		// Existe uma forma mais resumida de utilizar os operadores.
		// Ao invés de x = x + y, eu posso só colocar x += y.
		x += y;
		System.out.println("x = "+x);

		// Posso fazer com outros operadores também
		x *= y;
		System.out.println("x = "+x);

		// Outra simplificação é pra fazer incremento e decremento, é basicamente:
		x++;
		System.out.println("x = "+x);
		x--;
		System.out.println("x = "+x);

		// A forma anterior é chamada de pós incremento. Ela faz o incremento e retorna o valor.
		// Existe uma outra forma que é o pré incremento que retorna o valor e depois incrementa
		// Por exemplo
		int e = 5, d = 5;

		System.out.println(++e); // Retorna 6
		System.out.println(e); // Retorna 6
		System.out.println(d++); // Retorna 5
		System.out.println(d); // Retorna 6
	}
}