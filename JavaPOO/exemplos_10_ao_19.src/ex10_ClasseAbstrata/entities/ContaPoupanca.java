package ex10_ClasseAbstrata.entities;

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
	// Método sobrescrito
	@Override
	public void saque (Double quantia) {
		saldo -= quantia;
	}

	@Override
	public String toString() {
		super.toString();
		return "ContaPoupanca "+super.toString() +"[taxa=" + taxa + "]";
	}

}