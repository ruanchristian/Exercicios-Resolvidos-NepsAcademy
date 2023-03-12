import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            numeros.add(sc.nextInt());
        }
        System.out.print(split(numeros));
    }

    private static String split(List<Integer> list) {
        int somaBefore = 0, somaAfter = 0;
        int highValueIndex = list.indexOf(Collections.max(list));

        for (int i = 0; i < highValueIndex; i++) {
            somaBefore += list.get(i);
        }
        for (int i = highValueIndex+1; i < list.size(); i++) {
            somaAfter += list.get(i);
        }

        return somaBefore + "\n" + somaAfter;
    }
}