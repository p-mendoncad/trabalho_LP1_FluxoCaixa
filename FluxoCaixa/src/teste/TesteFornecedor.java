package teste;

import modelo.Fornecedor;

public class TesteFornecedor {

	public static void main(String[] args) {
		Fornecedor f1 = new Fornecedor("Hilton", "12345678902", "hilton@gmail.com", true);
		Fornecedor f2 = new Fornecedor("Pedro", "12345678901", "pedro@gmail.com", true);
		
		System.out.println(f1.toString());			
		System.out.println(f2.toString());
	}
}