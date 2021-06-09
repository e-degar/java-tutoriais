package ex7.entities;

public class Funcionario {

	private String nome;
	private Double salario;
	private Integer id;

	public Funcionario(String nome, Double salario, Integer id) {
		this.nome = nome;
		this.salario = salario;
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getSalario() {
		return salario;
	}
	public Integer getId() {
		return id;
	}
	public void aumentarSalario(Double porcentagem) {
		this.salario += salario * porcentagem / 100.0;
	}
	public String toString() {
		return id +", "+ nome +", R$"+ String.format("%.2f", getSalario());
	}
}