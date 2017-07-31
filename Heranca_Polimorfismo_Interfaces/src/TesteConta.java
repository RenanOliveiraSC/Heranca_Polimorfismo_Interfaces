import java.text.DecimalFormat;

public class TesteConta {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#0.00");
		ClienteEspecial contaA = new ClienteEspecial();
		
		
		//Cria��o das Contas
		contaA.setNumero("16446546");
		contaA.setSaldo(500d);
		System.out.println("Conta: " + contaA.getNumero());
					
		
		// Opera��o de Deposita.
		contaA.depositar(200d);
		System.out.println("Cr�dito: R$ " + df.format(contaA.getDepositar()) + "\nSaldo: R$ "
				+ df.format(contaA.SaldoDisponivel()));
		
		// Sacar.
		contaA.sacar(100d);
		System.out.println(
				"D�bito: R$ " + df.format(contaA.getSacar()) + "\nSaldo: R$ " + df.format(contaA.SaldoDisponivel())
						+ "\nTaxa de Oper�a�o: R$ " + df.format(contaA.getTaxaOpercacao()));
		
		System.out.println();
		
		ContaCorrente contaB = new ContaCorrente();
		
		//Cria��o das Contas
		contaB.setNumero("7888888");
		contaB.setSaldo(500d);
		System.out.println("Conta: " + contaB.getNumero());
		
		
		// Opera��o de Deposita.
		contaB.depositar(200d);
		System.out.println("Cr�dito: R$ " + df.format(contaB.getDepositar()) + "\nSaldo: R$ "
				+ df.format(contaB.SaldoDisponivel()));
		
		// Sacar.
		contaB.sacar(100d);
		System.out.println(
				"D�bito: R$ " + df.format(contaB.getSacar()) + "\nSaldo: R$ " + df.format(contaB.SaldoDisponivel())
						+ "\nTaxa de Oper�a�o: R$ " + df.format(contaB.getTaxaOpercacao()));
		
		
		
	}
}
