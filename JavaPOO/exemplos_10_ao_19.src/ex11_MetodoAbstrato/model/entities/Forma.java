package ex11_MetodoAbstrato.model.entities;

import ex11_MetodoAbstrato.model.enums.Cor;

public abstract class Forma {

	private Cor cor;

	public Forma() {
	}

	public Forma(Cor cor) {
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}

	public abstract Double calcArea();
}