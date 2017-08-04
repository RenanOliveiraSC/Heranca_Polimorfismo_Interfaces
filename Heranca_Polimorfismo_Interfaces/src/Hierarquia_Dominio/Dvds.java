package Hierarquia_Dominio;

public class Dvds extends Produtos {

	private String duracao;

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	@Override
	public String toString() {
		return "DVDs: " + getNome() + "  pre�o: R$ " + getPreco() + "  dura��o: " + getDuracao()
				+ "   c�digo de barras: " + getCodigoBarras();
	}

	public Dvds(String nome, double preco, String codigoBarras, String duracao) {
		super(nome, preco, codigoBarras);
		this.duracao = duracao;
	}

}
