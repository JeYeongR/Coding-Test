import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] answer = new int[26];

        Arrays.fill(answer, -1);

        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (answer[charArray[i] - 97] == -1) {
                answer[charArray[i] - 97] = i;
            }
        }

        for (int n : answer) {
            System.out.print(n + " ");
        }
    }
}