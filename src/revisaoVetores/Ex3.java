package revisaoVetores;

import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		for (int i = 0; i < num.length; i++) {
			System.out.println("Digite o " + (i + 1) + "º número: ");
			num[i] = sc.nextInt();
		}
		Arrays.sort(num);
		System.out.println("O maior número digitado é: " + num[4]);

		sc.close();
	}

}
