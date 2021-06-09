package ex10_Pedidos.model.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ex10_Pedidos.model.enums.StatusEnum;

public class Pedido {
	private Date dataPedido;
	private StatusEnum statusPedido;

	private Cliente cliente;
	private List<ItemPedido> itensPedido = new ArrayList<>();

	SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

	public Pedido () {
	}

	public Pedido(Date dataPedido, StatusEnum statusPedido, Cliente cliente) {
		this.dataPedido = dataPedido;
		this.statusPedido = statusPedido;
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Date getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}

	public List<ItemPedido> getItensPedido() {
		return itensPedido;
	}

	public StatusEnum getStatusPedido() {
		return statusPedido;
	}

	public void setStatusPedido(StatusEnum statusPedido) {
		this.statusPedido = statusPedido;
	}

	public void addItem (ItemPedido itemPedido) {
		itensPedido.add(itemPedido);
	}

	public void rmvItem (ItemPedido itemPedido) {
		itensPedido.remove(itemPedido);
	}

	public Double total() {
		double total = 0;
		for (ItemPedido item : itensPedido) {
			total += item.subTotal();
		}
		return total;
	}

	public String toString() {
		StringBuilder escrivao = new StringBuilder();
		escrivao.append("\nData do pedido: "+ dateFormat.format(dataPedido));
		escrivao.append("\nStatus do pedido: "+ statusPedido);
		escrivao.append(cliente);
		escrivao.append("Itens:\n");
		for (ItemPedido item : itensPedido) {
			escrivao.append(item);
		}
		escrivao.append("\nValor total: R$"+String.format("%.2f",total()));
		
		return escrivao.toString();
	}
}