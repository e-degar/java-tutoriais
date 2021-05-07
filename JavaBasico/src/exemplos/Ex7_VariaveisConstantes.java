package exemplos;

public class Ex7_VariaveisConstantes {

	public static void main (String[]args) {

		// Numa variável normal eu posso declarar e atribuir um valor, e depois atribuir outro 
		// valor em qualquer momento do código.
		int x = 10;
		System.out.println("x = "+x);
		x = 11;
		System.out.println("x = "+x);

		// Uma variável constante mantém o valor que eu atribui inicialmente e eu não posso modificá-lo
		// depois. Ele recebe a indicação "final"
		final int y = 10;
		System.out.println("y = "+y);

		// Se eu tentar atribuir outro valor nessa variável, o programa vai dar erro
		// Descomente a próxima linha pra ver o erro:
		// y = 11;
	}
}
