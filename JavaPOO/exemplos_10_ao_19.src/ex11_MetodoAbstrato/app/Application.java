package ex11_MetodoAbstrato.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ex11_MetodoAbstrato.model.entities.Circulo;
import ex11_MetodoAbstrato.model.entities.Forma;
import ex11_MetodoAbstrato.model.entities.Retangulo;
import ex11_MetodoAbstrato.model.enums.Cor;

public class Application {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<Forma> lista = new ArrayList<>();

		System.out.print("Número de figuras: ");
		int n = input.nextInt();
		input.nextLine();

		for (int i = 1; i <= n; i++) {
			System.out.println("\nFigura nº"+i);
			System.out.print("Retangulo ou circulo (r/c)? ");
			char r = input.next().charAt(0);
			input.nextLine();
			System.out.print("Cor (PRETO/BRANCO/VERMELHO): ");
			Cor cor = Cor.valueOf(input.nextLine());
			if (r == 'r') {
				System.out.print("Base: ");
				double base = input.nextDouble();
				System.out.print("Altura: ");
				double altura = input.nextDouble();
				Forma forma = new Retangulo(cor, base, altura);
				lista.add(forma);
			} else {
				System.out.print("Raio: ");
				double raio = input.nextDouble();
				Forma forma = new Circulo(cor, raio);
				lista.add(forma);
			}
		}

		System.out.println("AREAS:");
		for (Forma figura : lista) {
			System.out.println(figura.calcArea());
		}
		input.close();
	}
}