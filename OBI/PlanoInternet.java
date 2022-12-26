import java.util.Scanner;

public class PlanoInternet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limitMb = sc.nextInt();
        int months = sc.nextInt();
        int[] M_i = new int[months];

        for (int i = 0; i < M_i.length; i++) {
            M_i[i] = sc.nextInt();
        }

        int diff = 0;
        //Salvar o VALOR
        int aux = limitMb;

        for (int i : M_i) {
            if (i <= limitMb) {
                diff = limitMb - i;
            }
            limitMb = aux + diff;
        }
        System.out.print(limitMb);
    }
}
