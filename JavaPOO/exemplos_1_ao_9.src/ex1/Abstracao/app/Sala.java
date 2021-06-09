package ex1.Abstracao.app;

import ex1.Abstracao.entities.TV;

public class Sala {
	public static void main (String[]args) {

		/* Agora vocẽ está com a TV na sua sala. Vamos ligar ela na tomada e colocar o cabo da antena.
		*  Ou melhor, vamos criar um objeto do tipo TV. A linha de código pra criar um objeto tem duas
		*  partes: a declaração e a instanciação. Pra declarar o objeto colocamos o nome da classe
		*  do tipo que esse objeto vai ser, em seguida definimos o nome do objeto, colocamos um sinal
		*   de = e depois vem a instanciação através da palavra "new" e a inicialização dos valores do
		*  nosso objeto por meio de "TV();". É o instanciamento que vai dizer pro sistema operacional
		*  reservar um espaço na memória RAM pra armazenar as informações do objeto que estamos criando.
		*/
		TV tvdetubo = new TV();

		/* Lembra que a classe TV é uma abstração que representa um tipo de objeto? Agora temos um objeto
		*  específico com aqueles atributos chamado tvdetubo. Podemos acessar aqueles atributos mas quando
		*  acessamos o método ligaDesliga, não estamos acessando o método da classe TV. Essa classe é só uma
		*  abstração. Estamos acessando, na verdade, o método ligaDesliga da tvdetubo. Ela tem esse método
		*  porque ela é um objeto do tipo TV. A abstração é como se fosse um molde pra fazermos objetos com
		*  as mesmas características.
		*/

		/* 
		* Agora que tá tudo pronto, vamos ligar a TV chamando o método ligaDesliga da tvdetubo. Pra acessar
		* os métodos e atributos da nossa TV de tubo, usamos um ponto assim podemos chamar agora o método
		* ligaDesliga. Podemos acessar seus atributos da mesma forma, mas tenha em mente que a cada vez que
		* a classe TV é instanciada, as variáveis que ela contém se tornam variáveis dessa instância e apenas
		* dela. No momento que eu instancio a classe novamente em outro objeto, ele vai ter as mesmas variáveis
		* só que separado das variáveis do outro objeto. Por isso que eu tenho que colocar o nome do objeto pra
		* acessar os atributos.
		*/
		tvdetubo.ligaDesliga();

		// Desligando e ligando de novo
		tvdetubo.ligaDesliga();
		tvdetubo.ligaDesliga();

		// Aumentando o volume
		tvdetubo.aumentarVolume();
		tvdetubo.aumentarVolume();
		tvdetubo.aumentarVolume();
		tvdetubo.aumentarVolume();
		
		/*
		 * Existe uma outra forma de declarar variáveis como atributo de uma classe. São as variáveis de classe.
		 * Essa variáveis valem para todos os objetos, e se ela é modificada uma vez, a mudança vale para todos
		 * os objetos em que a classe está instanciada. A variável numSerie
		 */

		// Agora vamos supor que você decidiu comprar uma TV nova.
		TV tvnova = new TV();

		// Você pode ligar sua TV nova:
		tvnova.ligaDesliga();

		// Agora você tem dois objetos diferentes do tipo TV, com as mesmas caracteristicas.
		// Pra provar que são objetos diferentes, vamos desligar uma delas e comparar seus
		// estados acessando o atributo ligado de cada uma:
		tvdetubo.ligaDesliga(); // Desligamos a de tubo
		System.out.println("A TV de tubo está "+(tvdetubo.ligado == true ? "ligada." : "desligada."));
		System.out.println("A TV nova está "+(tvnova.ligado == true ? "ligada." : "desligada."));
	}
}