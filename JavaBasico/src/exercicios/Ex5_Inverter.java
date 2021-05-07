package exercicios;

/*
 * A proposta desse exercício é criar um programa que pega os valores de um array e inverte.
 * Pode ou não receber os numeros do usuário mas é importante que o array a ser invertido 
 * venha do método principal (main) e seja invertido em um outro método. Esse outro método 
 * tem que retornar um novo array com os numeros invertidos.
 */

public class Ex5_Inverter {
	public static void main (String[]args) {

		// Vetor normal
		int [] vetor = {3,5,6,3,7,8};

		// Vetor invertido que vai entregar o vetor normal como argumento pro
		// método inverterVetor e receber ele invertido.
		int [] rotev = inverterVetor(vetor);

		// Imprime o vetor invertido
		for (int i = 0; i < rotev.length; i++) {
			System.out.print(rotev[i]+" ");
		}
	}

	// Método de inverter vetor. Recebe um vetor inteiro como parâmetro
	public static int [] inverterVetor (int [] vetor) {

		// Vetor que vai ser retornado pro método principal contendo o vetor
		// que foi recebido, só que invertido;
		int [] rotev = new int[vetor.length];

		// Isso aqui vai pegando os valores do primeiro vetor em ordem crescente
		// e colocando no segundo vetor de trás pra frente (j faz a contagem inversa).
		for(int i = 0, j = vetor.length - 1; i< vetor.length; ++i, --j) {
			rotev[j] = vetor[i];
		}

		// Finalmente retorna o vetor invertido.
		return rotev;
	}
}