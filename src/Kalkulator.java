import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Kalkulator {
    public static void main(String[] arg) throws java.lang.Exception {
        BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
        String[] dane = new String[3];
        int i = 0;
        while (i < 100) {
            dane = bR.readLine().split(" ");
            switch (dane[0]) {
                case "+":
                    System.out.println(Integer.valueOf(dane[1]) + Integer.valueOf(dane[2]));
                    break;
                case "-":
                    System.out.println(Integer.valueOf(dane[1]) - Integer.valueOf(dane[2]));
                    break;
                case "*":
                    System.out.println(Integer.valueOf(dane[1]) * Integer.valueOf(dane[2]));
                    break;
                case "/":
                    System.out.println(Integer.valueOf(dane[1]) / Integer.valueOf(dane[2]));
                    break;
                case "%":
                    System.out.println(Integer.valueOf(dane[1]) % Integer.valueOf(dane[2]));
                    break;
            }
            i++;
        }
    }
}
