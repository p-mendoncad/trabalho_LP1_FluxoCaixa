package modelo;

import java.time.LocalDate;

public class ContaAReceber extends Conta {
	
	private Cliente cliente;
	static int incrementador = 1;


	public ContaAReceber(String descricao, String banco, Cliente cliente, double valor) {
		this.data = LocalDate.now();
		this.descricao = descricao;
		this.banco = banco;
		this.cliente = cliente;
		this.valor = valor;
		this.id = data.getYear() + "-" + incrementador++;
	}

	public String toString() {
		String toString =  data + " " + descricao + " " + banco + " " + cliente.toString() + " R$" + valor + " " + id;
		String valorToString = String.copyValueOf(toString.toCharArray());
		return valorToString;
	}
}