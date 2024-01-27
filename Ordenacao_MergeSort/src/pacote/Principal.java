package pacote;

import java.util.Arrays;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o tamanho do vetor: ");
		int tamanho = entrada.nextInt();
		
		int vet[] = new int[tamanho];
		
		for(int i = 0; i < vet.length; i++) {
			vet[i] = (int)  Math.floor(Math.random() * vet.length);
			
		}
		
		int auxiliar[] = new int[vet.length];
		
		System.out.println("Vetor Desordenado: ");
		
		System.out.println(Arrays.toString(vet));
		
		MergeSort merge = new MergeSort();
		
		merge.mergeSort(vet, auxiliar, 0, vet.length -1);
		
		
		System.out.println("Vetor ordenado:");
		
		System.out.println(Arrays.toString(vet));
		
		
		entrada.close();
		
	}
	
	
	
}
