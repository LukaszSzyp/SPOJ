import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.*;

public class PredkoscSrednia {
    public static void main(String[] arg) throws java.lang.Exception {
        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(bReader.readLine());
        int[] liczby = new int[n];
        for (int i = 0; i < n ; i++) {
            int a =0;
            int b =0;
            String[] dane = bReader.readLine().split(" ");
            a = Integer.valueOf(dane[0]);
            b = Integer.valueOf(dane[1]);
            liczby[i] = ((2 * a * b) / (a + b));
        }
        for (int i:liczby) {
            System.out.println(i);
        }
    }
}
