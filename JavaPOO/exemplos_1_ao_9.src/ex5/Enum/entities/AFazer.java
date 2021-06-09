package ex5.Enum.entities;

import java.util.Date;

import ex5.Enum.entities.enums.Status;

public class AFazer {

	private Integer id;
	private String titulo;
	private Date dataCriacao;
	private Status status;

	public AFazer () {
		
	}

	public AFazer(Integer id, String titulo, Date dataCriacao, Status status) {
		this.id = id;
		this.titulo = titulo;
		this.dataCriacao = dataCriacao;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String toString() {
		return "Tarefa: "+ titulo +"\nID: "+ id +"\nData de criação: " + dataCriacao + "\nStatus: " + status +"\n";
	}

}