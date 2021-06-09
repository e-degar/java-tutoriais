package ex6.entities;

public class Aluguel {

	private String nome;
	private String email;

	public Aluguel(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}

	public String toString() {
		return nome + ", " + email;
	}
}