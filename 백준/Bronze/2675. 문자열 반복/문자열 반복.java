import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        String p = "";


        for (int j = 0; j < t; j++) {

            int r = sc.nextInt();
            String s = sc.next();
            char[] charArr = s.toCharArray();

            for (int k = 0; k < charArr.length; k++) {
                for (int i = 0; i < r; i++) {
                    p += charArr[k];
                }
            }
            System.out.println(p);
            p = "";

        }
    }
}
