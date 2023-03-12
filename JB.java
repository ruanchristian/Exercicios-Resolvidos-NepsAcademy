import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double medidaX = sc.nextDouble();
		String unidadeX = sc.next();
		double medidaY = sc.nextDouble();
		String unidadeY = sc.next();
		
		String result = "";
		
		if ((unidadeX.equals("m/s2") && unidadeY.equals("m/s")) ||
		    unidadeY.equals("m/s2") && unidadeX.equals("m/s")) {
		    result = String.format("%.2f", (medidaY / medidaX)) + " s";
		} else if ((unidadeX.equals("s") && unidadeY.equals("m/s")) ||
		            unidadeY.equals("s") && unidadeX.equals("m/s")) {
		    result = String.format("%.2f", (medidaY / medidaX)) + " m/s2";
		} else if ((unidadeX.equals("s") && unidadeY.equals("m/s2")) ||
		            unidadeY.equals("s") && unidadeX.equals("m/s2")) {
		    result = String.format("%.2f", (medidaY * medidaX)) + " m/s";
		}
		System.out.print(result);
	}
}