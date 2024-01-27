package classe_abstrata;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		Aluno aluno = new Aluno();
		
		
		
		System.out.println("Digite os dados dos alunos");
		
		System.out.print("Nome: ");
		aluno.setNome(entrada.nextLine());
		
		System.out.print("Rg: ");
		aluno.setRg(entrada.nextLine());
		
		System.out.print("Cpf: ");
		aluno.setCpf(entrada.nextLine());
		
		
		System.out.print("Endereço: ");
		aluno.setEndereco(entrada.nextLine());

		System.out.print("Registro do Aluno: ");
		aluno.setRegistroAluno(entrada.nextInt());

		System.out.print("Nota do Vestibular: ");
		aluno.setNotaVestibular(entrada.nextInt());
		entrada.nextLine();

		System.out.print("Curso: ");
		aluno.setCurso(entrada.nextLine());

		System.out.print("Data de Matricula: ");
		aluno.setDadaMatricula(entrada.nextLine());
		
		
		System.out.println("\t - Dados do aluno " + aluno.getNome() + " - \n");
		System.out.println(aluno.retornaDados());
		
		entrada.close();
	}

}
