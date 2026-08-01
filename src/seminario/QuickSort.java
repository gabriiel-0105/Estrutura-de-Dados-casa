package seminario;
import java.util.Scanner;

public class QuickSort {

    public static void quickSort(int[] numeros, int inicio, int fim) {

        if (inicio < fim) {

            int pivo = separar(numeros, inicio, fim);

            quickSort(numeros, inicio, pivo - 1);
            quickSort(numeros, pivo + 1, fim);
        }
    }

    public static int separar(int[] numeros, int inicio, int fim) {

        int pivo = numeros[fim];
        int i = inicio;

        for (int j = inicio; j < fim; j++) {

            if (numeros[j] < pivo) {

                int temp = numeros[i];
                numeros[i] = numeros[j];
                numeros[j] = temp;

                i++;
            }
        }

        int temp = numeros[i];
        numeros[i] = numeros[fim];
        numeros[fim] = temp;

        return i;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números deseja inserir? ");
        int quantidade = scanner.nextInt();

        int[] numeros = new int[quantidade];

        for (int i = 0; i < quantidade; i++) {

            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        quickSort(numeros, 0, numeros.length - 1);

        System.out.println("\nNúmeros em ordem crescente:");

        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        scanner.close();
    }

}