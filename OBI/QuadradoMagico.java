import java.util.Scanner;

// Quadrado mágico (OBI 2022)

public class QuadradoMagico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dimension = sc.nextInt();
        int[][] quadrado = new int[dimension][dimension];

        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                quadrado[i][j] = sc.nextInt();
            }
        }
        System.out.print(search(quadrado));
    }

    private static String search(int[][] quadradoMagico) {
        int linhaF = 0, colunaF = 0;

        // Procurando as coordenadas do número ilegível
        for (int i = 0; i < quadradoMagico.length; i++) {
            for (int j = 0; j < quadradoMagico[i].length; j++) {
                if (quadradoMagico[i][j] == 0) {
                    linhaF = i;
                    colunaF = j;
                }
            }
        }

        int unknownSum = 0, rowS = linhaF-1;
        for (int j = 0; j < quadradoMagico[0].length; j++) {
            unknownSum += quadradoMagico[linhaF][j];
        }
        if (linhaF == 0) {
            rowS = linhaF+1;
        }

        int valorFinal = 0, res;
        for (int j = 0; j < quadradoMagico[0].length; j++) {
            valorFinal += quadradoMagico[rowS][j];
        }
        res = valorFinal - unknownSum;
        return res + "\n" + (linhaF+1) + "\n" + (colunaF+1);
     }
}
