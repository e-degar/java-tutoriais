package ex11_MetodoAbstrato.model.entities;

import ex11_MetodoAbstrato.model.enums.Cor;

public class Circulo extends Forma{

	private Double raio;

	public Circulo () {
		super();
	}

	public Circulo(Cor cor, Double raio) {
		super(cor);
		this.raio = raio;
	}

	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}

	@Override
	public Double calcArea() {
		return Math.PI * raio * raio;
	}
}