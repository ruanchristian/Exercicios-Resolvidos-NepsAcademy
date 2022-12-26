import java.util.Scanner;

// Calculo Rápido (OBI 2021)

public class CalculoRapido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int res = 0;
        for(int i = a; i <= b; i++) {
            if(somarAlgarismos(i) == s) {
                res++;
            }
        }
        System.out.print(res);
    }
    private static int somarAlgarismos(int n) {
       int soma = 0;
       while (n > 0) {
           soma += n % 10;
           n = n / 10;
       }
       return soma;
    }
}
