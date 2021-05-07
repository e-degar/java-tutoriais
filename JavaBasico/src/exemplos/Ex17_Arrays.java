package exemplos;

import java.util.Scanner;

public class Ex17_Arrays {
	public static void main(String[] args){

		/* Um array ou vetor é um objeto que armazena sequencias de dados
		 * Aqui em baixo foi declarado um array do tipo double ([] simboliza que
		 * eu estou criando um array e não uma variável double normal.
		 * Em new double [] eu posso colocar o numero de registros que o meu
		 * array vai conter, podendo também ser uma variável.
		 */
		double[] notas = new double[5];

		// Eu posso atribuir valores dentro do array individualmente especificando
		// a posição através do []. Note que a primeira posição é 0 e não 1.
		notas[0] = 6.7;
		notas[1] = 5.7;
		notas[2] = 7.8;

		// Da mesma forma, da pra imprimir um dado específico de dentro desse array
		// entrando com a posição desejada.
		System.out.println(notas[2]);

		// Uma outra forma de declarar um vetor é já carregando ele com valores usando {}
		int[] x = {1,2,3,4,5,6,7};
		for (int i = 0; i < 6; ++i) {
			System.out.println("Posição = "+i+", valor "+x[i]);
		}

		// Um jeito mais fácil de lidar com arrays é automatizando a parada através de
		// Laços de repetição.
		int numAlunos = 5;
		Scanner input = new Scanner(System.in);

		// Aqui eu indiquei o tamanho do array a partir da variável numAlunos
		double[] notaAlunos = new double[numAlunos];

		// Aqui eu to indicando pela variável i a posição do array que eu to me referindo.
		// Enquanto i for menor que o tamanho do array, ele vai executar o código e incrementar
		// o valor de i.
		for (int i = 0; i < numAlunos; ++i) {
			System.out.println("Insira a nota do " + (i+1) + "º aluno.");
			// Em cada posição que o ciclo for acessa eu to armazenando um numero dado pelo usuário.
			notaAlunos[i] = input.nextDouble();
		}
		input.close();

		// Pra imprimir na tela os valores que foram armazenados eu uso a mesma lógica mudando 
		// apenas o código a ser executado a cada ciclo.

		for (int i = 0; i < numAlunos; ++i) {
			System.out.println("Nota do aluno " + (i+1) + " = " + notaAlunos[i] + ".");
		}

		/* Se por um acaso eu criar um vetor que armazena por exemplo 3 numeros
		 * e no meu laço for coloque meu contador em um numero maior que 3 eu vou receber
		 * um erro, pois vou estar tentando acessar um campo fora dos limites (out of bounds) do vetor.
		 * Eu poderia criar uma variável pra definir esse tamanho e por essa variável dentro
		 * do [] na criação do vetor e usar ela como condição no meu laço for, como foi feito
		 * ali em cima. Uma outra forma de resolver isso é acessando o parâmetro lenght (comprimento)
		 * do meu vetor. Assim, se eu atribuir, digamos, 5 na hora da criação do meu vetor,
		 * basta eu colocar no meu laço for a condição i < x.length, que ela vai estar sempre
		 * atrelada ao tamanho do meu vetor, independente do tamanho que eu escolher. Por exemplo:
		 */
		int[] numeros = new int[5];
		for (int i = 0; i < numeros.length; ++i) {
			System.out.println("Número = "+numeros[i]);
		}
		/* Repare também que nesse vetor não foi carregado nenhum numero. O Java por padrão carrega
		 * as variáveis sem atribuição com 0 (se for numerica), false (se for booleana) ou null
		 * (se for do tipo char).
		 */

		// Uma outra forma de preencher vetores é usando o método fill
		int[] vetor = new int[5];
		java.util.Arrays.fill(vetor, 2, 4, 10);

		/* Esse método recebe alguns parâmetros: o nome do vetor (vetor), a posição a partir da 
		*  qual eu quero entrar um valor (nesse caso eu coloquei 2), a posição até a qual esse
		*  valor vai ser inserido (4) e o valor que eu quero inserir (10).
		*  A posição de partida é inclusa. A segunda não. Isso é um detalhe do método.
		*  Então na posição 2 e 3 ele vai inserir 10 e no resto vai ficar 0.
		*/
		for (int i = 0; i < vetor.length; ++i) {
			System.out.println("Posição = "+i+", valor "+vetor[i]);
		}
	}
}