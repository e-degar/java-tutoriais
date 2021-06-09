package ex12_Imposto.entities;

public class PessoaFisica extends Contribuinte {

	private Double gastoSaude;

	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, Double rendaAnual, Double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}

	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public Double calculo() {
		double imposto = 0.0;
		if (getRendaAnual() < 20000) {
			imposto = 0.15;
		} else {
			imposto = 0.25;
		}
		return (getRendaAnual() * imposto) - (gastoSaude * 0.50);
	}
}