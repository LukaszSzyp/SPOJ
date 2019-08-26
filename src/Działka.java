import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Działka {
    public static void main(String[] arg) throws java.lang.Exception {
        BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(bR.readLine());
        int[] wynik = new int[n];
        for (int i = 0; i <n ; i++) {
            int steps = Integer.valueOf(bR.readLine());
            wynik[i]=steps*steps;
        }
        for (int i: wynik) {
            System.out.println(i);
        }
    }
}
