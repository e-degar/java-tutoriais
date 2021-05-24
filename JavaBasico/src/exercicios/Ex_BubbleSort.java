package exercicios;

/* Bubble Sort é um modelo de algoritmo de ordenação, longe de ser o mais eficiente, mas que serve de
*  exemplo pra testar vários conceitos importantes como arrays, ciclos de repetição e operadores lógicos.
*  A lógica é basicamente: dado um vetor com n numeros, percorrer esse vetor comparando pares de numeros,
*  invertendo quando necessário, até que eles estejam ordenados. O programa precisa de um ciclo o numero
*  de vezes que ele precisa percorrer o vetor até que ele tenha comparado todos os numeros, mas ele precisa
*  também de um break pra não ficar percorrendo à toa caso ele tenha ordenado tudo antes de terminar o ciclo.
*/  

public class Ex_BubbleSort {

	public static void main(String[] args) {
		// Aqui é iniciado o array
		int vetor[] = {3, 6, 2, 1, 8, 4};
		// Aqui são criadas duas variáveis que vão ajudar a fazer a operação
		int aux;
		boolean controle;

		// O primeiro laço de repetição vai percorrer os campos do vetor de acordo com o tamanho dele.
		for(int i = 0; i < vetor.length; ++i){
			controle = true;
			// Aqui tem um segundo laço de repetições dentro do primeiro. Então a cada ciclo do primeiro,
			// ele vai rodar uma outra repetição. Esse é o laço que vai fazer a troca de posições.
			for(int j = 0; j < (vetor.length - 1); ++j){
				/* Repare que o length ficou o tamanho do vetor menos um. Isso é pq o if que tem aqui dentro
				*  vai estar sempre comparando posição j com a próxima posição (j+1). O problema é que quando
				*  chegar na ultima posição do vetor ele vai querer comparar com a próxima, que não existe.
				*  Isso faria o programa retornar um erro. Ou seja, o numero de comparações vai ser menor que o
				*  o numero de vezes que ele vai percorrer o vetor pq o ultimo numero não precisa ser comparado.
				*/  
				if(vetor[j] > vetor[j + 1]){
					/* Aqui a variável aux entra pra ajudar com a troca. Se j for maior que j + 1 (o próximo valor)
					 * ele vai colocar o valor de j no aux, em seguida colocar o valor de j + 1 em j (uma posição
					 * antes), e depois pegar o valor que estava em j e que foi armazenado em aux e colocar em
					 * j + 1 (uma posição depois). Tá feita a troca.
					 */
					aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;

					/* A variável controle vai possibilitar o programa parar quando tudo estiver em ordem.
					 * Toda vez que o laço for interno for executado e o if fizer a comparação e precisar trocar
					 * numeros, a variável controle vai ser marcada como false. Fora do laço interno, vei ter
					 * uma verificação pra saber se ela é verdadeira. Se ela for falsa o laço se repete.
					 */
					controle = false;
				}
			}
			/* Se nenhum numero for trocado, o primeiro laço (o externo) vai deixar controle marcada como
			 * true (verdadeira), então esse if vai mandar a repetição parar.
			 */
			if(controle){
				break;
			}
		}
		// Aqui ele imprime o vetor já ordenado.
		for (int i = 0; i < vetor.length; ++i) {
		System.out.print(vetor[i] + " ");
		}
	}
}