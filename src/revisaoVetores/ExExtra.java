package revisaoVetores;

import java.util.Scanner;

public class ExExtra {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		int soma = 0;

		for (int i = 0; i < num.length; i++) {
			System.out.println("Digite o " + (i + 1) + "º número: ");
			num[i] = sc.nextInt();
		}

		int maior = num[0];
		int menor = num[0];

		for (int i = 0; i < num.length; i++) {
			soma = soma + num[i];

			if (num[i] > maior) {
				maior = num[i];
			}
			if (num[i] < menor) {
				menor = num[i];
			}
		}

		System.out.println("O maior número digitado foi " + maior + " e o menor número digitado foi " + menor + ".");

		double media = (double) soma / num.length;
		System.out.println("A média dos valores é " + media + ".");

		sc.close();
	}
}
