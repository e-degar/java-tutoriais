package ex2.entities;

public class Funcionario {

	public String nome;
	public double salarioBruto;
	public double desconto;

	public double salarioLiquido () {
		return salarioBruto - desconto;
	}
	public double aumentarSalario(double porcentagem) {
		return salarioBruto += salarioBruto * porcentagem / 100.0;
	}
	public String toString() {
		return "\nFuncionario: "+ nome + "\nPagamento: R$" + String.format("%.2f", salarioLiquido());
	}
}