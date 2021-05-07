package exemplos;

import java.util.Scanner;

public class Ex11_IfElse {

	public static void main (String[]args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Qual o seu nome?");
		String nome = input.nextLine();
		System.out.println("Qual a sua idade?");
		int idade = input.nextInt();


		/* O If e o Else são formas de executar uma determinada linha de código se uma
		*  condição específica for atendida. Pra isso se usa operadores de condição.
		*  Os operadores são == (igual), != (diferente de), > (maior que), < (menor que),
		*  >= (maior ou igual), <= (menor ou igual)
		*  A estrutura é basicamente: SE [uma condição for verdadeira] Linha de código, SENÃO 
		*  outra linha de código. Eu posso juntar o else com outro if pra colocar outras condições.
		*  Veja o exemplo:
		*/
		if(idade < 1) {
			System.out.println("Idade inválida. Tá doido "+nome+"?");
		} else if (idade >= 18 ) {
			System.out.println("Quer mais vinho "+nome+"?");
		} else {
			System.out.println("Pare de beber "+nome+". Você é menor de idade!");
		}

		// Existe ainda uma possibilidade de colocar sem colchetes mas apenas se 
		// existir apenas uma condição e uma linha pra executar se a condição for atendida
		if(idade < 1)
			System.out.println("Zuera "+nome+"! Toma mais vinho!");

		System.out.println("#########################################\n");

		/* Existem ainda operadores lógicos que eu posso usar em situação de
		*  condiçionais pra juntar duas condições. Os operadores são && (e) e 
		* || (ou).
		*/

		System.out.println("Digite um numero "+nome);
		int numero = input.nextInt();
		input.close();

		/* Aqui eu vou usar o operador % na minha condição pra checar se o número
		*  entrado pelo usuário é par. O segundo bloco vai verificar se o número é
		*  menor que 15. Entre eles vou usar o operador &&  Vou fazer ainda um terceiro
		*  pra verificar se o número é maior que 505, só que usando o operador || (ou).
		*  Então vai ficar: SE [numero for par] E [numero for menor que 15] OU [numero
		*  for maior que 505] ENTÃO FAÇA [linha de código] Obs. Tem que estar tudo
		*  dentro de parênteses.
		*/
		if ((numero % 2 == 0) && (numero < 15) || (numero > 505)){
			System.out.println("Show de bola");
		} else {
			System.out.println("Hmmmmmmm");
		}

		// Uma coisa que vale ressaltar é que os operadores condicionais retornam valores
		// Boolean (verdadeiro ou falso)
	}
}