import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = br.readLine();

            if (str.equals("0")) break;

            String str1;
            String str2;
            if (str.length() % 2 == 0) {
                str1 = str.substring(0, str.length() / 2);
                str2 = new StringBuilder(str.substring(str.length() / 2)).reverse()
                        .toString();
            } else {
                str1 = str.substring(0, str.length() / 2);
                str2 = new StringBuilder(str.substring(str.length() / 2 + 1)).reverse()
                        .toString();
            }

            if (str1.equals(str2)) System.out.println("yes");
            else System.out.println("no");
        }
    }
}