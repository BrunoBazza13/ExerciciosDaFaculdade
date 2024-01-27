package ListaDuplamenteEncadeada;

public class ListaDupla {

	private NoDuplo inicio; // primeiro elemento da lista
	private NoDuplo ultimo;
	
	
	private int tamanhoLista = 0;

	
	
	
	
	
	
	
	public int obterTamanho() {

		return this.tamanhoLista;

	}

	public NoDuplo getNo(int indice) { // obtem o no apartir do indice informado

		NoDuplo noAuxiliar = inicio;

		for (int i = 0; (i < indice) && (noAuxiliar != null); i++) { // verifica se i é menor q o indice e se auxiliar é
																		// diferente de vazio

			noAuxiliar = noAuxiliar.getNoProximo(); // pega o proximo valor depois de auxiliar

		}

		return noAuxiliar; // retorna o valor encontrado
	}

	public int obterElemnto(int indice) {

		return this.getNo(indice).getConteudo(); // retorna o conteudo de dentro do indice

	}

	public void adicionarFinal(int elemento) {
		
		NoDuplo novoNo = new NoDuplo(elemento);
		
		novoNo.setNoProximo(null); // ultimo aponta para null
		novoNo.setNoPrevio(ultimo); // anterior passa a ser o ultimo
		
		if(inicio == null) {// se a lista estiver vazia inicio passa a ser o  primeiro elemento
			inicio = novoNo; 
			
		}
		
		if(ultimo != null) { // se alista nao estiver vazia no ultimo elemento adiciona o proximo sendo o novo ultimo
			ultimo.setNoProximo(novoNo);
			
		}
		
		ultimo = novoNo; 
		tamanhoLista++; //soma o tamanho da lista
		
		
		
	}
	
	public void adicionarElemento(int indice, int elemento) { //adiciona elemento com base no indice
		
		NoDuplo noAuxiliar = getNo(indice);  // obtem o no apartir do indice informado
		NoDuplo novoNo = new NoDuplo(elemento); //  add elemento pelo construtor
		novoNo.setNoProximo(noAuxiliar);  // novo elemento aponta para o auxiliar
		
		
		if(novoNo.getNoProximo() != null) {
			
			novoNo.setNoPrevio(noAuxiliar.getNoPrevio()); //seta no anterior 
		}
		
		
	}
	
	
	
}
