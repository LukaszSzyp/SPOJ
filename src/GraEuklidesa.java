package Testy.src;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GraEuklidesa {
    public static void main(String[] arg) throws java.lang.Exception {
        BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(bR.readLine());
        int[] wynik = new int[n];
        int a = 0;
        int b = 0;
        int i = 0;

        for (int j = 0; j < n; j++) {
            String[] dane = bR.readLine().split(" ");
            a = Integer.valueOf(dane[0]);
            b = Integer.valueOf(dane[1]);
            while (a != b) {
                if (a > b) {
                    a = a - b;
                }
                if (a < b) {
                    b = b - a;
                }
            }
            wynik[i] = a + b;
            i++;
        }
        for (int z: wynik) {
            System.out.println(z);
        }
    }
}
