package modelo;

import java.time.LocalDate;

public abstract class Conta {
	
	LocalDate data;
	String descricao;
	String banco;
	double valor;
	String id;
	

	public LocalDate getData(){
		LocalDate valorDt = data;
		return valorDt;

	}

	public String getDescricao() {
		String valorDescricao = String.copyValueOf(this.descricao.toCharArray());
		return valorDescricao;
	}

	public String getBanco() {
		String valorBanco = String.copyValueOf(this.banco.toCharArray());
		return valorBanco;
	}

	public double getValor( ) {
		final double valorValor = valor;
		return valorValor;
	}

	public String getId() {
		String valorId = String.copyValueOf(this.id.toCharArray());
		return valorId;
	}
	
}
