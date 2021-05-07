package exemplos;

// Importei a classe Scanner do java utils
import java.util.Scanner;

/* Se você apertar ctrl e clicar em Scanner (ou qualquer outra classe)
 * você vai navegar até essa classe podendo ver seu código fonte
 */

public class Ex5_ClasseScanner {

	public static void main (String[]args) {

		double base, altura, area;

		// Instanciei o método in da classe scanner na variável input
		Scanner input = new Scanner(System.in);

		System.out.println("Informe o valor da base: ");

		/* Aqui eu uso a variável input pra chamar o método next double
		 * que coloca um valor double na minha variável base
		 */
		base = input.nextDouble();

		System.out.println("Informe o valor da altura: ");

		// Mesma coisa aqui
		altura = input.nextDouble();

		// Aqui eu fecho o método
		input.close();

		area = base*altura;

		System.out.println("Calculo da área\nBase: "+base+"\nAltura: "+altura+"\nÁrea: "+area);
	}
}