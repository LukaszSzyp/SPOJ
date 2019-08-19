import java.util.*;
import java.lang.*;

public class ZabawneDodawaniePiotrusia {
    public static void zabawneDodawaniePiotrusia() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] wynik = new int[n][2];
        int ileOperacji = 0;
        for (int i = 0; i < n; i++) {
            wynik[i][0] = scan.nextInt();
            boolean spelnia = false;
            ileOperacji = 0;
            while (!spelnia) {
                String s1 = "" + wynik[i][0];
                String s2 = "";
                for (int j = s1.length() - 1; j >= 0; j--) {
                    s2 += s1.charAt(j);
                }
                if (s1.equals(s2)) {
                    wynik[i][1] = ileOperacji;
                    spelnia = true;
                } else {
                    wynik[i][0] = Integer.valueOf(s1) + Integer.valueOf(s2);
                    ileOperacji++;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(wynik[i][0] + " " + wynik[i][1]);
        }
    }
}
