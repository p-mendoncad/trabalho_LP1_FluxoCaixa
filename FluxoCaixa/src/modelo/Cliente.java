package modelo;

public class Cliente extends Pessoa {
	
	static int incrementador = 1;
	
	public Cliente(String nome, String cpf, String email, boolean sexo) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.id = "C" + incrementador++;
		this.sexo = sexo;
	}
}