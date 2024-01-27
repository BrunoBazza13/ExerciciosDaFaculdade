package classe_abstrata;

public class Aluno extends Pessoa {

	private int registroAluno;
	private double notaVestibular;
	private String curso, dataMatricula;

	@Override
	public String retornaDados() {

		String dados = "";

		dados += "Nome: " + getNome() + "\n";
		dados += "Rg: " + getRg() + "\n";
		dados += "cpf: " + getCpf() + "\n";
		dados += "Registro do Aluno: " + getRegistroAluno() + "\n";
		dados += "Nota do Vestibular: " + getNotaVestibular() + "\n";
		dados += "Curso: " + getCurso() + "\n";
		dados += "Data da Matricula: " + getDataMatricula() + "\n";
		dados += "\n";
		

		return dados;

	}

	public int getRegistroAluno() {
		return registroAluno;
	}

	public void setRegistroAluno(int registroAluno) {
		this.registroAluno = registroAluno;
	}

	public double getNotaVestibular() {
		return notaVestibular;
	}

	public void setNotaVestibular(double notaVestibular) {
		this.notaVestibular = notaVestibular;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDadaMatricula(String dadaEmissao) {
		this.dataMatricula = dadaEmissao;
	}

}
