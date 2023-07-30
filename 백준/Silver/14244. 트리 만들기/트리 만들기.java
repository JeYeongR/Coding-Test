import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int leaf = m == 2 ? 1 : 0;
        int temp = 0;
        for (int i = 1; i < n; i++) {
            if (m <= leaf++) System.out.println(temp + " " + i);
            else System.out.println(0 + " " + i);

            temp = i;
        }
    }
}