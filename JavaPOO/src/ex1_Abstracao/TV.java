package ex1_Abstracao;

// Introdução à Programação Orientada a Objeto

/*
 *  Um paradigma de programação se refere à uma forma de abordar um problema e conceber
 *  um código pra resolvê-lo. Um deles é a Programação Orientada a Objetos ou POO. A POO
 *  consiste em representar objetos do mundo real em código, por meio da criação e interação
 *  entre objetos, atributos, métodos etc. Os conceitos que fundamentam a POO são Abstração,
 *  Herança, Encapsulamento e Polimorfismo.
 */

/*
 * Abstração significa literalmente representar um objeto de forma abstrata. Uma TV por exemplo,
 * se pensarmos no conceito abstrato do que é uma TV, podemos supor certas características (ou
 * atributos) e funcionalidades (métodos) que uma TV qualquer teria.
 */

// Obs. Numa situação normal o nome da classe deve remeter ao objeto que ela vai representar.
// Aqui eu coloquei Ex1 pra ter uma ordem leitura desses tutoriais mas tenha em mente que em 
// uma situação normal essa classe se chamaria TV.
public class TV {

	// Atributos

	/* 
	 * Imagine que você aleatoriamente ganhou uma TV velha de tubo. Ela veio dentro de uma caixa sem nada
	 * escrito. Mesmo antes de tirar da caixa você percebe que é uma TV, porque ela tem características que
	 * todas as TVs têm. Logo, mesmo sem saber os detalhes dessa TV você sabe que é uma TV porque você
	 * o conceito abstrato de TV. A POO faz essa mesma aproximação. Essas características são chamadas de
	 * atributos. Aqui eu vou colocar três deles:
	 */
	String fabricante = ""; // Porque toda TV tem um fabricante, mas que pode variar.
	String cor = ""; // Toda TV tem uma cor.
	int volume = 0; // Toda TV também tem um atributo volume. Que nesse caso representa um estado.
	boolean ligado = false; // Outro estado possível da TV

	/* 
	 * Quanto às funcionalidades, elas são representadas por métodos. Depois de colocar sua TV nova de tubo
	 * na tomada, quando você aperta o botão pra ligar, você está chamando um método que vai mudar o estado
	 * ligado para true (verdadeiro). Quando você desligar, o estado ligado passará pra falso. Veja como
	 * fica o método:
	 */
	public void ligaDesliga() {

		if (ligado == false) {
			System.out.println("Ligou a TV");
			ligado = true;
		} else {
			System.out.println("Desligou a TV");
			ligado = false;
		}
	}
	
	/* 
	 * Outra funcionalidade da TV é o volume. Na POO podemos representar essa funcionalidade
	 * através dos métodos aumentarVolume e diminuirVolume. Veja como fica:
	 */

	public void aumentarVolume () {
		int maximo = 50;
		if (volume < maximo) {
			volume++;
			System.out.println("Volume: "+volume);
		}
	}
	public void diminuirVolume () {
		int minimo = 0;
		if (volume > minimo) {
			volume--;
			System.out.println("Volume: "+volume);
		}
	}
}
/*  Agora você pode testar sua TV. Mas antes você precisa colocá-la na sua sala de estar. A classe TV agora é
*	a abstração de um tipo de objeto. Ela não contém um método principal. Pra criar um objeto TV usando essa 
*   classe, precisamos instanciar ela em um objeto, em outra classe. Portanto uma classe que não é uma abstração
*   de algum tipo de objeto. Outras classes precisam ser escritas em seu próprio arquivo. Por isso, nesse mesmo
*	pacote existe uma classe Sala, contendo um método main onde a gente vai instanciar essa classe em um objeto TV.
*/
