package modelo;

import java.time.LocalDate;

public class ContaAPagar extends Conta {
	
	private Fornecedor fornecedor;
	static int incrementador = 1;

	public ContaAPagar(String descricao, String banco, Fornecedor fornecedor, double valor) {
		this.data = LocalDate.now();
		this.descricao = descricao;
		this.banco = banco;
		this.fornecedor = fornecedor;
		this.valor = valor;
		this.id = data.getYear() + "-" + incrementador++;
	}
	
	public String toString() {
		String toString =  data + " " + descricao + " " + banco + " " + fornecedor.toString() + " R$" + valor + " " + id;
		String valorToString = String.copyValueOf(toString.toCharArray());
		return valorToString;
	}
}