package jogodavelha;

import java.util.Scanner;

public class Jogo {

    private Tabuleiro tabuleiro;
    private Jogador jogador1;
    private Jogador jogador2;

    public Jogo() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do jogador X: ");
        String nome1 = sc.nextLine();

        System.out.print("Nome do jogador O: ");
        String nome2 = sc.nextLine();

        jogador1 = new Jogador(nome1, 'X');
        jogador2 = new Jogador(nome2, 'O');

        tabuleiro = new Tabuleiro();

        Jogador atual = jogador1;

        while (true) {

            tabuleiro.mostrar();

            System.out.println(atual.getNome() + " (" + atual.getSimbolo() + ")");

            System.out.print("Linha: ");
            int linha = sc.nextInt();

            System.out.print("Coluna: ");
            int coluna = sc.nextInt();

            if (!tabuleiro.jogar(linha, coluna, atual.getSimbolo())) {

                System.out.println("Posição ocupada!");
                continue;

            }

            if (tabuleiro.venceu(atual.getSimbolo())) {

                tabuleiro.mostrar();
                System.out.println(atual.getNome() + " venceu!");
                break;

            }

            if (tabuleiro.cheio()) {

                tabuleiro.mostrar();
                System.out.println("Empate!");
                break;

            }

            atual = (atual == jogador1) ? jogador2 : jogador1;

        }

        sc.close();

    }

}
