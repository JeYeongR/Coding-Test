import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int count = 0;
        int a;
        int b;
        int c = N;
        int sum = -1;


        while (sum != N) {
            if (c >= 10) {
                a = c / 10;
                b = c % 10;
            } else {
                a = 0;
                b = c;
            }
            count++;
            sum = (b * 10) + (a + b)%10;
            c = sum;
        }

        System.out.println(count);
    }
}