package ex15_TryWithResources.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Application {

	public static void main(String[] args) {
		String localArquivo = "/home/ede/eclipse-workspace/java-tutoriais/JavaPOO/exemplos_10_ao_19.src/ex15_TryWithResources/app/arquivo.txt";

		try (BufferedReader buffReader = new BufferedReader(new FileReader(localArquivo))) {

			String linha = buffReader.readLine();

			while (linha != null) {
				System.out.println(linha);
				linha = buffReader.readLine();
			}
		}
		catch (IOException e){
			System.out.println("Erro: " + e.getMessage());
		}
	}
}