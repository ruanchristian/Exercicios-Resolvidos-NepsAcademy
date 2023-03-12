import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        String s = sc.next();

        for (int i = 0; i < N; i++) {
            if (s.charAt(i) == 'C') {
                X--;
            } else if (s.charAt(i) == 'B') {
                X++;
            } else if (s.charAt(i) == 'D') {
                Y++;
            } else if (s.charAt(i) == 'E'){
                Y--;
            }
        }
        System.out.print(X + " "+ Y);
    }
}