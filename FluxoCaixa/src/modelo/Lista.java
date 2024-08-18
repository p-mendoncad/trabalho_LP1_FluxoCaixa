package modelo;
import java.util.ArrayList;
import java.util.Iterator;

public class Lista<T> implements Iterable<T>{
	
	private ArrayList<T> lista = new ArrayList<>();
	
	public void adicionar(T item) {
		lista.add(item);
	}

	public void remove(T item) {
		lista.remove(item);
	}

	public boolean verificaItem(T item){
		if(lista.contains(item)) {
			return true;
		}
		return false;
	}

	public boolean temItens() {
		return lista.isEmpty();
	}
	
	public int tamanho() {
		return lista.size();
	}
	
	public void imprimeLista() {
		for(T item:lista) {
			System.out.println(item.toString());
		}
	}
	
	@Override
    public Iterator<T> iterator() {
        return lista.iterator();
    }

}
