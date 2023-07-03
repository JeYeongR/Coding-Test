import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int multiply = A * B * C;
        String value = String.valueOf(multiply);

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <= 9; i++) {
            map.put(i, 0);
        }

        for (int i = 0; i < value.length(); i++) {
            int num = value.charAt(i) - '0';
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int i = 0; i <= 9; i++) {
            System.out.println(map.get(i));
        }
    }
}