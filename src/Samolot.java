import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.*;

public class Samolot {
    public static void main(String[] arg) throws java.lang.Exception {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
            String[] dane = scan.readLine().split(" ");
            System.out.println(Integer.valueOf(dane[0])*Integer.valueOf(dane[1])+Integer.valueOf(dane[2])*Integer.valueOf(dane[3]));
    }
}
