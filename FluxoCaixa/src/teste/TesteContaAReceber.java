package teste;
import modelo.Cliente;
import modelo.ContaAReceber;
import modelo.ContaAPagar;
import modelo.Fornecedor;


public class TesteContaAReceber {	

	public static void main(String[] args) {
		Cliente c1 = new Cliente("Pedro", "12345678901", "pedro@gmail.com", true);
		ContaAReceber car1 = new ContaAReceber("Crédito", "Caixa",c1, 30.00);
		
		Cliente c2 = new Cliente("Hilton", "12345678902", "hilton@gmail.com", true);
		ContaAReceber car2 = new ContaAReceber("Crédito", "Caixa",c2, 30.00);
		
		Fornecedor f1 = new Fornecedor("Pedro", "12345678901", "pedro@gmail.com", true);
		ContaAPagar cap1 = new ContaAPagar("Crédito", "Caixa",f1, 30.00);
			
		Fornecedor f2 = new Fornecedor("Hilton", "12345678902", "hilton@gmail.com", true);
		ContaAPagar cap2 = new ContaAPagar("Crédito","Caixa",f2, 30.00);

		System.out.println(car1.toString());
		System.out.println(car2.toString());
		System.out.println(cap1.toString());
		System.out.println(cap2.toString());
	}
}