package revisaoVetores;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[6];
		int numExtra,posicao=0;
		boolean existe = false;
		for (int i = 0; i < num.length; i++) {
			System.out.println("Digite o " + (i + 1) + "º número: ");
			num[i] = sc.nextInt();
		}
		System.out.println("Digite o número que você deseja buscar: ");
		numExtra = sc.nextInt();
		for (int i = 0; i < num.length; i++) {
			if (num[i] == numExtra) {
				existe = true;
				posicao=i;
				break;
			}

		}
		if (existe) {
			System.out.println("O número existe no vetor no índice " + (posicao) + ", posição " + (posicao+1) + ".");
		}else {
			System.out.println("O número não existe no vetor.");
		}
		sc.close();

	}

}