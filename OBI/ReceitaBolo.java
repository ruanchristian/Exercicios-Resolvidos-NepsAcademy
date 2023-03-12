import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int minA = 2, minB = 3, minC = 5, bolos;
        
        bolos = (int) Math.floor(Math.min(A / minA, Math.min(B / minB, C / minC)));

        System.out.print(bolos);
    }
}