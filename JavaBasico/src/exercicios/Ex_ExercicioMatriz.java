package exercicios;

import java.util.Scanner;

public class Ex_ExercicioMatriz {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int lin = input.nextInt();
		int col = input.nextInt();

		int [][] matriz = new int [lin][col];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = input.nextInt();
			}
		}
		int num = input.nextInt();
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j] == num) {
					System.out.printf("Posição: %d,%d%n", i, j);
					if (j > 0) {
						System.out.println("Left: " + matriz[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + matriz[i-1][j]);
					}
					if (j < matriz[i].length-1) {
						System.out.println("Right: " + matriz[i][j+1]);
					}
					if (i < matriz.length-1) {
						System.out.println("Down: " + matriz[i+1][j]);
					}
				}
			}
		}
		input.close();
	}
}