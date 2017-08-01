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
		return "DVDs: "+getNome()+"  preço: R$ "+getPreco()+"  duração: "+getDuracao();
	}
	
	private void constr(String duracao, String nome, double preco) {
		this.duracao = duracao;
		this.getNome();
		this.getPreco();

	}
	
}
