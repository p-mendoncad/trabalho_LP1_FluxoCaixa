package modelo;

public class HistoricoPagar extends Historico {
	
	public HistoricoPagar(){
		this.contas = new Lista<ContaAPagar>();
	}
}

//Generics