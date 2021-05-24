package exemplos_20_a_29;

// Passando vetores pra um método

public class Ex21_MetodosParte2 {
	public static void main (String[]args) {

		int[]vetor = {1,2,3,4,5};
		int x = 10;

		// Exemplo 1

		 // Aqui eu to chamando dois métodos passando, respectivamente, os valores de 'vetor'
		 // e de 'x'. Os métodos basicamente vão imprimir esses valores lá dentro.
		 // Até aí nada demais.
		vetorExemploUm(vetor);
		primitivaExemploUm(x);

		// Exemplo 2

		// Aqui eu vou fazer diferente. Eu vou passar esses valores pra outros dois métodos que vão
		// receber eles como argumentos e lá dentro vão atribuir outro valor.
		vetorExemploDois(vetor);
		primitivaExemploDois(x);

		// A primeira coisa que você deve notar é que os métodos retornam void, ou seja, não tem retorno.
		// Vamos imprimir os valores aqui no método main pra ver o comportamento.
		System.out.println(vetor[0]);
		System.out.println(x);

		// Repare que agora o valor do vetor mudou e o da variável não. Doido né? Mas o que aconteceu?

		/*
		 * As variáveis basicamente são armazenadas na memória RAM do seu computador. Dentro da memória
		 * RAM elas ganham uma espécie de endereço numérico pro computador saber onde ela está alocada.
		 * Com eu já coloquei antes, uma variável normal tem um escopo, e ela só existe dentro do método
		 * onde ela foi criada. Isso significa que quando eu passo ela como argumento pra um método externo
		 * uma nova variável é criada nesse método pra receber esse valor. Ela é alocada em outro lugar na
		 * memória RAM e recebe, portanto um novo endereço.
		 * 
		 * No caso do vetor é um pouco diferente. Quando eu passo um campo de um vetor, como argumento
		 * pra outro método, esse outro método ao invés de receber o valor e colocar em uma nova variável,
		 * ele recebe o endereço onde esse valor está alocado. A variável que receberia esse valor na verdade
		 * acessa o endereço da outra variável na memória RAM. Assim, apesar do método não retornar nada,
		 * tudo que for alterado aqui reflete lá. Isso é basicamente um furo no escopo local.
		 * 
		 * Isso acontece porque o vetor é um conjunto de dados. E objetos desse tipo são alocados
		 * na memória em espaços contíguos, pois armazena uma coleção de informação. O que é armazenado
		 * nessa variável 'vetor' é o endereço desse conjunto de dados na memória, do espaço que foi
		 * separado pra armazenar esse objeto com todas as suas variáveis.
		 */
		
	}
	public static void vetorExemploUm(int [] x) {
		System.out.println(x[0]);
	}
	public static void primitivaExemploUm(int x) {
		System.out.println(x);
	}
	public static void vetorExemploDois(int [] x) {
		x[0] = 200;
	}
	public static void primitivaExemploDois(int x) {
		x = 200;
	}

	/*
	 * Outro conceito importante em relação aos métodos é o de variável local e variável global.
	 * Isso tem a ver com o escopo onde a variável foi criada. Uma variável criada em um método
	 * pertence ao escopo deste método, não pode ser acessada fora dele nem de dentro de outros
	 * métodos. Uma variável declarada fora dos métodos, na própria classe, pertence ao escopo
	 * da classe. Ela vale pra todos os métodos daquela classe (desde que não sejam métodos
	 * estáticos, mas isso é outro assunto).
	 * Note que esse comentário está fora de todos os métodos, inclusive do método principal.
	 * Eu vou criar uma variável nesse espaço.
	 */
	int global = 3;

	// Agora eu vou criar um método qualquer (eu omiti o static mas isso é assunto pra outra hora).
	public void metodo() {

		// Repare que eu consigo acessar a variável global aqui dentro sem precisar declarar de novo.
		global = 4;

		// isso aqui daria erro:
		// local = 6;

		System.out.println(global);

		// A mesma coisa se eu tentar criar uma variável aqui dentro e acessar ela de fora.
		int local = 5;

		// Isso não funcionaria:
		// a = 1;

		// Existe ainda mais um nível se eu considerar um ciclo for, por exemplo
		for (int a = 0; a < 10; ++a) {
			global +=1;
			local +=1;
			// Eu consigo acessar tanto a variável global, quanto a variável local
			// do método aqui dentro, mas não consigo acessar a variável a de fora.
		}
	}
}