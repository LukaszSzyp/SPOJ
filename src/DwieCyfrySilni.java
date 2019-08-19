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
            if (liczby[i] > 1) {
                int dzie = 0;
                int jed = 0;
                int silnia = 1;
                for (int j = 1; j <= liczby[i]; j++) {
                    silnia *= j;
                }
                dzie = silnia / 10;
                jed = silnia - dzie * 10;
                System.out.println(dzie + " " + jed);
            } else System.out.print(0 + " " + 1);
        }
    }
}
