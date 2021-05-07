package exemplos;

import java.util.Scanner;

public class Ex10_Strings {

	public static void main (String[]args) {

		// String é uma variável que armazena um conjunto de caracteres.
		// Strings não são do tipo primitivo, se vc segurar ctrl e clicar no nome
		// String vc consegue ver a classe que representa o comportamento e funcionalidades
		// desse tipo de variável.

		// Strings são declaradas com aspas duplas
		String nome = "Marcelo";

		Scanner input = new Scanner(System.in);

		// Recebendo string do usuário

		// O método next faz a leitura da string apenas até o próximo espaço.
		// Uma outra forma de obter uma string é usando o método nextLine()
		// Que faz a leitura até encontrar uma quebra de linha
		System.out.println("Digite seu nome: ");
		String outroNome = input.nextLine();
		System.out.println("Digite um nome: ");
		String maisNome = input.next();

		// Aparentemente se eu colocar o primero como next e o segundo como 
		// nextLine ele vai pudar a segunda entrada de dados e ir pro final do código
		input.close();
		System.out.println("Olá "+outroNome+"! Eu sou o "+nome+".");
		System.out.println("O nome escolhido foi: "+maisNome);
	}
}