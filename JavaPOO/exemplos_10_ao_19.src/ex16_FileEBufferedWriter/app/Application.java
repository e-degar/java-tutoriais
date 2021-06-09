package ex16_FileEBufferedWriter.app;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Application {

	public static void main(String[] args) {

		String localArquivo = "/home/ede/eclipse-workspace/java-tutoriais/JavaPOO/exemplos_10_ao_19.src/ex16_FileEBufferedWriter/app/novoarquivo.txt";
		String localArquivo2 = "/home/ede/eclipse-workspace/java-tutoriais/JavaPOO/exemplos_10_ao_19.src/ex16_FileEBufferedWriter/app/arquivo.txt";
		String[] nomes = new String[] {"Rogério", "Marquinhos", "Gabriela"};

		try (BufferedWriter buffWriter = new BufferedWriter(new FileWriter(localArquivo))){
			for (String linha : nomes) {
				buffWriter.write(linha);
				buffWriter.newLine();
			}
		} catch (IOException e){
			e.printStackTrace();
		}
		try (BufferedWriter buffWriter = new BufferedWriter(new FileWriter(localArquivo2, true))){
			for (String linha : nomes) {
				buffWriter.newLine();
				buffWriter.write(linha);				
			}
		} catch (IOException e){
			e.printStackTrace();
		}
	}
}