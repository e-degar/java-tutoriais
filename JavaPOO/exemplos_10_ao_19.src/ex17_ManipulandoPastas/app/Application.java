package ex17_ManipulandoPastas.app;

import java.io.File;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Digite o caminho da pasta:");
		String strCaminho = input.nextLine();

		File caminho = new File(strCaminho);

		// só as pastas
		File[] pastas = caminho.listFiles(File::isDirectory);
		System.out.println("Pastas:");
		for (File pasta : pastas) {
			System.out.println(pasta);
		}

		// Só os arquivos
		File[] arquivos = caminho.listFiles(File::isFile);
		System.out.println("Arquivos:");
		for (File arquivo : arquivos) {
			System.out.println(arquivo);
		}

		// Criar uma subpasta
		boolean deuCerto = new File(caminho +"/Isso é uma pasta").mkdir();
		
		if (deuCerto) {
			System.out.println("Deu certo");
		} else {
			System.out.println("Não deu certo");
		}

		input.close();
	}
}