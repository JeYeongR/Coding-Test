import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int idx = 0;
        for (int i = 0; i < 9; i++) {
            int num = sc.nextInt();
            
            if (num > max) {
                max = num;
                idx = i + 1;
            }
        }

        System.out.println(max);
        System.out.println(idx);
    }
}