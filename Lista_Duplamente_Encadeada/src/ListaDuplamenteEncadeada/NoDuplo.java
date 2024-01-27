package ListaDuplamenteEncadeada;


public class NoDuplo {

	private int conteudo;
	private NoDuplo noProximo;
	private NoDuplo noPrevio;
	
	public NoDuplo(int conteudo, NoDuplo noProximo, NoDuplo noPrevio) {
		
		this.conteudo = conteudo;
		this.noProximo = noProximo;
		this.noPrevio = noPrevio;
		
	}
	
	public NoDuplo(int conteudo) {
		
		this.conteudo = conteudo;
	}
	
	
	public int getConteudo() {
		return conteudo;
	}
	public void setConteudo(int conteudo) {
		this.conteudo = conteudo;
	}
	public NoDuplo getNoProximo() {
		return noProximo;
	}
	public void setNoProximo(NoDuplo noProximo) {
		this.noProximo = noProximo;
	}
	public NoDuplo getNoPrevio() {
		return noPrevio;
	}
	public void setNoPrevio(NoDuplo noPrevio) {
		this.noPrevio = noPrevio;
	}
	
	
	
	
	
}
