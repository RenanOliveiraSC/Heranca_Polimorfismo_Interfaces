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
		return ("CDs: "+getNome()+"  pre�o: R$ "+getPreco()+"  numero de faixas: "+getNumeroFaixas());
	}

	private void CONSTR(String numeroFaixas, String nome, double pre�o ) {
		this.numeroFaixas = numeroFaixas;
		this.getNome();
		this.getPreco();
	}
}
