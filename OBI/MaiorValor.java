import java.util.*;

// Maior Valor => (OBI 2022)

public class MaiorValor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int begin = in.nextInt();
        int end = in.nextInt();
        int soma = in.nextInt();

        System.out.print(highValueEqualsSum(begin, end, soma));
    }

    private static int highValueEqualsSum(int x, int y, int result) {
        List<Integer> list = new ArrayList<>();
        for (int i = x; i <= y; i++) {
            list.add(i);
        }

        List<Integer> highValues = new LinkedList<>();
        int sum;

        for (Integer i : list) {
            sum = sumAlg(i);
            if (sum == result) {
                highValues.add(i);
            } else {
                highValues.add(-1);
            }
        }
        return Collections.max(highValues);
    }

    private static int sumAlg(int num) {
        int unidade = num % 10;
        num /= 10;
        int dezena = num % 10;
        num /= 10;
        int centena = num % 10;
        num /= 10;
        int milhar = num;

        return milhar + centena + dezena + unidade;
    }
}
