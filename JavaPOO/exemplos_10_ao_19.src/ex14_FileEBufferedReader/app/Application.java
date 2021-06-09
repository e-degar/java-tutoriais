package ex14_FileEBufferedReader.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Application {

	public static void main(String[] args) {
		String localArquivo = "/home/ede/eclipse-workspace/java-tutoriais/JavaPOO/exemplos_10_ao_19.src/ex14_FileEBufferedReader/app/arquivo.txt";
		FileReader fileReader = null;
		BufferedReader buffReader = null;

		try {
			fileReader = new FileReader(localArquivo);
			buffReader = new BufferedReader(fileReader);

			String linha = buffReader.readLine();

			while (linha != null) {
				System.out.println(linha);
				linha = buffReader.readLine();
			}
		}
		catch (IOException e){
			System.out.println("Erro: " + e.getMessage());
		}
		finally {
			try {
				if (buffReader != null) {
					buffReader.close();
				}
				if (fileReader != null) {
					fileReader.close();
				}
			} catch (IOException e){
				e.printStackTrace();
			}
		}
	}
}