package polimorfismo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Quantos alunos deseja cadastar?");
		int tamanho = entrada.nextInt();
		entrada.nextLine();

		Aluno lista[] = new Aluno[tamanho];

		for (int i = 0; i < lista.length; i++) {

			lista[i] = new Aluno();

			System.out.printf("\n Informe os dados do %d aluno: ", i + 1);

			System.out.println("\n");

			System.out.print("Nome: ");
			lista[i].setNome(entrada.nextLine());

			System.out.print("RG: ");
			lista[i].setRg(entrada.nextLine());

			System.out.print("CPF: ");
			lista[i].setCpf(entrada.nextLine());

			System.out.print("Endereço: ");
			lista[i].setEndereco(entrada.nextLine());

			System.out.print("Registro do Aluno: ");
			lista[i].setRegistroAluno(entrada.nextInt());

			System.out.print("Nota do Vestibular: ");
			lista[i].setNotaVestibular(entrada.nextInt());
			entrada.nextLine();

			System.out.print("Curso: ");
			lista[i].setCurso(entrada.nextLine());

			System.out.print("Data de Matricula: ");
			lista[i].setDataMatricula(entrada.nextLine());

		}

		
		for(var aluno: lista) {
			System.out.println(aluno.retornaDados());
		}
		
		entrada.close();
		
	}

}
