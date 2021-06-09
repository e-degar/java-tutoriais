package ex5.Enum.app;

import java.util.Date;

import ex5.Enum.entities.AFazer;
import ex5.Enum.entities.enums.Status;

public class Application {

	public static void main(String[] args) {

		AFazer tarefa1 = new AFazer(1, "Estudar Enum", new Date(), Status.PENDENTE);

		System.out.println(tarefa1);
		
		AFazer tarefa2 = new AFazer(2, "Fazer anotações", new Date(), Status.PENDENTE); 
		AFazer tarefa3 = new AFazer(3, "Subir código no git", new Date(), Status.PENDENTE);
		
		System.out.println(tarefa2+"\n"+tarefa3);
		
		tarefa1.setStatus(Status.FEITO);
		tarefa2.setStatus(Status.valueOf("FEITO"));
		
		System.out.println(tarefa1+"\n"+tarefa2+"\n"+tarefa3);
	}

}
