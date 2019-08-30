import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Kalkulator {
    public static void main(String[] arg) throws java.lang.Exception {
        BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
        String[] dane = new String[3];
        int i = 0;
        String wynik = "";
        while (i < 3) {
            dane = bR.readLine().split(" ");
            switch (dane[0]) {
                case "+":
                    wynik += String.valueOf(Integer.valueOf(dane[1]) + Integer.valueOf(dane[2]));
                    break;
                case "-":
                    wynik += String.valueOf(Integer.valueOf(dane[1]) - Integer.valueOf(dane[2]));
                    break;
                case "*":
                    wynik += String.valueOf(Integer.valueOf(dane[1]) * Integer.valueOf(dane[2]));
                    break;
                case "/":
                    wynik += String.valueOf(Integer.valueOf(dane[1]) / Integer.valueOf(dane[2]));
                    break;
                case "%":
                    wynik += String.valueOf(Integer.valueOf(dane[1]) % Integer.valueOf(dane[2]));
                    break;
            }
            i++;
            wynik += "\n";
        }
        System.out.println(wynik.trim());
    }
}
