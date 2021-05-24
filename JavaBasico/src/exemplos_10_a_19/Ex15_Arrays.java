package exemplos_10_a_19;
/*
 * Um array ou vetor é um objeto que armazena sequencias de dados. Esses dados são
 * alocados de uma vez só, em um bloco contíguo de memória ou memória heap (isso vai
 * ser mais discutido no exemplo 3 do projeto JavaPOO. A vantagem é o acesso imediato
 * aos elementos. As desvantagens são o tamanho fixo e a dificuldade pra inserir e deletar
 * valores. Se eu remover um elemento de uma posição eu vou precisar mover todos os
 * elementos posteriores uma posição acima, se não aquela posição vai ficar vazia.
 */
import java.util.Scanner;

public class Ex15_Arrays {
	public static void main(String[] args){

// Declarando um array

		// A expressão abaixo é como geralmente se declara um array.

		double[] vetor = new double[5];
		/*
		 *  Primeiro se especifica o tipo de dados que o array vai conter. Nesse caso double.
		 *  Os colchetes '[]' significa que vc está criando um array e não uma variável normal.
		 *  Isso faz o computador reservar um espaço contíguo da memória ram pra armazenar um
		 *  conjunto de dados. A variável 'vetor' vai apontar praquele espaço da memória.
		 *  Ela não vai representar um único espaço na memória ram (como nas variáveis
		 *  primitivas) mas vai conter em si o endereço desse conjunto de dados na memória.
		 *  
		 *  Em new double[x]; Você cria um objeto do tipo array colocando o número de elementos
		 *  que ele vai conter entre os [], no lugar do 'x'. O objeto vai ser instanciado na variável
		 *  'vetor' que foi criada. Essa coisa de instanciação de objetos vai ficar mais claro
		 *  no projeto JavaPOO, por enquanto se contente em saber que isso existe.
		 */

		// Então foi criado um array do tipo double com 5 elementos. Lembrando que o índice
		// dos elementos começa do 0 e não do 1 como se poderia supor.
		
// Acessando elementos do array
		// Pra acessar um elemento do array temos que chamar a variável que aponta pra ele e
		// especificar dentro de [] a posição que queremos acessar:
		vetor[0] = 6.7;
		// A variável 'vetor' não recebe o número. Ela aponta pro endereço, na
		// memória ram que é um espaço reservado pra um conjunto de dados. Através
		// do índice que passamos entre []o computador sabe qual lugar específico
		// dentro desse espaço reservado que eu quero colocar o dado que eu to passando.
		vetor[1] = 5.7;
		vetor[2] = 7.8;

		// Da mesma forma, da pra imprimir um dado específico de dentro desse array
		// entrando com a posição do elmento que eu quero ver.
		System.out.println(vetor[2]);

// Carregando elementos na declaração do array

		// Quando eu crio um vetor vazio, todos os elementos dentro dele serão 0, se for
		// um vetor numérico, null ou blank, se for caractere ou string, ou false, se for
		// boolean. Se eu quiser criar um vetor já inserindo valores, eu posso colocar esses
		// valores em ordem entre {} na criação do vetor. A ordem que os numeros aparecem é
		// a ordem que eles serão armazenados.
		int[] outroVetor = {1,2,3,4,5,6,7};
		int num = 5;
		System.out.println("Posição = "+num+", valor "+outroVetor[num]);

// Usando laço de repetição pra acessar arrays

		int numAlunos = 5;
		Scanner input = new Scanner(System.in);

		// Aqui eu indiquei o tamanho do array a partir da variável numAlunos
		double[] notaAlunos = new double[numAlunos];

	// Eu vou começar um ciclo for e vou usar a variável 'i' pra acessar os itens do vetor
		for (int i = 0; i < numAlunos; ++i) {
			// Coloquei 'i' + 1 porque eu não quero que ele comece pelo aluno 0.
			System.out.println("Insira a nota do " + (i+1) + "º aluno.");
			
			// Em cada ciclo da repetição 'i' é incrementado, começando por zero. Da primeira 
			// vez que ele passar por aqui, 'i' vai valer 0. Então ele vai acessar a posição 0,
			// do vetor, recebendo um valor do usuário. Da segunda vez que ele executar a repetição
			// 'i' vai valer 1, dai ele acessa a posição 1. Isso repete até que que 'i' seja igual
			// a quantidade de itens que tem no vetor. Daí ele vai ter acessado todos.
			notaAlunos[i] = input.nextDouble();
		}
		input.close();

		// Pra imprimir na tela os valores que foram armazenados eu uso a mesma lógica mudando 
		// apenas o código a ser executado a cada ciclo.

		for (int i = 0; i < numAlunos; ++i) {
			System.out.println("Nota do aluno " + (i+1) + " = " + notaAlunos[i] + ".");
		}
// Propriedade lenght

		/* 
		 * Se por um acaso eu criar um vetor que armazena por exemplo 3 numeros
		 * e no meu laço for coloque meu contador em um numero maior que 3 eu vou receber
		 * um erro, pois vou estar tentando acessar um campo fora dos limites (out of bounds) do vetor.
		 * Eu poderia criar uma variável pra definir esse tamanho e por essa variável dentro
		 * do [] na criação do vetor e usar ela como condição no meu laço for, como foi feito
		 * ali em cima. Uma outra forma de resolver isso é acessando o lenght (comprimento)
		 * do meu vetor. Assim, se eu atribuir, digamos, 5 na hora da criação do meu vetor 'x',
		 * basta eu colocar no meu laço for a condição "i < x.length", que ela vai estar sempre
		 * atrelada ao tamanho do meu vetor, independente do tamanho que eu escolher. Por exemplo:
		 */
		int[] numeros = new int[5];
		for (int i = 0; i < numeros.length; ++i) {
			System.out.println("Número = "+numeros[i]);
		}

		// Isso funciona porque lenght retorna pra gente um numero inteiro igual
		// ao tamanho do vetor:
		System.out.println("Tamanho do vetor: " + numeros.length);

// Uma outra forma de preencher vetores é usando o método fill
		int[] maisVetor = new int[5];
		java.util.Arrays.fill(maisVetor, 2, 4, 10);

		/* 
		 * Esse método recebe alguns parâmetros: o nome do vetor (vetor), a posição a partir da 
		 *  qual eu quero entrar um valor (nesse caso eu coloquei 2), a posição até a qual esse
		 *  valor vai ser inserido (4) e o valor que eu quero inserir (10).
		 *  A posição de partida é inclusa. A segunda não. Isso é um detalhe do método.
		 *  Então na posição 2 e 3 ele vai inserir 10 e no resto vai ficar 0.
		 */
		for (int i = 0; i < maisVetor.length; ++i) {
			System.out.println("Posição = "+i+", valor "+maisVetor[i]);
		}
	}
}