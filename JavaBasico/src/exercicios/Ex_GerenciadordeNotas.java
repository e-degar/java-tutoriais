package exercicios;

/* O intuito desse exercício é fazer um programa pra receber nomes e notas de alunos referentes à 4 bimestres,
*  depois fazer um cálculo de média, e por fim exibir tudo na tela. A ideia não é fazer um programa 100% eficiente
*  mas treinar conceitos bem básicos como arrays, arrays multidimensionais, ciclos de repetição etc.
*/

import java.util.Scanner;

public class Ex_GerenciadordeNotas {
	public static void main (String[]args) {

		// Clube das constantes
		final int BIMESTRE = 4;
		final int NUMALUNOS = 4;
		final double NOTAMIN = 5.0;

		// Auxiliar pra me ajudar no cálculo das médias
		double aux = 0;

		Scanner input = new Scanner(System.in);

		// Clube dos arrays
		String [] nomes = new String [NUMALUNOS];
		double [][] notas = new double[NUMALUNOS][BIMESTRE];
		double [] medias = new double[NUMALUNOS];

		// Coletar nomes dos alunos
		for (int i = 0; i < NUMALUNOS; ++i) {
			System.out.println("Digite o nome do aluno "+(i+1)+":");
			nomes[i] = input.nextLine();
		}

		// Coletar notas
		for (int i = 0; i < NUMALUNOS; ++i) {
			for (int j = 0; j < BIMESTRE; ++j) {
				System.out.println("Digite a nota do "+(j+1)+"º Bimestre obtida por "+nomes[i]+":");
				notas[i][j] = input.nextDouble();
				// Calcular medias
				aux += notas[i][j];
			}
			// Armazenar medias
			medias[i] = aux/BIMESTRE;
			aux = 0;
		}
		input.close();

		// Imprimir resultado
		System.out.println("======== RESULTADO FINAL =======");
		for(int i = 0; i < NUMALUNOS; ++i){
			if(medias[i] >= NOTAMIN ){
				System.out.println("Nome: " + nomes[i] + " Media: " + medias[i] +" Situação: Aprovado");
				continue;
			}
			System.out.println("Nome: " + nomes[i] + " Media: " + medias[i] +" Situação: Reprovado");
		}
	}
}