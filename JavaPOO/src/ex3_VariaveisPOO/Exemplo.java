package ex3_VariaveisPOO;
/*
 * Vimos que as variáveis de uma classe objeto se tornam variáveis da instância quando a classe
 * é instanciada em um objeto. Existe porém uma forma de criar uma variável de classe. A variável
 * de classe fica disponível pra todos os objetos onde a classe é instanciada, mas toda vez que
 * ela é modificada, a modificação vale pra todos. Pra declarar uma variável desse tipo, acresenta-se
 * a palavra "static" na declaração.
 */

public class Exemplo {
	int x = 0;
	// Essa é uma variável de classe.
	static int y = 0;

	// Pra mostrar como ela funciona, criei esse método incremento que adiciona 1 às variáveis x
	// y. Agora eu vou instanciar essa classe em dois objetos na minha Classe Principal.
	public void incremento() {
		++x;
		++y;
	}
}