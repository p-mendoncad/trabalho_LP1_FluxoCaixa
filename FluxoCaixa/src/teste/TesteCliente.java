package teste;

import modelo.Cliente;

public class TesteCliente {

	public static void main(String[] args) {
		Cliente c1 = new Cliente("Pedro", "12345678901", "pedro@gmail.com", true);
		Cliente c2 = new Cliente("Hilton", "12345678902", "hilton@gmail.com", true);
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}
}