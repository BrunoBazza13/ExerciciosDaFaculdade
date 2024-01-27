package polimorfismo;

public class Aluno extends PessoaGenerica {

	private int registroAluno;
	private float notaVestibular;
	private String curso, dataMatricula;

//	public Aluno(String nome, String rg, String cpf, int registroAluno, float notaVestibular, String curso, String dataMatricula) {
//
//		this.nome = nome;
//		this.rg = rg;
//		this.cpf = cpf;
//		this.
//
//	}

	public int getRegistroAluno() {
		return registroAluno;
	}

	public void setRegistroAluno(int registroAluno) {
		this.registroAluno = registroAluno;
	}

	public float getNotaVestibular() {
		return notaVestibular;
	}

	public void setNotaVestibular(float notaVestibular) {
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

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	@Override
	public String retornaDados() {

		String dados;

		dados = super.retornaDados();

		dados += "RA: " + registroAluno + "\n";
		dados += "Nota do Vestibular: " + notaVestibular + "\n";
		dados += "Curso: " + curso + "\n";
		dados += "Data Matricula: " + dataMatricula + "\n";

		return dados;

	}

}
