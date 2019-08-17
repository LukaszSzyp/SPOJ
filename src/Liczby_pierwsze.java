import java.util.*;
import java.lang.*;
public class Liczby_pierwsze {
    public static void Liczby_pierwsze() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] liczby = new int[n];
        for (int i = 0; i < n; i++) {
            liczby[i] = scan.nextInt();
        }
        for (int j = 0; j < n; j++) {
            boolean pierwsza = true;
            for (int i = 2; i < liczby[j]; i++) {
                if (liczby[j] % i == 0) {
                    pierwsza = false;
                }
            }
            if (liczby[j] == 1) {
                pierwsza = false;
            }
            if (pierwsza) {
                System.out.println("TAK");
            } else {
                System.out.println("NIE");
            }
        }
    }
}