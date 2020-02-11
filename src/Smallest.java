import java.util.Arrays;
import java.util.Scanner;

public class Smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            sc.nextLine();
            String s = sc.nextLine();
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String str = new String(ch);
            if (str.compareTo(s) < 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}