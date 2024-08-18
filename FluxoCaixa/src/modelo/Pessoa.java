package modelo;

public abstract class Pessoa {
	String nome;
	String cpf;
	String email;
	String id;
	boolean sexo;
	
	public boolean getSexo() {
		return this.sexo;
	}
	
	public String getId(){
		String valorId = String.copyValueOf(this.id.toCharArray());
		return valorId;
	}
	
	public String getNome() {
		String valorNome = String.copyValueOf(this.nome.toCharArray());
		return valorNome;
	}
	
	public String getCPF() {
		String valorCPF = String.copyValueOf(this.cpf.toCharArray());
		return valorCPF;
	}

	public String getEmail() {
		String valorEmail = String.copyValueOf(this.email.toCharArray());
		return valorEmail;
	}

	public String toString() {
		String toString = "id: " + id + " " + cpf + " " + nome + " - " + email;
		String valorToString = String.copyValueOf(toString.toCharArray());
		return valorToString;
	}
	
}
 
