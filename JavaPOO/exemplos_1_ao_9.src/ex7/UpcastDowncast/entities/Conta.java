package ex7.UpcastDowncast.entities;

public class Conta {

	private Integer numero;
	private String titular;
	// Protected permite que esse atributo seja acessado fora dessa clase
	// mas somente por subclasses que herdam essa classe.
	protected Double saldo;

	public Conta () {
	}

	public Conta(Integer numero, String titular, Double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void deposito(Double quantia) {
		saldo += quantia;
	}

	public void saque(Double quantia) {
		saldo -= quantia;
	}
}