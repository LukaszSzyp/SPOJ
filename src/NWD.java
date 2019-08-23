import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.*;

public class NWD {
    public static void main(String[] arg) throws java.lang.Exception {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int iloscOperacji = Integer.valueOf(scan.readLine());
        int[] wynik = new int[iloscOperacji];
        for (int i = 0; i < iloscOperacji; i++) {
            int a = 0;
            int b = 0;
            String[] dane = scan.readLine().split(" ");
            a = Integer.valueOf(dane[0]);
            b = Integer.valueOf(dane[1]);
            int reszta = a % b;
            wynik[i] = b;
            while (reszta != 0) {
                wynik[i] = reszta;
                reszta = b % reszta;
            }
        }
        for (int i : wynik) {
            System.out.println(i);
        }
    }
}
