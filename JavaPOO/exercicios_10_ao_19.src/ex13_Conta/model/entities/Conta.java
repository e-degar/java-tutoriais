package ex13_Conta.model.entities;

import ex13_Conta.model.exceptions.ErroDeSaque;

public class Conta {

	private Integer numConta;
	private String titConta;
	private Double saldo;
	private Double limSaque;

	public Conta() {
	}

	public Conta(Integer numConta, String titConta, Double saldo, Double limSaque) {
		this.numConta = numConta;
		this.titConta = titConta;
		this.saldo = saldo;
		this.limSaque = limSaque;
	}

	public Integer getNumConta() {
		return numConta;
	}

	public String getTitConta() {
		return titConta;
	}

	public void setTitConta(String titConta) {
		this.titConta = titConta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public Double getLimSaque() {
		return limSaque;
	}

	public void setLimSaque(Double limSaque) {
		this.limSaque = limSaque;
	}

	public void deposito(Double quantia) {
		saldo += quantia;
	}

	public void saque(Double quantia) throws ErroDeSaque {
		validarSaque(quantia);
		saldo -= quantia;
	}

	private void validarSaque (Double quantia) throws ErroDeSaque {
		if (quantia > getLimSaque()) {
			throw new ErroDeSaque("\n*** Valor excede o limite de saques ****");
		}
		if (quantia > getSaldo()) {
			throw new ErroDeSaque("\n*** Saldo insuficiente ***");
		}

	}

}