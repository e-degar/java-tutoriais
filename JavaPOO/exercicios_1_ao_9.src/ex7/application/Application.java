package ex7.application;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ex7.entities.Funcionario;

public class Application {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Funcionario proletario;
		List<Funcionario> funcionarios = new ArrayList<>();

		System.out.print("Quantos funcionários serão registrados? ");
		int n = input.nextInt();
		input.nextLine();

		for(int i = 1; i <= n; i++) {
			System.out.printf("\nFuncionário #%d%n",i+1);
			System.out.print("ID: ");
			int id = input.nextInt();
			while (idExiste(funcionarios, id)) {
				System.out.print("ID já registrado!! Tente novamente: ");
				id = input.nextInt();
			}
			System.out.print("Nome: ");
			input.nextLine();
			String nome = input.nextLine();
			System.out.print("Salário: ");
			double salario = input.nextDouble();
			proletario = new Funcionario(nome, salario, id);
			funcionarios.add(proletario);			
		}

		System.out.println();
		System.out.println("Lista de funcionários");
		for (Funcionario um : funcionarios) {
			System.out.println(um);
		}

		System.out.print("\nDigite o id do funcionário que receberá o aumento: ");
		int busca = input.nextInt();
		input.nextLine();

		Funcionario func = funcionarios.stream().filter(x -> x.getId() == busca).findFirst().orElse(null);
		if (func == null) {
			System.out.println("\nID NÃO EXISTE!!");
		} else {
			System.out.print("Digite a porcentagem do aumento: ");
			double aumento = input.nextDouble();
			func.aumentarSalario(aumento);
		}

		System.out.println();
		System.out.println("Lista atualizada!");
		for (Funcionario um : funcionarios) {
			System.out.println(um);
		}
		input.close();
	}

	public static boolean idExiste(List<Funcionario> lista, int id) {
		Funcionario func = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return func != null;
	}	
}