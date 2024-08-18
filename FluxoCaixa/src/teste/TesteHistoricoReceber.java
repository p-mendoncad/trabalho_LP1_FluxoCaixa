package teste;

import modelo.Cliente;
import modelo.ContaAReceber;
import modelo.HistoricoReceber;

public class TesteHistoricoReceber {
	public static void main(String[]args) {
		HistoricoReceber h1 = new HistoricoReceber();
		Cliente c1 = new Cliente("Pedro", "12345678901", "pedro@gmail.com", true);
		ContaAReceber car1 = new ContaAReceber("Crédito", "Caixa",c1, 30.00);
		h1.adicionar(car1);
		System.out.println(car1);

		Cliente c2 = new Cliente("Hilton", "12345678902", "hilton@gmail.com", true);
		ContaAReceber car2 = new ContaAReceber("PIX", "Bradesco",c2, 50.00);
		h1.adicionar(car2);
		System.out.println(car2);

		System.out.println(System.getProperty("line.separator")+"Teste procuraConta:" + System.getProperty("line.separator"));


		System.out.println(h1.procuraConta("2024-2"));
		System.out.println(h1.procuraConta("2024-1"));
		System.out.println("Valor total a ser recebido: R$"+h1.valorTotal());

		if(h1.verificaItem(car2)) {
			System.out.println("conta presente no histórico");
		}
		else {
			System.out.println("conta  ausente no histórico");
		}

		h1.remove(car2);

		if(h1.verificaItem(car2)) {
			System.out.println("conta presente no histórico");
		}
		else {
			System.out.println("conta  ausente no histórico");
		}
	}
}