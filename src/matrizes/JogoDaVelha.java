package matrizes;
import java.util.Scanner;

public class JogoDaVelha {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[][] tabuleiro = new char[3][3];

        // Preenche o tabuleiro com espaços
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                tabuleiro[i][j] = ' ';
            }
        }

        char jogador = 'X';
        int jogadas = 0;
        boolean venceu = false;

        while (!venceu && jogadas < 9) {

            // Exibe o tabuleiro
            System.out.println();
            System.out.println("    0   1   2");

            for (int i = 0; i < tabuleiro.length; i++) {

                System.out.print(i + " ");

                for (int j = 0; j < tabuleiro[i].length; j++) {

                    System.out.print(" " + tabuleiro[i][j] + " ");

                    if (j < 2)
                        System.out.print("|");

                }

                System.out.println();

                if (i < 2)
                    System.out.println("   ---+---+---");

            }

            System.out.println();
            System.out.println("Jogador " + jogador);

            System.out.print("Linha: ");
            int linha = sc.nextInt();

            System.out.print("Coluna: ");
            int coluna = sc.nextInt();

            // Validação
            if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2) {

                System.out.println("Posição inválida!");
                continue;

            }

            if (tabuleiro[linha][coluna] != ' ') {

                System.out.println("Essa posição já está ocupada!");
                continue;

            }

            // Faz a jogada
            tabuleiro[linha][coluna] = jogador;

            jogadas++;

            // Verifica linhas
            for (int i = 0; i < 3; i++) {

                if (tabuleiro[i][0] == jogador &&
                    tabuleiro[i][1] == jogador &&
                    tabuleiro[i][2] == jogador) {

                    venceu = true;

                }

            }

            // Verifica colunas
            for (int j = 0; j < 3; j++) {

                if (tabuleiro[0][j] == jogador &&
                    tabuleiro[1][j] == jogador &&
                    tabuleiro[2][j] == jogador) {

                    venceu = true;

                }

            }

            // Diagonal principal
            if (tabuleiro[0][0] == jogador &&
                tabuleiro[1][1] == jogador &&
                tabuleiro[2][2] == jogador) {

                venceu = true;

            }

            // Diagonal secundária
            if (tabuleiro[0][2] == jogador &&
                tabuleiro[1][1] == jogador &&
                tabuleiro[2][0] == jogador) {

                venceu = true;

            }

            // Troca o jogador
            if (!venceu) {

                if (jogador == 'X')
                    jogador = 'O';
                else
                    jogador = 'X';

            }

        }

        // Mostra o tabuleiro final
        System.out.println();
        System.out.println("    0   1   2");

        for (int i = 0; i < tabuleiro.length; i++) {

            System.out.print(i + " ");

            for (int j = 0; j < tabuleiro[i].length; j++) {

                System.out.print(" " + tabuleiro[i][j] + " ");

                if (j < 2)
                    System.out.print("|");

            }

            System.out.println();

            if (i < 2)
                System.out.println("   ---+---+---");

        }

        System.out.println();

        if (venceu) {
            System.out.println("Parabéns! O jogador " + jogador + " venceu!");
        } else {
            System.out.println("Empate!");
        }

        sc.close();

    }

}