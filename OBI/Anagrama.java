import java.util.Scanner;
import java.util.Arrays;

public class Anagrama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        boolean isAnagram = isAnagram(str1, str2);
        System.out.print((isAnagram) ? "S" : "N");
    }

    private static boolean isAnagram(String str1, String str2) {
        String s1 = str1.replaceAll("[.,]*[\\s]*", "");
        String s2 = str2.replaceAll("[.,]*[\\s]*", "");
        if (s1.length() != s2.length()) return false;

        char[] chars1 = s1.toLowerCase().toCharArray();
        char[] chars2 = s2.toLowerCase().toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        return Arrays.equals(chars1, chars2);
    }
}
