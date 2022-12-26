import java.util.Scanner;

public class Caravana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int camelos = sc.nextInt();
        int[] pesos = new int[camelos];

        for (int i = 0; i < camelos; i++) {
            pesos[i] = sc.nextInt();
        }
        System.out.print(calcularMedia(pesos, camelos));
    }
    private static String calcularMedia(int[] pesos, int qtdCamelos) {
        int pesosAcumulados = 0, media = 0;

        for (int i : pesos) {
            pesosAcumulados += i;
        }
        media = pesosAcumulados / qtdCamelos;
        return balancear(pesos, media);
    }

    private static String balancear(int[] pesos, int media) {
        String result = "";

        for (int peso : pesos) {
            result += media - peso + "\n";
        }
        return result;
    }
}