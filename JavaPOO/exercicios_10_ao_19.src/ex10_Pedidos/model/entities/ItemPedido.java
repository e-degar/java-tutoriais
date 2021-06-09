package ex10_Pedidos.model.entities;

public class ItemPedido {

	private Integer qtde;
	private Double preco;

	private Produto produto;

	public ItemPedido() {
	}

	public ItemPedido(Integer qtde, Double preco, Produto produto) {
		this.qtde = qtde;
		this.preco = preco;
		this.produto = produto;
	}

	public Integer getQtde() {
		return qtde;
	}

	public void setQtde(Integer qtde) {
		this.qtde = qtde;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Double subTotal() {
		return preco * qtde;
	}

	public String toString() {
		StringBuilder escrivao = new StringBuilder();
		escrivao.append("\n"+produto.getNome()+", Quantidade: "+qtde+", Subtotal: R$"+ String.format("%.2f",subTotal()));
		return escrivao.toString();
	}

	
}
