import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Polowa {
    public static void main(String[] arg) throws java.lang.Exception {
        BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(bR.readLine());
        String[] result = new String[n];
        for (int i = 0; i <n ; i++) {
            String text = bR.readLine();
            String text2 ="";
            for (int j = 0; j <text.length()/2 ; j++) {
                text2+=text.charAt(j);
            }
            result[i]=text2;
        }
        for (String i:result) {
            System.out.println(i);
        }
    }
}
