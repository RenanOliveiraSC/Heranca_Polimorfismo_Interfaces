package Hierarquia_Dominio;

import java.text.DecimalFormat;

public abstract class Produtos {
	DecimalFormat df = new DecimalFormat("#0.00");
	private String nome;
	private double preco;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	private void constr(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
}