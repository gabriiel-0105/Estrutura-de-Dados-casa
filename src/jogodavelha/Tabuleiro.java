package jogodavelha;

public class Tabuleiro {

    private char[][] tabuleiro;

    public Tabuleiro() {

        tabuleiro = new char[3][3];

        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                tabuleiro[i][j] = ' ';
            }
        }

    }

    public void mostrar() {

        System.out.println();

        for (int i = 0; i < tabuleiro.length; i++) {

            for (int j = 0; j < tabuleiro[i].length; j++) {

                System.out.print(" " + tabuleiro[i][j] + " ");

                if (j < 2)
                    System.out.print("|");

            }

            System.out.println();

            if (i < 2)
                System.out.println("---+---+---");

        }

        System.out.println();

    }

    public boolean jogar(int linha, int coluna, char simbolo) {

        if (tabuleiro[linha][coluna] == ' ') {

            tabuleiro[linha][coluna] = simbolo;
            return true;

        }

        return false;

    }

    public boolean venceu(char s) {

        for (int i = 0; i < 3; i++) {

            if (tabuleiro[i][0] == s &&
                tabuleiro[i][1] == s &&
                tabuleiro[i][2] == s)
                return true;

        }

        for (int j = 0; j < 3; j++) {

            if (tabuleiro[0][j] == s &&
                tabuleiro[1][j] == s &&
                tabuleiro[2][j] == s)
                return true;

        }

        if (tabuleiro[0][0] == s &&
            tabuleiro[1][1] == s &&
            tabuleiro[2][2] == s)
            return true;

        if (tabuleiro[0][2] == s &&
            tabuleiro[1][1] == s &&
            tabuleiro[2][0] == s)
            return true;

        return false;

    }

    public boolean cheio() {

        for (int i = 0; i < tabuleiro.length; i++) {

            for (int j = 0; j < tabuleiro[i].length; j++) {

                if (tabuleiro[i][j] == ' ')
                    return false;

            }

        }

        return true;

    }

}
