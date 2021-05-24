package exemplos_10_a_19;

import java.util.Scanner;
/*
 * String é uma variável que armazena um conjunto de caracteres. Elas
 * não são do tipo valor ou primitivo. As variáveis String são do tipo referência,
 * mas esse tipo de variável vai ser melhor explicado no projeto JavaPOO, basta
 * você saber que uma variável String é um objeto. Tanto é que se você segurar
 * ctrl e clicar no nome String você vai abrir a classe que representa esse tipo
 * de objeto, com todos seus atributos e métodos.
 */
public class Ex17_Strings {

	public static void main (String[]args) {

// Declarando Strings

		// Strings são declaradas com aspas duplas
		String nome = "Marcelo";

		Scanner input = new Scanner(System.in);

// Recebendo string do usuário

		// O método next faz a leitura da string apenas até o próximo espaço.
		System.out.println("Digite um nome: ");
		String maisNome = input.next();

		// Aqui eu coloquei pra ele ler uma linha vazia porque quanto eu digitei o primeiro
		// nome, ele leu até achar um espaço. Mas como eu apertei enter pra finalizar a leitura
		// esse enter virou uma quebra de linha 'pendente'.
		input.nextLine();

		// Isso significa que quanto eu chamar o próximo nextLine, pra ler o outro nome
		// ele vai consumir essa quebra de linha e seguir o código sem eu conseguir
		// escrever o nome.

		// Uma outra forma de obter uma string é usando o método nextLine()
		// que faz a leitura até encontrar uma quebra de linha
		System.out.println("Digite seu nome: ");
		String outroNome = input.nextLine();

		// Isso aqui fecha meu objeto de entrada.
		input.close();
		System.out.println("Olá "+outroNome+"! Eu sou o "+nome+".");
		System.out.println("O nome escolhido foi: "+maisNome);


// Algumas funções pra manipular Strings

	// Por ser uma variável objeto e não de tipo primitivo, as String
	// usufruem de recursos de Orientação a Objeto. Elas possuem, então
	// diversos métodos pra facilitar a manipulação
		String palavras = "The quick brown fox jumps over the lazy dog     ";
		System.out.println("Frase original:" + palavras);

	// toLowerCase: Transforma tudo em minúsculo
		String tudoMinusculo = palavras.toLowerCase();
		System.out.println("toLowerCase:" + tudoMinusculo);

	// toUpperCase: Transforma tudo em maiúsculo
		String tudoMaiusculo = palavras.toUpperCase();
		System.out.println("toUpperCase:" + tudoMaiusculo);

	// trim: Retira os espaços em excesso no começo e no final da string
		String ajustado = palavras.trim();
		System.out.println("trim: " + ajustado);

	// substring: Separa um trecho da String de acordo com a posição do caractere
	// que é passada na função. Essa função pode receber um ou dois argumentos

		// Com um argumento, a função copiar a string só a partir do caractere
		// da posição 4, espera-se então que ele pegue do 'q' em diante
		String cortado = palavras.substring(4);
		System.out.println("substring(4):" + cortado);

		// Outra forma de usar essa função é passando dois argumentos. A partir de,
		// e até onde.
		String fatiado = palavras.substring(40, 43);
		System.out.println("substring(40, 43): " + fatiado);

	// replace: serve pra substituir um caractere por outro.

		// A função vai percorrer a string procurando os caracteres do primeiro argumento
		// e toda vez que ela encontrar, vai substituir pelo segundo argumento. Nesse caso
		// toda vez que encontrar 'o' vai trocar por 'X'
		String trocaLetra = palavras.replace('o', 'X');
		System.out.println("replace('o', 'X'): " + trocaLetra);

		// Ele serve pra trocar grupos de caracteres também		
		String goodboi = palavras.replace("dog", "good boi");
		System.out.println("replace('dog', 'goodboi'): " + goodboi);

	// indexOf: Localiza a posição, na string, da primeira ocorrência do que eu passar como
	// argumento
		int a = palavras.indexOf("he");
		System.out.println("Primeira posição de 'he': " + a);

	// lastIndexOf: Localiza a posição da última ocorrência do que eu passar
		int b = palavras.lastIndexOf("he");
		System.out.println("Última posição de 'he': " + b);

	// Split: Essa função separa cada conjunto de caracteres que estiver entre o caractere
	// que vc passar como argumento. Você pode jogar os conjuntos ou palavras num vetor,
	// e cada um vai ocupar uma posição desse vetor. Aqui eu vou passar espaço como argumento
	// então ele deve separar cada palavra da frase
		String[] vetor = palavras.split(" ");

	// E pra ler esse vetor:
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}
}