import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Podzielnosc {
    public static void main(String[] arg) throws java.lang.Exception {
        BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(bR.readLine());
        String[] wynik = new String[n];
        for (int i = 0; i < n; i++) {
            wynik[i]="";
            String[] dane = bR.readLine().split(" ");
            for (int j = 0; j < Integer.valueOf(dane[0]); j++) {
                if (j % Integer.valueOf(dane[1]) == 0) {
                    if (j % Integer.valueOf(dane[2]) != 0) {
                        wynik[i] += j + " ";
                    }
                }
            }
        }
        for (String i : wynik) {
            System.out.println(i);
        }
    }
}
