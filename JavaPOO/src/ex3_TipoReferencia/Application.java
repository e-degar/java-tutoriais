package ex3_TipoReferencia;
/*
 * Variáveis de tipo referência são representadas por classes. Sendo, portando,
 * objetos. Ao contrário das variáveis de tipo valor, elas não representam um único
 * espaço armazenado no stack. Os valores atribuídos alocados em trechos de memória
 * na parte que não está reservada pro stack, o heap. A variável então recebe o
 * endereço desse objeto que foi criado no heap. Por isso elas são chamadas também 
 * de ponteiro. Como as variáveis referência são representadas em classes, elas
 * podem possuir atributos.
 */
public class Application {

	public static void main(String[] args) {

// Comportamento na memória

	// Variáveis representam objetos:
		Objeto obj1, obj2;

	// Podem ser instanciadas:
		obj1 = new Objeto(3,5);

	// Apontam pra um endereço na memória:
		System.out.println(obj1);

	// Recebem valores null:
		obj2 = null;
		System.out.println(obj2);

	// Como essas variáveis contém um endereço onde os valores estão sendo
	// alocados, significa que se eu atribuir uma como valor da outra, elas
	// passam apontar ambas pro mesmo lugar:
		obj2 = obj1;
		System.out.println("obj1: "+obj1+", obj2: "+obj2);

	// E compartilham os mesmos valores
		System.out.println("obj1 - x: "+obj1.x+", y: "+obj1.y);
		System.out.println("obj2 - x: "+obj2.x+", y: "+obj2.y);

	// Ao contrário da variável valor, as duas apontam pro mesmo endereço.
	// O que foi copiado de uma pra outra foi esse endereço e não o valor
	// dos atributos. Isso significa que o que acontece nos atributos de
	// uma, afeta os da outra.
		obj1.x = 8;
		obj1.y = 9;
		System.out.println("obj1 - x: "+obj1.x+", y: "+obj1.y);
		System.out.println("obj2 - x: "+obj2.x+", y: "+obj2.y);

// Wrapper classes

	/*
	 * São classes que representam variáveis de tipo rerência equivalentes às de
	 * tipo valor. Recebem os mesmos nomes só que com a primeira letra maiúscula,
	 * exceto a classe equivalente ao tipo primitivo char, que se chama Character,
	 * e o int, que nesse caso é Integer. A vantagem de usar variáveis de tipo
	 * referência é que elas usufruem dos recursos de OO e aceitam valor null. 
	 */
	
	// Inteiros
		
		// Byte
		Byte a = 10;
		System.out.println("a: "+a);

		// Short
		Short b = 32767;
		System.out.println("b: "+b);

		// Integer
		Integer c = 204334;
		System.out.println("c: "+c);

		// Long
		Long d = 465454444L;
		System.out.println("d "+d);

	//Decimais

		//Float
		Float e = 23.23f;
		System.out.println("e: "+e);

		// Double
		Double f = 23.23;
		System.out.println("f: "+f);

	// Caracteres

		// Character
		Character g = 'a';
		System.out.println("g: "+g);

		// Boolean
		Boolean h = true;
		System.out.println("h: "+h);
		
// Boxing e unboxing
		
	// Com as wrapper classes o procedimento de boxing e unboxing se torna 
	// algo natural. Se os tipos forem compatíveis, eu não preciso usar casting

		// int recebendo Integer (c é um Integer)
		int i = c;
		System.out.println("int recebendo um Integer: "+i);

		// Agora Integer recebendo int (c é um Integer)
		i = 5;
		c = i;
 
// Desalocação de memória

	/*
	 * Objetos alocados por referência (no heap), são desalocados pelo garbage collector
	 * quando não tem mais nenhuma variável que faz referência à eles. O garbage collector
	 * é um processo que automatiza o gerenciamento de memória de um programa em execução.
	 * Ele monitora os objetos alocados dinamicamente pelo programa (no heap), desalocando
	 * aqueles que não estão sendo utilizados, ou seja, não estão vinculados com nenhuma
	 * variável e portanto não tem referência.
	 */
	
	/*
	 * Variáveis de tipo referência usufruem de recursos de OO, aceitam valores null,
	 * são ponteiros, precisam ser instanciadas ou apontar pra um objeto existente,
	 * e os objetos que não são utilizados são desalocados em um momento próximo pelo
	 * garbage collector.
	 */
	}
}