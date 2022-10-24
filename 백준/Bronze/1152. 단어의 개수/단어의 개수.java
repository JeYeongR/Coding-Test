import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        s = s.trim();
        String[] sSplit = s.split(" ");
        int count = 0;

        for (int i = 0; i < sSplit.length; i++) {
            if (!sSplit[0].isBlank()) {
                count++;
            }
        }

        System.out.println(count);
    }
}
