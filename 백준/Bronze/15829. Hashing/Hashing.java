import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int L = Integer.parseInt(sc.nextLine());
        String str = sc.nextLine();

        long result = 0;
        long pow = 1;
        for (char c : str.toCharArray()) {
            result += ((c - 96) * pow);
            pow = (pow * 31) % 1234567891;
        }

        System.out.println(result % 1234567891);
    }
}
