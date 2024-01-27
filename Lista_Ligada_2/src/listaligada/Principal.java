package listaligada;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		Lista lista = new Lista();

		int i = 0;
		int op = 0;
		int tamanho = 0;

		lista.geraLista();

		String valor = "";

		while (!valor.equalsIgnoreCase("2")) {

			System.out.println("-- Menu -- \n");
			System.out.println("1- Inserir dados");
			System.out.println("2- Listar dados");
			System.out.println("3- Buscar dados");
			System.out.println("4- Remover dados");
			System.out.println("5- Tamanho da lista");

			op = entrada.nextInt();
			switch (op) {

			case 1:

				System.out.println("\n Quantos nomes deseja inserir?");
				 tamanho = entrada.nextInt();
				entrada.nextLine();

				for (i = 0; i < tamanho; i++) {
					System.out.printf("Insira o %d numero: ", i + 1);
					int num = entrada.nextInt();

					lista.adiciona(num);

				}

				break;

			case 2:

				System.out.println("Imprime dados");
				lista.imprimeLista();
				break;

				
			case 3:
				
				System.out.println("Buscar dados");
				
				break;
				
			case 4:
				
				System.out.println("remover dados");
				

				for (i = 0; i < tamanho; i++) {
					System.out.printf("Insira o %d numero: ", i + 1);
					int num = entrada.nextInt();

					lista.adiciona(num);

				}
				
				
				
				
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
