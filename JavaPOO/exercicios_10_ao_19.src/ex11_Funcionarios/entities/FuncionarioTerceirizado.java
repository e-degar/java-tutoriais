package ex11_Funcionarios.entities;

public class FuncionarioTerceirizado extends Funcionario {

	private Double bonus;

	public FuncionarioTerceirizado () {
		super();
	}

	public FuncionarioTerceirizado(String nome, Integer horas, Double valorHora, Double bonus) {
		super(nome, horas, valorHora);
		this.bonus = bonus;
	}

	public Double getBonus() {
		return bonus;
	}

	public void setBonus(Double bonus) {
		this.bonus = bonus;
	}

	@Override
	public Double pagamento() {
		return super.pagamento() + bonus * 1.1;
	}

}