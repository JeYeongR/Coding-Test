import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            StringTokenizer st = new StringTokenizer(in.nextLine());
            int[] arr = new int[3];
            for (int i = 0; i < 3; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0) break;

            Arrays.sort(arr);

            double powNum1 = Math.pow(arr[0], 2);
            double powNum2 = Math.pow(arr[1], 2);
            double powNum3 = Math.pow(arr[2], 2);

            if (powNum3 == powNum1 + powNum2) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}