package pacote;

public class MergeSort {

	void mergeSort(int vet[], int auxiliar[], int inicio, int fim) {

		if (inicio < fim) {

			int meio = (inicio + fim) / 2;

			mergeSort(vet, auxiliar, inicio, meio);
			mergeSort(vet, auxiliar, meio + 1, fim);

			parciona(vet, auxiliar, inicio, meio, fim);

		}

	}

	void parciona(int vet[], int auxiliar[], int inicio, int meio, int fim) {

		for (int i = inicio; i <= fim; i++) {
			auxiliar[i] = vet[i];

		}

		int esq = inicio;
		int dir = meio + 1;

		for (int i = inicio; i <= fim; i++) {

			if (esq > meio) {
				vet[i] = auxiliar[dir++];

			} else if (dir > fim) {
				vet[i] = auxiliar[esq++];

			} else if (auxiliar[esq] < auxiliar[dir]) {
				vet[i] = auxiliar[esq++];

			} else {
				vet[i] = auxiliar[dir++];
			}

		}

	}

}
