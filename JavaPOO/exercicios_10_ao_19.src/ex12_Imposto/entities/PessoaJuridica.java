package ex12_Imposto.entities;

public class PessoaJuridica extends Contribuinte {

	private Integer funcionarios;

	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, Double rendaAnual, Integer funcionarios) {
		super(nome, rendaAnual);
		this.funcionarios = funcionarios;
	}

	public Integer getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(Integer funcionarios) {
		this.funcionarios = funcionarios;
	}

	@Override
	public Double calculo() {
		double imposto = 0.0;
		if (funcionarios < 10) {
			imposto = 0.16;
		} else {
			imposto = 0.14;
		}
		return getRendaAnual() * imposto;
	}
}