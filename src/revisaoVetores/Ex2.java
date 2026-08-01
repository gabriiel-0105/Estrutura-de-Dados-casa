package revisaoVetores;

import java.util.Scanner;
import java.util.Arrays;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		int soma = 0;
		for (int i = 0; i < num.length; i++) {
			System.out.println("Digite o " + (i + 1) + "º número: ");
			num[i] = sc.nextInt();
		}
		for (int j = 0; j < num.length; j++) {
			soma = soma + num[j];
		}
		System.out.println("Os elementos digitados foram: " + Arrays.toString(num));
		System.out.println("A soma dos números do vetor é " + soma + ".");
		sc.close();

	}

}
