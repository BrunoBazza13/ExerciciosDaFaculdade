package listaligada;

public class Lista {

	private Nodo prim;
	private int tamanho;

	public void geraLista() {

		prim = null;

	}

	public int getTamanho() {

		return tamanho;

	}

	public void adiciona(int nome) {

		Nodo novo = new Nodo();

		novo.setDado(nome);
		novo.setProximo(prim); // novo null
		prim = novo;
		tamanho++;

	}

	public void imprimeLista() {

		for (Nodo n = prim; n != null; n = n.getProximo()) {
			System.out.println(n.getDado());

		}

	}

	public boolean isEmpty() {

		return prim == null;

	}

	public void removeInicio() {

		if (!isEmpty()) {
			this.prim = prim.getProximo();

		} else {

			System.out.println("Não a elementos na lista");
		}

	}

	public boolean busca(int elemento) {

		for (Nodo no = prim; no != null; no = no.getProximo()) {

			if (elemento == no.getDado()) {
				return true;
			} 
				
			}
			return false;
		}

	}


