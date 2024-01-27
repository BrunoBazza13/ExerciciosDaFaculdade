package listaligada;

public class Lista {

	private Nodo prim;

	public void geraLista() {

		prim = null;

	}

	public void adiciona(String nome) {

		Nodo novo = new Nodo();

		novo.setDado(nome);
		novo.setProximo(prim);
		prim = novo;

	}

	public void imprimeLista() {

		for (Nodo n = prim; n != null; n = n.getProximo()) {
			System.out.println(n.getDado());

		}

	}

}
