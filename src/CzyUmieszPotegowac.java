import java.util.Scanner;

public class CzyUmieszPotegowac {

    public static void czyUmieszPotegowac() {
        int[][] cyfry = {{0, 0, 0, 0}, {1, 1, 1, 1}, {2, 4, 8, 6}, {3, 9, 7, 1}, {4, 6, 4, 6}, {5, 5, 5, 5}, {6, 6, 6, 6}, {7, 9, 3, 1}, {8, 4, 2, 6}, {9, 1, 9, 1}};
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] wynik = new int[n];
        for (int i = 0; i < n; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            a = a % 10;
            b = b % 4 - 1;
            wynik[i] = cyfry[a][b];
        }
        for (int i : wynik) {
            System.out.println(i);
        }
    }
}
