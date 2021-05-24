package exemplos_1_a_9;
/*
 * A classe scanner é um classe que possibilita, entre outras coisas,
 * a entrada de dados. Ela precisa ser instanciada em um objeto pra
 * funcionar, mas como essa coisa de objetos já entra em POO então
 * aqui eu vou só explicar como faz. O projeto JavaPOO vai aprofundar
 * mais esse assunto.
 */

// Aqui eu importei a classe Scanner do java utils
import java.util.Scanner;

/* 
 * A classe scanner é, em princípio, uma classe. Com métodos e tudo
 * mais. Quando uma classe está em outro pacote, eu preciso importá-la
 * pra poder usar seus métodos. Se você segurar ctrl e clicar em Scanner
 * (ou qualquer outra classe) você vai conseguir navegar até essa classe
 * e ver seu código fonte.
 */

public class Ex6_ClasseScanner {

	public static void main (String[]args) {

		double base, altura, area;

		// Instanciei o objeto in da classe scanner na variável input.
		// Esse objeto é responsável por ler o que é digitado.
		Scanner input = new Scanner(System.in);

		System.out.println("Informe o valor da base: ");

		// Agora eu posso usar meu objeto input pra chamar o método
		// next double, da classe scanner. Esse método recebe um valor
		// double e coloca em uma variável, nesse caso base
		base = input.nextDouble();

		System.out.println("Informe o valor da altura: ");

		// Mesma coisa aqui
		altura = input.nextDouble();
		
		area = base*altura;

		System.out.println("Calculo da área\nBase: "+base+"\nAltura: "+altura+"\nÁrea: "+area);
		 
		// A classe Scanner possui diferentes métodos pra eu utilizar de acordo com o tipo de
		// dados que eu quero receber do usuário. O método next() recebe string:
		System.out.println("Digite uma palavra: ");
		String palavra = input.next();
		System.out.printf("Sua palavra é %s.\n", palavra);
		
		/*
		 *  nextDouble(). Obs. tem quer considerado o locale, se estiver em pt-br vc tem que inserir
		 *  com virgula, se estiver em US tem que entrar o double com ponto.
		 */
		System.out.println("Digite um valor double: ");
		double numero = input.nextDouble();
		System.out.printf("Seu numero é %2f.\n", numero);
		
		// Lendo caractere. Pra ler um caractere eu posso usar o charAt, junto com o next
		// pra não só dizer que eu quero apenas um caractere mas também especificar de qual
		// posição. Por exemplo:
		System.out.println("Digite um caractere: ");
		// Aqui independente de quantas letras eu escreva ele vai pegar apenas uma. A que
		// está na posição 0 como foi especificado entre parênteses no charAt(0). Eu posso
		// mudar a posição da letra que eu quero só mudando esse numero.
		char letra = input.next().charAt(0);
		System.out.printf("A letra é %c.\n", letra);
		
		// Eu posso ler vários dados numa mesma linha, separados por espaço
		String a; int b; double c;
		System.out.println("Digite um nome, um numero inteiro e um numero decimal: ");
		a = input.next();
		b = input.nextInt();
		c = input.nextDouble();
		System.out.printf("Você digitou %s, %d e %.2f.", a, b, c);
		
		// De forma parecida, eu posso fazer a leitura de variáveis string 
		// separadas por quebra de linha
		String d, e, f;
		int g;
		System.out.println("Digite um numero inteiro e três palavras: ");
		/* 
		 * Porém se eu quiser colocar um valor inteiro nessa sequemcia, ele vai
		 * ele vai preencher a variável d com um input vazio. Isso porque quando eu 
		 * digito o inteiro e dou um enter, esse enter vira uma quebra de linha pendente
		 * que acaba entrando no próximo nextLine(). Pra corrigir isso eu preciso criar um 
		 * nextLine, sem atribuir à variável depos do nextInt() pra pegar essa quebra de linha
		 * pendente ao invés de jogar ela na variável d. Se você quiser ver observar esse
		 * comportamento é só comentar o input.nextLine() depois do nextInt.
		 */
		g = input.nextInt();
		input.nextLine();
		d = input.nextLine();
		e = input.nextLine();
		f = input.nextLine();
		System.out.printf("Você digitou %d, %s, %s e %s.", g, d, e, f);
		
		// Aqui eu fecho o objeto input
		input.close();

	}
}