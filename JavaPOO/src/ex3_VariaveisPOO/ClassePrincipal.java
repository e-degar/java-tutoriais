package ex3_VariaveisPOO;

public class ClassePrincipal {
	public static void main(String[]args) {

		Exemplo objeto1 = new Exemplo();
		Exemplo objeto2 = new Exemplo();

		// Agora que os meus objetos estão instanciados, vou chamar o método pra cada um deles.
		objeto1.incremento();
		objeto2.incremento();

		// Vamos ver o que aconteceu:

		/*
		 * O valor de x vai ser 1, porque a variável é apenas de instância. Então a primeira
		 * vez que eu chamei o método pro objeto 1, sua variável x foi incrementada. Quando eu
		 * chamei o mesmo método pro objeto 2, a variável x DO OBJETO 2 foi incrementada. As
		 * duas ficam valendo 1.
		 */
		System.out.println("Variável x do objeto 1: "+objeto1.x);
		System.out.println("Variável x do objeto 2: "+objeto2.x);

		/* 
		 * Como a variável y é uma variável de classe, o comportamento dela é diferente. As
		 * alterações nessa variável valem pra todos os objetos. Então quando eu chamei o
		 * método incremento pro primero objeto, ela foi incrementada. Quando eu chamei pro
		 * segundo objeto, ela foi incrementada de novo. O valor dela então fica sendo 2
		 * pros dois objetos. Eles compartilham essa variável.
		 */
		System.out.println("Variável x do objeto 1: "+objeto1.y);
		System.out.println("Variável x do objeto 2: "+objeto2.y);
	}
}