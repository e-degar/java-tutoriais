package ex10_ClasseAbstrata.app;

import ex10_ClasseAbstrata.entities.ContaEmpresarial;

import java.util.ArrayList;
import java.util.List;

import ex10_ClasseAbstrata.entities.Conta;
import ex10_ClasseAbstrata.entities.ContaPoupanca;
/*
 * Polimorfismo é a capacidade de uma variável do tipo mais genérico armazenar
 * um objeto do tipo mais específico.
 */
public class Application {

	public static void main(String[] args) {

		List<Conta> lista = new ArrayList<Conta>();

		//Conta cc1 = new Conta(0001, "João", 200.00);
		Conta cc2 = new ContaPoupanca(0002, "Jesus", 100.00, 5.0);
		Conta cc3 = new ContaEmpresarial(0003, "Golias", 500.00, 50000.0);

		lista.add(cc2);
		lista.add(cc3);

		for (Conta conta : lista) {
			System.out.println(conta);
		}
	}
}