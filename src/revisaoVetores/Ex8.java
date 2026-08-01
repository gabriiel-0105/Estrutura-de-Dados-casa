package revisaoVetores;

import java.util.Arrays;
import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int procura;
		boolean achou = false;
		int[] num = new int[6];
		for (int i = 0; i < num.length; i++) {
			System.out.println("Digite o " + (i + 1) + "º número: ");
			num[i] = sc.nextInt();
		}

		System.out.println("Digite o número que deseja procurar: ");
		procura = sc.nextInt();
		System.out.println("Digite o novo valor: ");
		int novo = sc.nextInt();

		for (int i = 0; i < num.length; i++) {
			if (procura == num[i]) {
				num[i] = novo;
				achou = true;
				break;
			}
		}
		if (achou) {
			System.out.println("Número encontrado e alterado");
		} else {
			System.out.println("Número não encontrado.");
		}

		System.out.println(Arrays.toString(num));

		sc.close();

	}

}
