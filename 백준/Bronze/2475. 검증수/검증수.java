import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] split = str.split(" ");

        int sum = 0;
        for (String s : split) {
            sum += Math.pow(Integer.parseInt(s), 2);
        }

        System.out.println(sum % 10);
    }
}