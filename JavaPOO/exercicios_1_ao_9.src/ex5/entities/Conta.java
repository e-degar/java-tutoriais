package ex5.entities;

public class Conta {

	private int numConta;
	private String nomeCliente;
	private double saldo;
	private final double TAXA = 5.00;

	public Conta(int numConta, String nomeCliente, double depInicial) {
		
		this.numConta = numConta;
		this.nomeCliente = nomeCliente;
		deposito(depInicial);
	}
	public Conta(int numConta, String nomeCliente) {

		this.numConta = numConta;
		this.nomeCliente = nomeCliente;
	}

	public int getNumConta() {
		return numConta;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public double getSaldo() {
		return saldo;
	}
	public void deposito(double saldo) {
		this.saldo += saldo;
	}
	public void saque(double saldo) {
		this.saldo -= saldo + TAXA;
	}

	public String toString() {
		return "\nConta: " + numConta
				+ "\nNome do cliente: "
				+ nomeCliente + "\nSaldo atual: "
				+ String.format("R$ %.2f", saldo);
	}
}