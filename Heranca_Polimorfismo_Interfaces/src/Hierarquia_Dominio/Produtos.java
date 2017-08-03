package Hierarquia_Dominio;

import java.text.DecimalFormat;

public abstract class Produtos {
	DecimalFormat df = new DecimalFormat("#0.00");
	private String nome;
	private double preco;
	private int codigoBarras;

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

	public int getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(int codigoBarras) {
		this.codigoBarras = codigoBarras;
	}


	public Produtos(String nome, double preco, int codigoBarras) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.codigoBarras = codigoBarras;
	}
	
	@Override
	public boolean equals(Object obj) {
		Produtos produto = (Produtos)obj;
		if(codigoBarras == produto.getCodigoBarras()){
			return true;
		}else{ 
			return false;
		}
		
	}
}