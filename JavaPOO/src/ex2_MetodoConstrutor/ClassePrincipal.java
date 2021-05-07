package ex2_MetodoConstrutor;

public class ClassePrincipal {
	public static void main (String[]args) {

		/*
		 * Um método construtor é um tipo de método específico de uma classe objeto
		 * que tem por função carregar os atributos desssa classe no objeto que estamos
		 * instanciando. Por padrão, o Java cria um construtor default automaticamente
		 * quando escrevemos a nossa classe objeto. Aqui no instanciamento do objeto,
		 * o termo Circulo() é na verdade uma invocação desse método que vai criar um 
		 * objeto do tipo círculo com os atributos especificados na classe. Você também
		 * pode declarar explicitamente o método construtor dentro da classe que contem
		 * a abstração do objeto. Nesse caso, abra a classe Circulo pra ver ele sendo 
		 * criado.
		 */
		Circulo circ = new Circulo();

		/*
		 * A função do construtor é a de inicializar o objeto e a única forma de invocá-lo
		 * é por meio da palavra "new".
		 */

		/*
		 * Existem alguns casos em que o programador precisa explicitamente declarar o
		 * método construtor. Um exemlo é quando a gente precisa que o construtor receba
		 * um argumento. No caso do objeto Circulo, o atributo diametro não recebe nenhum
		 * valor no momento da criação do objeto. Mas se eu quiser atribuir um diâmetro
		 * logo no momento que eu instancio a classe, eu poderia então passar esse valor
		 * como argumento. Veja como nenhum valor foi carregado em diametro:
		 */
		System.out.println("Diâmetro do circulo 1: "+circ.diametro);

		/* 
		 * Pra exemplificar eu criei uma classe Circulo2 que vai receber como parâmetro
		 * um valor double e armazená-lo no atributo diâmetro. Vamos instanciá-la em um 
		 * objeto.
		 */
		Circulo2 circ2 = new Circulo2(2.5);

		// Agora vamos verificar o valor de diametro
		System.out.println("Diâmetro do circulo 2: "+circ2.diametro);

		/*
		 *  Repare que se eu instanciar o objeto sem passar um argumento, ele da erro.
		 *  Se eu crio o método construtor com um parâmetro eu sou obrigado a atender
		 *  esse parâmetro. Da mesma forma, eu não consigo passar um argumento pra um
		 *  construtor default, porque ele tem nenhum parâmetro.
		 */ 

		/*
		 * Eu posso também precisar criar construtores que recebem mais de um valor.
		 * Ou, pra ter mais flexibilidade, eu poderia criar mais de um construtor
		 * com diferentes configurações.
		 */
	}
}