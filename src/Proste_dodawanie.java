import java.util.*;
import java.lang.*;
public class Proste_dodawanie {
    public static void proste_dodawanie(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] wynik= new int[n];
        int ileLiczb = 0;

        for (int i=1 ; i<=n ; i++) {
            ileLiczb = scan.nextInt();
            int dodane = 0;
            for (int j = 0; j < ileLiczb; j++) {
                dodane += scan.nextInt();
                wynik[i - 1] = dodane;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(wynik[i]);
        }
    }
}
