package exemplos_10_a_19;
/*
 * IfElse é uma expressão que pode ser usada pra controlar o fluxo de execução
 * do programa. O conceito é simples, se (if) uma determinada condição for satisfeita,
 * ele executa um certo bloco de código. Se não (else), ele executa outro bloco,
 * pulando o primeiro.
 */
import java.util.Scanner;

public class Ex10_IfElse {

	public static void main (String[]args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Qual o seu nome?");
		String nome = input.nextLine();
		System.out.println("Qual a sua idade?");
		int idade = input.nextInt();

		/*
		 * Vimos os operadores lógicos e de comparação nos exemplos 7 e 8 desse
		 * projeto. Vamos usá-los agora pra controlar o fluxo de execução.
		 */
		
// if, else if e else
		
		// if: Aqui ele está comparando se a idade é menor que 1. Se for, ele retorna
		// o bloco que está entre a primeira {}
		if(idade < 1) {
			// Bloco que vai ser executado se idade < 1
			System.out.println("Idade inválida. Tá doido "+nome+"?");
		// else if: se a primeira comparação retornar falso, ele vai pular o de cima
		// e vir pra cá. Aqui ele tem outra comparação pra fazer: se idade >= 18
		} else if (idade >= 18 ) {
			// Bloco que vai ser executado se idade >= 18
			System.out.println("Quer mais vinho "+nome+"?");
		// else: por fim, se nenhuma das comparações for verdadeira, ele vai pular
		// pra cá. Eu poderia colocar outra comparação aqui acrescentando outro if
		// na frente do else. 
		} else {
			// Como idade não é menor que 1 nem maior ou igual a 18, ele vai executar
			// essa linha:
			System.out.println("Pare de beber "+nome+". Você é menor de idade!");
		}

// if simplificado

		// Existe ainda uma possibilidade de colocar sem chaves. Mas isso só funciona se 
		// existir apenas uma condição e uma linha pra executar se a condição for atendida
		if(idade < 1)
			System.out.println("Zuera "+nome+"! Toma mais vinho!");

		System.out.println("#########################################\n");

// Usando operadores lógicos

		// Com os operadores lógicos nossas expressões podem ficar mais complexas e abrir
		// mais possibilidades. O mesmo código de cima poderia ficar mais simples.

		System.out.println("Digite um numero "+nome);
		int numero = input.nextInt();
		input.close();

		/* 
		 * Aqui eu vou usar o operador % na minha condição pra checar se o número
		 * entrado pelo usuário é par. O segundo bloco vai verificar se o número é
		 * menor que 15. Entre eles vou usar o operador &&  Vou fazer ainda um terceiro
		 * pra verificar se o número é maior que 505, só que usando o operador || (ou).
		 * Então vai ficar: SE [numero for par] E [numero for menor que 15] OU [numero
		 * for maior que 505] ENTÃO FAÇA [linha de código] Obs. Tem que estar tudo
		 * dentro de parênteses.
		 */
		if ((numero % 2 == 0) && (numero < 15) || (numero > 505)){
			System.out.println("Show de bola");
		} else {
			System.out.println("Hmmmmmmm");
		}
	}
}