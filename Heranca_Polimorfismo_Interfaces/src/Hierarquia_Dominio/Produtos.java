package Hierarquia_Dominio;

import java.text.DecimalFormat;

public abstract class Produtos implements Comparable<Produtos>  {
	DecimalFormat df = new DecimalFormat("#0.00");
	private String nome;
	private double preco;
	private String codigoBarras;

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

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}


	public Produtos(String nome, double preco, String codigoBarras) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.codigoBarras = codigoBarras;
	}
	

	@Override
	public String toString() {
		return "Nome: " + this.nome + ", Preço: " + this.preco;
	}
	
	@Override
	public boolean equals(Object obj) {
		Produtos produtos = (Produtos) obj;
		return this.codigoBarras.equals(produtos.getCodigoBarras());
	}
	
	@Override
	public int compareTo(Produtos o) {
		return this.nome.compareTo(o.getNome());
		}
		
	}
