package exemplos_10_a_19;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex18_Lists {

	public static void main(String[] args) {

		// Declarando e instanciando uma lista de inteiros. A lista não aceita tipos primitivos. Repare que na
		// instanciação eu tive que usar a classe ArrayList, que implementa a interface List.
		List<String> listaDeMigos = new ArrayList<>();

		// Adicionando elementos
		listaDeMigos.add("Maricota");
		listaDeMigos.add("Pipson");
		listaDeMigos.add("Macaquinha");
		listaDeMigos.add("Laranjo");
		listaDeMigos.add("Dória");
		listaDeMigos.add("Biroliro");
		listaDeMigos.add("Não é migo");
		listaDeMigos.add("Nananana");
		listaDeMigos.add("Nononono");
		// Inserindo um elemento numa posição específica
		listaDeMigos.add(2, "Lurdinha");

		// Remover elemento da lista pelo valor do elemento
		listaDeMigos.remove("Dória");

		// Remover elemento da lista pelo índice
		listaDeMigos.remove(5);

		// Remover elemento por predicado (isso é uma função lambda)
		listaDeMigos.removeIf(x -> x.charAt(0)=='N');

		// Usando um for each pra ler o conteúdo da lista
		for (String migos : listaDeMigos) {
			System.out.println(migos);
		}

		// Acessar o tamanho da lista
		int numeroDeMigos = listaDeMigos.size();
		System.out.println("Numero de migos: " + numeroDeMigos);

		// Localizar a posição de um elemento
		System.out.println("Posição do Laranjo na lista: " + listaDeMigos.indexOf("Laranjo"));

		// Se eu procurar alguém que não existe ele retorna -1
		System.out.println("Posição do Cláudio: " + listaDeMigos.indexOf("Cláudio"));

		// Filtrar uma lista por predicado. Stream permite fazer operações de tipo lambda com list. Precisa converter 
		// o resultado pra list no final com o collect
		List<String> migosComL = listaDeMigos.stream().filter(x -> x.charAt(0)=='L').collect(Collectors.toList());

		for (String migos : migosComL) {
			System.out.println(migos);
		}

		// Econtrar o primeiro elemento da lista que atenda à um predicado (função lambda). O orElse significa que se nada for
		// encontrado ele retorna nulo.
		String nomeComL = listaDeMigos.stream().filter(x -> x.charAt(0)=='L').findFirst().orElse(null);
		String nomeComA = listaDeMigos.stream().filter(x -> x.charAt(0)=='A').findFirst().orElse(null);
		String nomeComF = listaDeMigos.stream().filter(x -> x.charAt(0)=='F').findFirst().orElse(null);

		System.out.println("Nome com L: " + nomeComL);
		System.out.println("Nome com A: " + nomeComA);
		System.out.println("Nome com F: " + nomeComF);		
	}
}