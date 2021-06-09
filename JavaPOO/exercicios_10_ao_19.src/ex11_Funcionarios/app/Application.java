package ex11_Funcionarios.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ex11_Funcionarios.entities.Funcionario;
import ex11_Funcionarios.entities.FuncionarioTerceirizado;

public class Application {

	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		List<Funcionario> funcionarios = new ArrayList<>();

		System.out.print("Qtos trabalhadores quer registrar? ");
		int n = input.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("\nFuncionário #"+ i);
			System.out.print("Terceirizado? (s/n) ");
			char r = input.next().charAt(0);
			input.nextLine();
			System.out.print("Nome: ");
			String nome = input.nextLine();
			System.out.print("Horas: ");
			int horas = input.nextInt();
			System.out.print("Valor/hora: ");
			double valHora = input.nextDouble();
			if (r == 's') {
				System.out.println("Bônus ou algo assim: ");
				double bonus = input.nextDouble();
				funcionarios.add(new FuncionarioTerceirizado(nome, horas, valHora, bonus));
				} else {
					funcionarios.add(new Funcionario(nome, horas, valHora));
				}
		}
		System.out.println("\n\nPAGAMENTOS:");
		for (Funcionario func : funcionarios) {
			System.out.println(func.getNome()+" - R$"+String.format("%.2f", func.pagamento()));
		}
		input.close();
	}
}