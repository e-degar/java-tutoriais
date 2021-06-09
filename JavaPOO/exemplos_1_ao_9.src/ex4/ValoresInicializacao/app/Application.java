package ex4.ValoresInicializacao.app;

import ex4.ValoresInicializacao.entities.ValoresInicializacao;

/*
 * Como eu expliquei no exemplo 2 do projeto JavaBasico, as variáveis de
 * tipo valor declaradas em classes ou arrays recebem automaticamente 
 * valores de inicialização.
 */
public class Application {
	public static void main(String[]args) {

		ValoresInicializacao val = new ValoresInicializacao();

		// Valores inteiros são inicializados com 0
		System.out.println("byte: "+val.a);
		System.out.println("short: "+val.b);
		System.out.println("int: "+val.c);
		System.out.println("long: "+val.d);

		// Valores decimais são inivializados com 0.0
		System.out.println("float: "+val.e);
		System.out.println("double: "+val.f);

		// Variáveis char são inicializadas com o caractere blank = \u0000
		System.out.println("char: "+val.g);

		// Variáveis boolean são inicializadas com false
		System.out.println("boolean: "+val.h);

		// Variáveis de tipo referência são inicializadas com null
		System.out.println("String: "+val.i);
	}
}