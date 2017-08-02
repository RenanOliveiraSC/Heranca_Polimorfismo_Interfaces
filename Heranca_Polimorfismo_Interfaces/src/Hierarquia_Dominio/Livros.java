package Hierarquia_Dominio;

public class Livros extends Produtos {

	private String autor;

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Livros() {

	}

	@Override
	public String toString() {
		return "Livro: " + getNome() + "  preço: R$ " + getPreco() + "  autor: " + getAutor();

	}

	public Livros(String autor, String nome, double preco) {
		this.autor = autor;
		this.getNome();
		this.getPreco();
	}

}
