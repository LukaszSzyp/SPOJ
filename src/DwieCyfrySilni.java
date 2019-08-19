import java.util.Scanner;

public class DwieCyfrySilni {
    public static void dwieCyfrySilni() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] liczby = new int[n];
        for (int i = 0; i < n; i++) {
            liczby[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if ((liczby[i] > 1) && (liczby[i] < 10)) {
                int dzie = 0;
                int jed = 0;
                int silnia = 1;
                for (int j = 1; j <= liczby[i]; j++) {
                    silnia *= j;
                }
                dzie = silnia / 10;
                jed = silnia - dzie * 10;
                dzie = dzie % 10;
                System.out.println(dzie + " " + jed);
            } else if (liczby[i] == 1 || liczby[i] == 0) {
                System.out.println(0 + " " + 1);
            } else {
                System.out.println(0 + " " + 0);
            }
        }
    }
}
