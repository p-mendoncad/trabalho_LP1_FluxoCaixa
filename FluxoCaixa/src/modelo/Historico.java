package modelo;

public class Historico extends Lista<Conta>{
	
	public Lista<? extends Conta> contas;
	

	
	public Conta procuraConta(String id) {
		for(Conta conta : this) {
			if(conta.getId().equals(id)) {
				Conta valorProcuraConta = conta;
				return valorProcuraConta;
			}
		}
		return null;
	}

	public double valorTotal() {
		double somador = 0;
		for(Conta conta: this) {
			somador += conta.getValor();
		}
		final double valorTotal = somador;
		return valorTotal;
	}

}
