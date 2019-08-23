import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.*;


public class CzyUmieszPotegowac {

    public static void main(String[] arg) throws java.lang.Exception {
        int[][] cyfry = {{0, 0, 0, 0}, {1, 1, 1, 1}, {2, 4, 8, 6}, {3, 9, 7, 1}, {4, 6, 4, 6}, {5, 5, 5, 5}, {6, 6, 6, 6}, {7, 9, 3, 1}, {8, 4, 2, 6}, {9, 1, 9, 1}};
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(scan.readLine());
        int[] wynik = new int[n];
        for (int i = 0; i < n; i++) {
            int a = 0;
            int b = 0;
            String[] dane = scan.readLine().split(" ");
            a = Integer.valueOf(dane[0]);
            b = Integer.valueOf(dane[1]);
            a = a % 10;
            b = b % 4 - 1;
            if (b<0){
                b=3;
            }
            wynik[i] = cyfry[a][b];
        }
        for (int i : wynik) {
            System.out.println(i);
        }
    }
}


