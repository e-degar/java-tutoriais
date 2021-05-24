package exemplos_10_a_19;

// Array ou vetor multidimensional é basicamente uma matriz. É um vetor de vetores.

public class Ex16_ArrayMatriz {
	public static void main(String[] args) {

// Declarando uma matriz
		// Para declarar um vetor multidimensional basta colocar um [] a mais. Eu posso colocar
		// quantos eu quiser.
		double[][] x = {
		// Pra fazer atribuição de valores eu tenho que colocar aos conjuntos.
		// Aqui está sendo criado um vetor com 3 linhas e 3 colunas. Cada linha
		// é um vetor com 3 espaços.
		{10, 20, 30},
		{40, 50, 60},
		{70, 80, 90}
		};

// Acessando vetores multidimensionais

		/* Assim como num vetor normal, eu preciso especificar o campo que eu to trabalhando dentro
		*  dele. No caso de um vetor 3 x 3 como o que foi criado aqui, ele teria os campos [0][0],
		*  [0][1], [0][2], [1][0], [1][1], [1][2], [2][0], [2][1] e [2][2]. Lembrando que no java a
		*  indicação dos campos de um vetor começa pelo 0 e não pelo 1.
		*/

		/* Pra acessar os campos de um vetor desse tipo, a lógica é bem parecida com a de um vetor
		*  normal. A diferença é que eu vou criar um ciclo 'for' pra acessar cada coluna, e dentro desse
		*  ciclo eu vou criar um segundo ciclo pra acessar cada linha da coluna.
		*/		
		for(int i = 0; i < x.length; ++i){
			// Repare que aqui o length ta indicando o comprimento da linha.
			for(int j = 0; j < x[i].length; ++j){
				System.out.print(i + "|" + j + " = " + x[i][j] + "\t");
			}
			System.out.println("\n");
			// A qtde de coluna depende da quantidade de elementos que as linhas terão.
			// Pra acessar a qtde de colunas acessamos a propriedade lenght de uma linha.
		} 
	    System.out.println("Vetor de "+x.length+"linhas e "+x[0].length+" colunas");
	}
}