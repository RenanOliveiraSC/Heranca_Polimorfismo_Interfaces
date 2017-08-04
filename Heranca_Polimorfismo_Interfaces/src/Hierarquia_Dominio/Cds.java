package Hierarquia_Dominio;

public class Cds extends Produtos {

	private String numeroFaixas;

	public String getNumeroFaixas() {
		return numeroFaixas;
	}

	public void setNumeroFaixas(String numeroFaixas) {
		this.numeroFaixas = numeroFaixas;
	}
	
	@Override
	public String toString() {
		return ("CDs: "+getNome()+"  pre�o: R$ "+getPreco()+"  numero de faixas: "+getNumeroFaixas()+"   c�digo de barras: "+getCodigoBarras());
	}

	public Cds(String nome, double preco, String codigoBarras, String numeroFaixas) {
		super(nome, preco, codigoBarras);
		this.numeroFaixas = numeroFaixas;
	}


}
