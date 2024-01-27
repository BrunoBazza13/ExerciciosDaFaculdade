package listaligada;

public class Nodo {

	
	private Nodo proximo; // ponteiro que aponta para o proximo
	private int dado;  // valores dentro do nó ou celula
	
	
	public Nodo getProximo() {
		return proximo;
	}

	public void setProximo(Nodo proximo) {
		this.proximo = proximo;
	}
	
	public int getDado() {
		return dado;
	}

	public void setDado(int dado) {
		this.dado = dado;
	}
	
	
	
	
	
}
