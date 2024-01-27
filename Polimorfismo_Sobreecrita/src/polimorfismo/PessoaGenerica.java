package polimorfismo;

public class PessoaGenerica {

	private String nome, rg, cpf, endereco;

	
	public String retornaDados() {

		String dados = " ";

		dados += "Nome: " + getNome() + "\n";
		dados += "RG: " + getRg() + "\n";
		dados += "CPF: " + getCpf() + "\n";
		dados += "Endereço: " +getEndereco() + "\n";

		System.out.println("\n");

		return dados;

	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	

}
