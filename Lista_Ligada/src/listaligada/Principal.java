package listaligada;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		Lista lista = new Lista();

		int i = 0;
		int op = 0;

		lista.geraLista();

		String valor = "";

		while (!valor.equalsIgnoreCase("2")) {

			System.out.println("-- Menu -- \n");
			System.out.println("1- Inserir dados");
			System.out.println("2- Listar dados");

			op = entrada.nextInt();
			switch (op) {

			case 1:

				System.out.println("\n Quantos nomes deseja inserir?");
				int tamanho = entrada.nextInt();
				entrada.nextLine();

				for (i = 0; i < tamanho; i++) {
					System.out.printf("Insira o %d nome: ", i + 1);
					String nome = entrada.nextLine();

					lista.adiciona(nome);

				}

				break;

			case 2:

				System.out.println("Imprime dados");
				lista.imprimeLista();
				break;

			default:
				System.out.println("Numero invaliod");

			}

			
			System.out.println("\n Deseja continuar?");
			System.out.println("1- sim");
			System.out.println("2- não \n");
			valor = entrada.nextLine();

		}

		System.out.println("Imprime dados");
		lista.imprimeLista();

		
	}


}
