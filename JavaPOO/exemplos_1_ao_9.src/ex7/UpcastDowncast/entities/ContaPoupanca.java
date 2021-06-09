package ex7.UpcastDowncast.entities;

public class ContaPoupanca extends Conta{

	private Double taxa;

	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(Integer numero, String titular, Double saldo, Double taxa) {
		super(numero, titular, saldo);
		this.taxa = taxa;
	}

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}

	public void atualizarSaldo() {
		saldo += saldo * taxa;
	}
}