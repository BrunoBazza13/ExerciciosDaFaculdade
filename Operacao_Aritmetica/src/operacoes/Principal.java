package operacoes;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		Calculadora calcula = new Calculadora();

		System.out.println("Insira o 1 valor");
		double num = entrada.nextDouble();

		System.out.println("Insira o 2 valor");
		double num2 = entrada.nextDouble();

		calcula.setNum1(num);
		//calcula.setNum2(num2);

		calcula.setNum2(num2);

		System.out.println(calcula.multiplicacao());
		System.out.println(calcula.soma());
		System.out.println(calcula.subtracao());
		System.out.println(calcula.divisao());
		
		entrada.close();
	}

}
