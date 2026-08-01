package seminario;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Quantos números deseja inserir? ");
	        int quantidade = scanner.nextInt();

	        int[] numeros = new int[quantidade];

	        for (int i = 0; i < quantidade; i++) {

	            System.out.print("Digite o número " + (i + 1) + ": ");
	            numeros[i] = scanner.nextInt();
	        }

	        for (int i = 0; i < numeros.length - 1; i++) {

	            for (int j = 0; j < numeros.length - 1 - i; j++) {

	                if (numeros[j] > numeros[j + 1]) {

	                    int temp = numeros[j];
	                    numeros[j] = numeros[j + 1];
	                    numeros[j + 1] = temp;
	                }
	            }
	        }

	        System.out.println("\nNúmeros em ordem crescente:");

	        for (int numero : numeros) {
	            System.out.print(numero + " ");
	        }

	        scanner.close();
	    }

	}
