import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Suma {
    public static void main(String[] arg) throws java.lang.Exception{
        BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
        int suma=0;
        while (suma>=0) {
            suma += Integer.valueOf(bR.readLine());
            System.out.println(suma);
        }
    }
}
