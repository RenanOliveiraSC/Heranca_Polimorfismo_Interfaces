package Hierarquia_Dominio;

public class Livros extends Produtos {

	private String autor;

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Livro: " + getNome() + "  preço: R$ " + getPreco() + "  autor: " + getAutor();

	}

	public Livros(String nome, double preco, int codigoBarras, String autor) {
		super(nome, preco, codigoBarras);
		this.autor = autor;
	}

}
