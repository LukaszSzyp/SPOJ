import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pesel {
    public static void main(String[] arg) throws java.lang.Exception {
        BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(bR.readLine());
        char[] wynik = new char[n];
        for (int i = 0; i < n ; i++) {
            char[] dane = bR.readLine().toCharArray();
            int suma =0;
            suma += Integer.valueOf(dane[0])*1;
            suma += Integer.valueOf(dane[1])*3;
            suma += Integer.valueOf(dane[2])*7;
            suma += Integer.valueOf(dane[3])*9;
            suma += Integer.valueOf(dane[4])*1;
            suma += Integer.valueOf(dane[5])*3;
            suma += Integer.valueOf(dane[6])*7;
            suma += Integer.valueOf(dane[7])*9;
            suma += Integer.valueOf(dane[8])*1;
            suma += Integer.valueOf(dane[9])*3;
            suma += Integer.valueOf(dane[10])*1;
            if (suma%10==0){
                wynik[i]='D';
            }
            else {
                wynik[i]='N';
            }
        }
        for (char i:wynik) {
            System.out.println(i);
        }

    }
}
