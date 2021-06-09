package ex13_LendoArquivos.app;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Application {
	public static void main (String[] args) {

		File arquivo = new File("/home/ede/eclipse-workspace/java-tutoriais/JavaPOO/exemplos_10_ao_19.src/ex13_LendoArquivos/app/arquivo.txt");
		Scanner input = null;
		try {
			input = new Scanner(arquivo);
			while (input.hasNextLine()) {
				System.out.println(input.nextLine());
			}
		}
		catch (IOException e) {
			System.out.println("Erro:" + e.getMessage());
		}
		finally {
			if (input != null) {
				input.close();
			}
		}
	}
}