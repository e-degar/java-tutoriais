package exemplos;

import java.util.Scanner;

public class teste {
	public static void main (String[]args) {
		
		double area1 = areaRetorna();
		double area2 = areaRetorna();
		System.out.println("Área total: "+(area1+area2));
	}
	public static double areaRetorna() {

		// Eu poderia criar um método que retorna um inteiro, o uma string ou até
		// um array, desde que eu especifique isso na declaração do método.

		Scanner input = new Scanner(System.in);

		// Entrada de dados
		System.out.println("Informe o valor da base: ");
		double base = input.nextDouble();
		System.out.println("Informe o valor da altura: ");
		double altura = input.nextDouble();


		// Cálculo e saída do resultado
		double area = base*altura;
		System.out.println("Calculo da área\nBase: "+base+"\nAltura: "+altura+"\nÁrea: "+area);

		// Aqui eu coloco o valor que esse método vai retornar pro meu 
		// método principal (main)
		return area;
	}
}
