package teste;

import modelo.Lista;
import modelo.Cliente;
import modelo.ContaAPagar;
import modelo.ContaAReceber;
import modelo.Fornecedor;

public class TesteLista {
	
	public static void main(String[] args){
	
		Lista<ContaAPagar> a = new Lista<>();
		
		Fornecedor f1 = new Fornecedor("Hilton", "12345678902", "hilton@gmail.com",true);
		Fornecedor f2 = new Fornecedor("Pedro", "12345678901", "pedro@gmail.com",true);
		
		ContaAPagar cap1 = new ContaAPagar("PIX", "Bradesco",f1, 30.00);
		ContaAPagar cap2 = new ContaAPagar("Crédito", "Caixa",f2, 50.00);
		
		a.adicionar(cap1);
		a.imprimeLista();
		
		Cliente c1 = new Cliente("Pedro", "12345678901", "pedro@gmail.com", true);
		ContaAReceber car1 = new ContaAReceber("Crédito", "Caixa",c1, 30.00);
		
		//a.adicionar(car2);
		
		
		
	
	}
}
