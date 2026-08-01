package matrizes;

import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {

		int[][] mat = new int[3][3];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				System.out.println("Digite um valor: ");
				mat[i][j] = sc.nextInt();

			}
		}

		System.out.println("Matriz: ");

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.printf("%4d", mat[i][j]);

			}
			System.out.println();
		}
		sc.close();

	}

}
