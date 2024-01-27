package listaligada;

public class Lista {

	private Nodo inicio; // primeiro elemento da lista

	private int tamanho = 0;

	public void geraLista() { // gera a lista null

		inicio = null;

	}

	public void adiciona(int num) {

		Nodo novo = new Nodo(); // obj do tipo Nodo

		novo.setDado(num);
		novo.setProximo(inicio); // define o proximo elemeto apontando para null
		inicio = novo; // recebe os valores do obj criado apontando para o novo NO

		this.tamanho++;

	}

	public int obterTamanho() {

		return this.tamanho;

	}

	public boolean isEmpty() { // verifica se a lista ligada esta vazia

		return inicio == null;

	}

	public void removeInicio() {

		if (!isEmpty()) {

			this.inicio = inicio.getProximo();

		} else {

			System.out.println("Não ha elementos na lista");

		}

	}

	public void imprimeLista() {

		for (Nodo n = inicio; n != null; n = n.getProximo()) {
			System.out.println(n.getDado());

		}

	}

	public Nodo busca(int elemento) { // outro exemplo de busca

		for (Nodo no = inicio; no != null; no = no.getProximo()) {

			if (elemento == no.getDado()) {// se o elemento for igual ao dado do nó
				return no; // encontrou o elemento
			}

		}
		return null;

	}

	public void free() { // metodo que libera a lista(exclui tds os elementos)

		while (inicio != null) {

			Nodo tmp = inicio.getProximo(); // criando variavel do tipo nodo recendo o prox
			inicio = null; // inicio da lista recebe null
			inicio = tmp; // o proximo tbm sera null

		}

	}

	public void adicionaOrdenado(int elemento) {

		Nodo anterior = null;
		Nodo n;

		
		for (n = inicio; n != null && n.getDado() < elemento; n = n.getProximo()) {
			anterior = n; // a cada laço ordena os valores da lista 

		}

		Nodo novo = new Nodo(); // cria o ob do tipo no
		novo.setDado(elemento); // add o elemento

		if (anterior == null) { 
			novo.setProximo(inicio); // novo aponta para null
			inicio = novo; // inicio passa apontar para o novo NO 

		} else {
			novo.setProximo(anterior.getProximo());
			anterior.setProximo(novo);

		}

	}

	public void remover(int elemento) {

		Nodo anterior = null;
		Nodo n = inicio;

		while (n != null && n.getDado() != elemento) {
			anterior = n;
			n = n.getProximo();

		}

		if (n == null) {

			return;
		}

		if (anterior == null) {
			inicio = n.getProximo();

		} else {

			anterior.setProximo(n.getProximo());

		}

	}

}
