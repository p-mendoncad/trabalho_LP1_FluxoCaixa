package modelo;

public class Fornecedor extends Pessoa {
	
	static int incrementador = 1;

	public Fornecedor(String nome, String cpf, String email, boolean sexo) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.id = "F" + incrementador++;
		this.sexo = sexo;
	}
}