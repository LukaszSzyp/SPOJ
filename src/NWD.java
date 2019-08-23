import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.*;

public class NWD {
    public static int nwd ( int a, int b){
        int reszta;
        while (b != 0) {
            reszta = a % b;
            a = b;
            b = reszta;
        }
        return a;
    }
    public static void main(String[] arg) throws java.lang.Exception {
    BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.valueOf(bR.readLine());
    int[] wynik = new int[n];
        for (int i = 0; i <n ; i++) {
            String[] dane = bR.readLine().split(" ");
            wynik[i]=nwd(Integer.valueOf(dane[0]),Integer.valueOf(dane[1]));
        }
        for (int i: wynik) {
            System.out.println(i);
        }
    }



}
