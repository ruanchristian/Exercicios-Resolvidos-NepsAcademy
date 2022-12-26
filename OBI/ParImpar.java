import java.util.Scanner;

//Par ou ímpar OBI 2004   

public class ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        String jogador1, jogador2;
        int A, B, x = 1;

        do {
            N = Integer.parseInt(sc.next());

            jogador1 = sc.next();
            jogador2 = sc.next();
            System.out.println("Teste "+x);
            for (int i = 1; i <= N; i++) {
                A = Integer.parseInt(sc.next());
                B = Integer.parseInt(sc.next());
                if ((A + B) % 2 == 0) {
                    System.out.println(jogador1);
                } else {
                    System.out.println(jogador2);
                }
            }
            System.out.println();
            x++;
        } while (N != 0);
    }
}