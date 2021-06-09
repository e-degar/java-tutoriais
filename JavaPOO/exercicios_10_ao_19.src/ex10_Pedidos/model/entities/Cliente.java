package ex10_Pedidos.model.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cliente {

	private String nome;
	private String email;
	private Date nasc;

	private List<Pedido> pedidos = new ArrayList<>();

	SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

	public Cliente () {
	}

	public Cliente(String nome, String email, Date nasc) {
		this.nome = nome;
		this.email = email;
		this.nasc = nasc;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getNasc() {
		return nasc;
	}

	public void setNasc(Date nasc) {
		this.nasc = nasc;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void addPedido(Pedido pedido) {
		pedidos.add(pedido);
	}

	public void rmvPedido(Pedido pedido) {
		pedidos.remove(pedido);
	}

	public String toString() {
		StringBuilder escrivao = new StringBuilder();
		escrivao.append("\nNome do cliente: "+ nome+ " Email: "+ email);
		escrivao.append("\nData de nascimento: "+ dateFormat.format(nasc));
		return escrivao.toString();
	}
}