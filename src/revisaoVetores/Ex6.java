package revisaoVetores;

import java.util.Arrays;
import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		int[] num = new int[10];
		int pos, numNovo;
		int tamanho = 5;
		Scanner sc = new Scanner(System.in);
		// Preenchendo 5 posições do vetor

		for (int i = 0; i < tamanho; i++) {
			System.out.println("Digite o " + (i + 1) + "º número: ");
			num[i] = sc.nextInt();
		}
		System.out.println("Digite um novo número: ");
		numNovo = sc.nextInt();

		System.out.println("Digite uma posição: ");
		pos = sc.nextInt();

		for (int i = tamanho - 1; i >= pos; i--) {
			num[i+1] = num[i];

		}
		num[pos] = numNovo;
		tamanho++;
		for (int i = 0;i<tamanho;i++) {
			System.out.println(num[i] + " ");
		}

		sc.close();
	}

}
