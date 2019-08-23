import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.*;

public class DodawanieLiczbCalkowitych {
    public static void main(String[] arg) throws java.lang.Exception{
        BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
        int[] dane = new int[3];
        for (int i = 0; i <3 ; i++) {
            dane[i]=Integer.valueOf(bR.readLine());
        }
        System.out.println(dane[0]+dane[1]+dane[2]);
    }
}
