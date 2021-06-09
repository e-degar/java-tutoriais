package ex13_Conta.app;

import java.util.Scanner;

import ex13_Conta.model.entities.Conta;
import ex13_Conta.model.exceptions.ErroDeSaque;

public class Application {

	public static void main (String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Informe os dados da conta");
		System.out.print("Número da conta: ");
		int numero = input.nextInt();
		input.nextLine();
		System.out.print("Nome do titular: ");
		String nome = input.nextLine();
		System.out.print("Saldo inicial: R$");
		double saldo = input.nextDouble();
		System.out.print("Limite de saque: R$");
		double limite = input.nextDouble();
		Conta conta = new Conta(numero, nome, saldo, limite);

		System.out.print("\n\nDigite um valor para o saque: R$");
		double valor = input.nextDouble();
		try {
			conta.saque(valor);
			System.out.println("Novo saldo: R$"+String.format("%.2f", conta.getSaldo()));
		} catch (ErroDeSaque e) {
			System.out.println("!!! ERRO !!!"+e.getMessage());
		}
		input.close();


	}
}