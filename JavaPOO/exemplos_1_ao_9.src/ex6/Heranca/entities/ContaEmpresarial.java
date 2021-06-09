package ex6.Heranca.entities;

public class ContaEmpresarial extends Conta {

	private Double limiteCred;

	public ContaEmpresarial() {
		// Invoca o construtor padrão da classe herdada
		// Se houver modificação no construtor lá, ela vem pra cá
		super();
	}

	public ContaEmpresarial(Integer numero, String titular, Double saldo, Double limiteCred) {
		// Invoca o outro construtor da classe herdada passando os parâmetros
		super(numero, titular, saldo);
		this.limiteCred = limiteCred;
	}

	public Double getLimiteCred() {
		return limiteCred;
	}

	public void setLimiteCred(Double limiteCred) {
		this.limiteCred = limiteCred;
	}

	public void emprestimo (Double quantia) {
		if (quantia <= limiteCred) {
			saldo += quantia;
		}
	}
}