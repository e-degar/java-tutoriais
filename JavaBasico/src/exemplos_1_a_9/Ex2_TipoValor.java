package exemplos_1_a_9;
/*
 * Variáveis de tipo Valor são variáveis que contém diretamente os dados. Elas apontam pra
 * uma posição na memória stack que vai armazenar valor atribuído à ela. Por isso também são
 * chamadas de caixas. A stack é uma porção da memória RAM que fica reservada para empilhar
 * os dados atribuidos às variáveis de tipo valor durante a execução dos blocos de código. 
 * Cada necessidade de alocação, ou seja, cada variável declarada, é um trecho dessa porção
 * que vai sendo preenchido em sequência.
 */
public class Ex2_TipoValor {

	public static void main (String[] args) {

// Esses são todos os tipos de variáveis Valor, ou tipos primitivos.

	// Inteiros

		// Muito pequenos: 8 bits (entre -128 até 127)
		byte a = 10;
		// Saída de variável
		System.out.println("a: "+a);
		
		// Se passar disso da erro (descomente a linha abaixo pra ver o erro):
		// byte b = 128;

		// Pequenos: 16 bits (-32.768 a 32.767)
		short b = 32767;
		System.out.println("b: "+b);

		// Grandes: 32 bits (-2^31 a 2^31 – 1)
		int c = 204334;
		System.out.println("c: "+c);

		// Muito grandes: 64 bits (-2^63 a 2^63 -1)
		long d = 465465444;
		System.out.println("d "+d);

	//Decimais
		
		// Regra de etiqueta: identificar float e double colocando um f no final
		// do float e especificando as casas decimais no double mesmo se não houver
		// valor depois da virgula.

		// 32 bits
		float e = 23.23f;
		System.out.println("e: "+e);

		// 64 bits (tem mais precisão)
		double f = 23.23;
		System.out.println("f: "+f);

	// Caracteres

		// Armazena um valor unicode pra representar texto
		// tem que ser declarada com aspas simples
		char g = 'a';
		System.out.println("g: "+g);

	// Boolean

		// Armazena um estado que pode ser verdadeiro ou falso

		boolean h = true;
		System.out.println("h: "+h);

// Comportamento na memória

	// Variáveis de tipo valor armazenam o valor que recebem. Vou criar duas
	// variáveis inteiras x e y.

		int x, y;
		
	// Isso significa que dois espaços foram reservados na minha memória stack.
	// da memória stack fica reservado pra essa variável. Nenhuma dessas variáveis
	// foi inicializada com um valor, então eu não consigo usar (descomente abaixo):

		// System.out.println(x);

	// Se eu atribuo um valor à x, isso passa a funcionar.

		x = 5;
		System.out.println(x);

	// Agora repare que se eu atribuir x como valor de y, as duas passam a armazenar o
	// mesmo valor:

		y = x;		
		System.out.printf("x: %d, y: %d%n",x,y);

	// Agora existem dois espaços na memória stack armazenando o mesmo valor. 
	// Se eu alterar o valor de x, y continua valendo 5 (pq quando eu disse que y = x,
	// x valia 5).

		x = 3;
		System.out.printf("x: %d, y: %d%n",x,y);

	/*
	 * Então são dois espaços diferentes na memória stack. O valor de x foi copiado pra
	 * y mas as duas variáveis continuam independentes uma da outra. Isso é importante
	 * porque o próximo conteúdo é sobre variáveis de tipo referência, e elas funcionam
	 * de um modo diferente.
	 */ 

	/*
	 * Variáveis de tipo valor não podem ser usadas se não forem inicializadas antes,
	 * exceto quando elas são inicializadas em classes ou arrays, daí recebem 0, se forem
	 * numericas, null, se for char, ou false se for boolean. São mais simples e performáticas.
	 */

// Casting

		// Dá pra criar múltiplas variáveis numa mesma linha
		int m = 10; int n = 6; int o = 3; double p = 3;

		System.out.println("m = "+m);
		System.out.println("n = "+n);
		System.out.println("o = "+o);

		// Numa variável double (ou float), mesmo sem especificar uma casa decimal
		// ele converte pra um número decimal, nesse caso 3.0
		System.out.println("p = "+p);

		// Se numa variável double (ou float) eu resolver jogar o resultado de uma operação
		// com inteiras, ele vai desconsiderar o valor decimal e retornar apenas o resultado inteiro
		// Nesse caso, 10/3 = 3.0
		double q = m/n;
		System.out.println("q = "+q);

		// O casting basicamente força a conversão de uma variável inteira para float.
		//Desta forma eu estou forçando a variável x a virar double
		double r = (double)m/n;
		System.out.println("r = "+r);

		// Eu posso fazer casting do resultado de uma operação, assim
		double s = (double)(m/n);

		// Mas nesse caso o resultado vai aparecer no formato decimal, porém, 
		// como o casting veio depois da operação, ele vai mostrar o valor
		// inteiro que resultou da operação com zero depois da virgula
		System.out.println("s = "+s);

// Desalocação de variáveis tipo valor

	// Variáveis desse tipo são desalocadas imediatamente quando seu escopo de execução,
	// ou seja, quando o método ou função em que ela foi criada é finalizado.
	}
}