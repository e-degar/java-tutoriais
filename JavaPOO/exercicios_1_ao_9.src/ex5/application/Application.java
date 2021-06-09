package ex5.application;

import java.util.Scanner;

import ex5.entities.Conta;

public class Application {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Conta contaBancaria;

		System.out.print("Numero da conta: ");
		int numConta = input.nextInt();
		System.out.print("Nome do cliente: ");
		input.nextLine();
		String nomeCliente = input.nextLine();
		char key;

		System.out.print("Deseja efetuar um depósito inicial? (s/n) ");
		key = input.next().charAt(0);
		if (key == 's') {
			System.out.print("Digite o valor inicial: R$ ");
			double depInicial = input.nextDouble();
			contaBancaria = new Conta(numConta, nomeCliente, depInicial);
		} else {
			contaBancaria = new Conta(numConta, nomeCliente);
		}

		System.out.println("Dados da conta:"+ contaBancaria);
		System.out.println();

		System.out.print("Digite um valor para depósito: R$ ");
		contaBancaria.deposito(input.nextDouble());
		System.out.println("Dados atualizados da conta:"+ contaBancaria);
		System.out.println();

		System.out.print("Digite um valor para o saque: R$ ");
		contaBancaria.saque(input.nextDouble());
		System.out.println("Dados atualizados da conta:"+ contaBancaria);
		System.out.println();

		input.close();
	}
}