package revisaoVetores;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		for (int i = 0; i < num.length; i++) {
			System.out.println("Digite o " + (i + 1) + "º número: ");
			num[i] = sc.nextInt();
		}
		System.out.println("Vetor na ordem contrária: ");
		for (int j = num.length - 1; j >= 0; j--) {
			System.out.println(num[j]);
		}
		sc.close();

	}

}
