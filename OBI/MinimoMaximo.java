import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// Minimo e Máximo (OBI 2021)

public class MinimoMaximo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int X = sc.nextInt();
        int Z = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = X; i <= Z; i++) {
            if(somaAlgarismos(i) == S) {
                list.add(i);
            }
        }
        System.out.println(Collections.min(list));
        System.out.print(Collections.max(list));
    }

    private static int somaAlgarismos(int n) {
        int soma = 0;
        while (n > 0) {
            soma += n % 10;
            n = n / 10;
        }
        return soma;
    }
}
