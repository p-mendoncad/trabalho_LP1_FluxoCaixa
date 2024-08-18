package teste;
import modelo.Fornecedor;
import modelo.ContaAPagar;

public class TesteContaAPagar {
	public static void main(String[] args) {
		Fornecedor f1 = new Fornecedor("Hilton", "12345678902", "hilton@gmail.com", true);
		Fornecedor f2 = new Fornecedor("Pedro", "12345678901", "pedro@gmail.com", true);
		
		ContaAPagar cap1 = new ContaAPagar("PIX", "Bradesco",f1, 30.00);
		ContaAPagar cap2 = new ContaAPagar("Crédito", "Caixa",f2, 50.00);
		
		System.out.println(cap1.toString());
		System.out.println(cap2.toString());
	}
}
