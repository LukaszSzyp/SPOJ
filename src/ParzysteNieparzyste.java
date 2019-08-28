import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ParzysteNieparzyste {
    public static void main(String[] arg) throws java.lang.Exception {
        BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(bR.readLine());
        String[] wynik = new String[n];
        for (int i = 0; i < n; i++) {
            int iloscLiczb = Integer.valueOf(bR.readLine());
            String parzyste = "";
            String nieparzyste = "";
            String[] dane = bR.readLine().split(" ");
            for (int j = 0; j < dane.length; j++) {
                if (j % 2 != 0) {
                    parzyste += j + " ";
                } else {
                    nieparzyste += j + " ";
                }
            }
            wynik[i]=parzyste + nieparzyste;
        }
        for (String i: wynik) {
            System.out.println(i);
        }
    }
}
