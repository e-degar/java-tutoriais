package exemplos;

public class Ex6_Casting {

	public static void main (String[]args) {

		int x = 10; int y = 6; int z = 3; // Dá pra criar múltiplas variáveis numa mesma linha
		double a = 3;

		System.out.println("x = "+x);
		System.out.println("y = "+y);
		System.out.println("z = "+z);

		// Numa variável double (ou float), mesmo sem especificar uma casa decimal
		// ele converte pra um número decimal, nesse caso 3.0
		System.out.println("a = "+a);

		// Se numa variável double (ou float) eu resolver jogar o resultado de uma operação
		// com inteiras, ele vai desconsiderar o valor decimal e retornar apenas o resultado inteiro
		// Nesse caso, 10/3 = 3.0
		double b = x/z;
		System.out.println("b = "+b);

		// O casting basicamente força a conversão de uma variável inteira para float.
		//Desta forma eu estou forçando a variável x a virar double
		double c = (double)x/z;
		System.out.println("c = "+c);

		// Eu posso fazer casting do resultado de uma operação, assim
		double d = (double)(x/z);
		// Mas nesse caso o resultado vai aparecer no formado decimal, porém, 
		// como o casting veio depois, o resultado vai aparecer com o valor inteiro
		System.out.println("d = "+d);

	}
}