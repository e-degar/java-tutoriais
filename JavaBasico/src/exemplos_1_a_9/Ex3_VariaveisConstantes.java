package exemplos_1_a_9;
/*
 * Variáveis constantes geralmente são usadas pra colocar um valor constante
 * em alguma fórmula, como pi, por exemplo.
 * 
 * É uma boa prática nomear esse tipo de variável com todas as letras maiúsculas.
 */
public class Ex3_VariaveisConstantes {

	public static void main (String[]args) {

		// Numa variável normal eu posso declarar e atribuir um valor, e depois atribuir outro 
		// valor em qualquer momento do código.
		int x = 10;
		System.out.println("x = "+x);
		x = 11;
		System.out.println("x = "+x);

		// Uma variável constante mantém o valor que eu atribui inicialmente e eu não posso modificá-lo
		// depois. Ele recebe a indicação "final"
		final int Y = 10;
		System.out.println("Y = "+Y);

		// Se eu tentar atribuir outro valor nessa variável, o programa vai dar erro
		// Descomente a próxima linha pra ver o erro:
		// y = 11;
	}
}