package ex18_OutrosUsosFile.app;

import java.io.File;
import java.util.Scanner;
// Acessando propriedades de um arquivo ou pasta usando a classe file.
public class Application {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite o caminho do arquivo ou pasta: ");
		String strCaminho = input.nextLine();

		File caminho = new File(strCaminho);

		// Nome do arquivo ou pasta
		System.out.println("getName: " + caminho.getName());
		// Caminho do arquivo ou pasta
		System.out.println("getPath: " + caminho.getPath());
		// pasta pai
		System.out.println("getParent: " + caminho.getParent());
		// Caminho absoluto
		System.out.println("getAbsolutePath: " + caminho.getAbsolutePath());

		input.close();
	}
}