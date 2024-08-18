package teste;


import modelo.ContaAPagar;
import modelo.ContaAReceber;
import modelo.HistoricoPagar;
import modelo.Fornecedor;
import modelo.Cliente;

public class TesteHistoricoPagar {
	public static void main(String[]args){
		HistoricoPagar h1 = new HistoricoPagar();
		Fornecedor f1 = new Fornecedor("Pedro", "12345678901", "pedro@gmail.com",true);
		ContaAPagar cap1 = new ContaAPagar("Crédito", "Caixa",f1, 30.00);
		h1.adicionar(cap1);
		System.out.println(cap1);
		
		Cliente f2 = new Cliente("Hilton", "12345678902", "hilton@gmail.com",true);
		ContaAReceber cap2 = new ContaAReceber("PIX", "Bradesco",f2, 50.00);
		System.out.println(cap2);

		System.out.println(System.getProperty("line.separator")+"Teste procuraConta:" + System.getProperty("line.separator"));

		System.out.println(h1.procuraConta("F1"));
		System.out.println(h1.procuraConta("2024-1"));
		System.out.println("Valor total a ser pago: R$"+h1.valorTotal());
		
		if(h1.verificaItem(cap2)) {
			System.out.println("conta presente no histórico");
		}
		else {
			System.out.println("conta  ausente no histórico");
		}
		
		h1.remove(cap2);
		
		/*if(h1.verificarConta(cap2)) {
			System.out.println("conta presente no histórico");
		}
		else {
			System.out.println("conta  ausente no histórico");
		}*/
	}
}