public class ContaCorrente {
	
	private String numero;
	private double saldo;
	private double sacar;
	private double depositar;
	private double taxaOpercacao = 0.5;

	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 * 
	 * @param valor
	 *            informado para somar ao saldo.
	 */
	public void depositar(double valor) {
		saldo += valor;
		depositar = valor; 
	}
	
	/**
	 * 
	 * @param valorinformado para diminuir do saldo + taxa de operção
	 *
	 */
	public void sacar(double valor) {
		saldo -= valor - (((taxaOpercacao * valor)/100)+1);
		sacar = valor;
	}
/**
 * 
 * @return exibe o saldo disponível.
 */
	public double SaldoDisponivel() {
		return this.saldo;
	}

		public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getTaxaOpercacao() {
		return taxaOpercacao;
	}

	public void setTaxaOpercacao(double taxaOpercacao) {
		this.taxaOpercacao = taxaOpercacao;
	}

	public double getSacar() {
		return sacar;
	}

	public double getDepositar() {
		return depositar;
	}

}
