package exemplos;

// Array ou vetor multidimensional é basicamente uma matriz. É um vetor em que cada campo contém um
// vetor dentro.

public class Ex18_ArrayMultidimensional {
	public static void main(String[] args) {
		// Para declarar um vetor multidimensional basta colocar um [] a mais. Eu posso colocar
		// quantos eu quiser.
		double[][] x = {
		{10, 20, 30},
		{40, 50, 60},
		{70, 80, 90}
		};

		/* Assim como num vetor normal, eu preciso especificar o campo que eu to trabalhando dentro
		*  dele. No caso de um vetor 3 x 3 como o que foi criado aqui, ele teria os campos [0][0],
		*  [0][1], [0][2], [1][0], [1][1], [1][2], [2][0], [2][1] e [2][2]. Lembrando que no java a
		*  indicação dos campos de um vetor começa pelo 0 e não pelo 1.
		*/

		/* Pra acessar os campos de um vetor desse tipo, a lógica é bem parecida com a de um vetor
		*  normal. A diferença é que eu vou criar um laço for pra acessar cada coluna, e dentro desse
		*  laço eu vou criar um segundo laço pra acessar cada linha da coluna.
		*/		
		for(int i = 0; i < x.length; ++i){
			// Repare que aqui o length ta indicando o comprimento da linha.
			for(int j = 0; j < x[i].length; ++j){
				System.out.print(i + "|" + j + " = " + x[i][j] + "\t");
			}
			System.out.println("\n");
		} 
	}
}