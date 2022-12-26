import java.util.Scanner;

// Hotel => (OBI 2022)

public class Hotel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int A = sc.nextInt();
        int N = sc.nextInt();
        int dFinal, cDia = N-1;

        if (N == 1) {
            dFinal = 31 * D;
            System.out.print(dFinal);
            return;
        }

        if (N >= 16) cDia = 14;

        dFinal = (31-N+1) * (D+cDia*A);
        System.out.print(dFinal);
    }
}