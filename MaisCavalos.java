import java.util.Scanner;

//Dado a posição inicial de um cavalo em um tabuleiro de xadrez e a posição destino
//Seu programa deve dizer se, com exatamente um único movimento, o cavalo consegue alcançar a posição destino. 

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inicial = scanner.next();
        String finalD = scanner.next();

        int linhaInicial = 8 - Character.getNumericValue(inicial.charAt(1));
        int colunaInicial = inicial.charAt(0) - 'a';
        int linhaFinal = 8 - Character.getNumericValue(finalD.charAt(1));
        int colunaFinal = finalD.charAt(0) - 'a';

        if (Math.abs(linhaInicial - linhaFinal) == 2 && Math.abs(colunaInicial - colunaFinal) == 1 ||
            Math.abs(linhaInicial - linhaFinal) == 1 && Math.abs(colunaInicial - colunaFinal) == 2) {
            System.out.print("VALIDO");
        } else {
            System.out.print("INVALIDO");
        }
    }
}