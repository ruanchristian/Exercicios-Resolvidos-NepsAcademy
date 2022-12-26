import java.util.Scanner;

// Quadrado Mágico (OBI 2011)

public class QMagico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] matriz = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = Integer.parseInt(sc.next());
            }
        }
        int isMagic = somaDiagonalMain(matriz, N);
        System.out.print(isMagic);
    }

    private static int somaDiagonalMain(int[][] matriz, int N) {
        int soma = 0, res = 1;

        for (int i = 0; i < N; i++) {
            soma += matriz[i][i];
        }
        return somaDiagonalSec(matriz, res, soma, N);
    }

    private static int somaDiagonalSec(int[][] matriz, int res, int soma, int N) {
        int aux = 0;

        for (int i = 0; i < N; i++) {
            aux += matriz[i][N-i-1];
        }
        if (aux == soma) res++;
        return somaLinhas(matriz, aux, res, N);
    }

    private static int somaLinhas(int[][] matriz, int soma, int res, int N) {
        int aux = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                aux += matriz[i][j];
            }
            if (aux == soma && i < (N-1)) aux = 0;
        }
        if (aux == soma) res++;
        return somaColunas(matriz, aux, res, N);
    }

    private static int somaColunas(int[][] matriz, int soma, int res, int N) {
        int aux = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                aux += matriz[j][i];
            }
            if (aux == soma && i < (N-1)) aux = 0;
        }
        if(aux == soma) res++;
        if(res == 4) {
            return soma;
        }
        return 0;
    }
}