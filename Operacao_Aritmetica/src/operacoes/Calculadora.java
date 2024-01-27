package operacoes;

import java.util.Scanner;

public class Calculadora {

	Scanner entrada = new Scanner(System.in);

	private double num1;
	private double num2;

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	double soma() {

		return num1 + num2;
	}

	double subtracao() {

		return num1 - num2;
	}

	double multiplicacao() {

		return num1 * num2;
	}

	double divisao() {

		if (num2 != 0) {
			setNum2(num2);

		}

		while (num2 == 0) {

			System.out.println("Não existe numero divisivel por zero");

			System.out.println("Digite outro numero: ");
			num2 = entrada.nextDouble();

			setNum2(num2);
		}

		return num1 / num2;

	}

}
