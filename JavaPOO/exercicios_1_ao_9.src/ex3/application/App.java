package ex3.application;

import java.util.Scanner;

import ex3.entities.Aluno;

public class App {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Aluno minino = new Aluno();

		System.out.println("Digite o nome do aluno e as notas para os quatro bimestres letivos");
		System.out.println();
		System.out.print("Nome: ");
		minino.nome = input.nextLine();
		System.out.print("Nota 1: ");
		minino.primeiroBimestre = input.nextDouble();
		System.out.print("Nota 2: ");
		minino.segundoBimestre = input.nextDouble();
		System.out.print("Nota 3: ");
		minino.terceiroBimestre = input.nextDouble();
		System.out.print("Nota 4: ");
		minino.quartoBimestre = input.nextDouble();

		System.out.println();
		System.out.printf("RESULTADO");
		System.out.println(minino);
		if (minino.media() < 5.0) {
			System.out.println("ALUNO REPROVADO");
			System.out.printf("Faltou %.2f pontos na nota final.", minino.quantoFalta());
		} else {
			System.out.println("ALUNO APROVADO");
		}

		input.close();
	}

}
