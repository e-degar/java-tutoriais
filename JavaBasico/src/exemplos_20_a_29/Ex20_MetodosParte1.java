package exemplos_20_a_29;

import java.util.Scanner;

/* Um método é uma forma de evitar repetição de código. Se a gente escrever um código que 
 * realiza algum tipo de operalção qualquer, seria terrível ter que reescrever o cálculo
 * toda vez que precisássemos realizar essa operação. Então a gente pode escrever um método
 * que faz uma coisa específica e de dentro do nosso método principal (main) a podemos invocar
 * esse outro método quantas vezes a gente quiser com apenas uma linha de código.
 */

public class Ex20_MetodosParte1 {

	// Esse é o método main. Ele por padrão é o método por onde o programa começa a execução.
	// Se não houver método main nada acontece. Você pode comentar o método main e deixar o
	// restante pra ver esse comportamento.
	public static void main (String[]args) {

		// Exemplo 1: invocar um método que imprima uma mensagem.
		// Eu declaro esse método depois do } que finaliza o método principal.
		// Em seguida eu chamo esse método:
		alo();
		// Você pode comentar essa chamada pra ver que ele não imprime a mensagem se eu não
		// chamar ele de dentro do meu método principal. Posso chamá-lo qtas vezes eu quiser.
		alo();
		alo();

		// Exemplo 2: Eu posso criar um método que faça coisas mais complexas.
		// O próximo método vai fazer o cálculo da área de um retângulo.
		area();

		/* Exemplo 3: Retornando valores de um método.
		*  Digamos que eu quero calcular a área de mais de um retângulo e depois somar a
		*  área total sem ter que reescrever o método. Eu posso fazer ele retornar um valor
		*  e atribuir esse valor a uma variável do meu método principal. Veja:
		*/
		double area1 = areaRetorna();
		double area2 = areaRetorna();
		System.out.println("Área total: "+(area1+area2));

		/* Exemplo 4: Passando parâmetros à um método.
		*  Eu vou usar o mesmo exemplo do cálculo da área só que dessa vez, eu vou pedir
		*  que o usuário entre com os dados a partir do método principal e vou chamar o método
		*  apenas pra fazer o cálculo passando pra ele os valores que o usuário inseriu como 
		*  parâmetros. Veja só:
		*/
		Scanner input = new Scanner(System.in);
		System.out.println("Informe o valor da base: ");
		double base = input.nextDouble();
		System.out.println("Informe o valor da altura: ");
		double altura = input.nextDouble();

		// Agora eu chamo o método e passo as variáveis base e altura, entre parênteses, como
		// argumentos que serão inseridos como parâmetros no método
		double area = calculaArea(base, altura);
		System.out.println("Calculo da área\nBase: "+base+"\nAltura: "+altura+"\nÁrea: "+area);

		// Repare que o método principal recebe parâmetros também (String[] args), ou seja
		// ele recebe um vetor de String com o nome args.

	}
	// Métodos dos exemplos

	// Exemplo 1 - Esse é o método do exemplo 1.
	public static void alo() {
		System.out.println("Alô meu chapa");
	}
	// Exemplo 2 - Área do retângulo.
	public static void area() {
		Scanner input = new Scanner(System.in);

		// Entrada de dados
		System.out.println("Informe o valor da base: ");
		double base = input.nextDouble();
		System.out.println("Informe o valor da altura: ");
		double altura = input.nextDouble();

		// Cálculo e saída do resultado
		double area = base*altura;
		System.out.println("Calculo da área\nBase: "+base+"\nAltura: "+altura+"\nÁrea: "+area);
	}
	// Exemplo 3 - Área do retângulo (eu repeti mas foi pra fins didáticos hehe).

		// Nesse caso, eu tive que especificar que o meu método vai retornar um
		// valor de um determinado tipo. Antes eu escrevia void (vazio) pq meus 
		// métodos não retornavam nada. Agora eu preciso colocar double. 
	public static double areaRetorna() {

		// Eu poderia criar um método que retorna um inteiro, o uma string ou até
		// um array, desde que eu especifique isso na declaração do método.

		Scanner input = new Scanner(System.in);

		// Entrada de dados
		System.out.println("Informe o valor da base: ");
		double base = input.nextDouble();
		System.out.println("Informe o valor da altura: ");
		double altura = input.nextDouble();

		// Cálculo e saída do resultado
		double area = base*altura;
		System.out.println("Calculo da área\nBase: "+base+"\nAltura: "+altura+"\nÁrea: "+area);

		// Aqui eu coloco o valor que esse método vai retornar pro meu
		// método principal (main)
		return area;
	}

	/* Veja que agora eu declarei o método indicando entre parênteses que ele vai
	*  receber como parâmetros duas variáveis double, base e altura. Eu poderia colocar
	*  ele pra receber também outros tipos de variáveis de acordo com a necessidade.
	*  Eu só preciso que o método receba todas a variáveis declaradas nos parâmeros.
	*  Note porém que os parâmetros tem que ser passados na mesma ordem que eles vão
	*  ser recebidos dentro do método.
	*/
	public static double calculaArea(double x, double y) {

		/* Outra observação é quanto ao escopo das variáveis. Veja que eu recebi o valor
		*  da base e armazenei em x e o da altura em y. As variáveis que eu recebo de fora
		*  não chegam nesse método sendo as mesmas. Seus valores são atribuidos à variáveis
		*  que existem apenas dentro desse método. Dentro do escopo desse método. São variáveis
		*  locais. Eu não poderia por exemplo usar a variável base do método principal aqui
		*  porque ela só existe dentro do escopo do método principal. O cálculo que esta sendo
		*  executado aqui só é possível porque eu estou passando os valores como argumentos que
		*  vão ser inserido nos parâmetros desse método. Existem variáveis globais mas isso é
		*  outro assunto.
		*/

		// Repare que eu não preciso nem declarar as variáveis base e altura dentro do método
		// porque ele tá recebendo elas de fora.
		double area = x*y;
		return area;
	}
}