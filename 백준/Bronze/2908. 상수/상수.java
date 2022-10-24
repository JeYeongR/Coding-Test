import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        String num1S = Integer.toString(num1);
        String num2S = Integer.toString(num2);
        String reverse = "";


        for (int i = num1S.length() - 1; i >= 0; i--) {
            reverse += num1S.charAt(i);
        }
        num1S = reverse;
        reverse = "";

        for (int i = num2S.length() - 1; i >= 0; i--) {
            reverse += num2S.charAt(i);
        }
        num2S = reverse;

        num1 = Integer.parseInt(num1S);
        num2 = Integer.parseInt(num2S);

        if(num1 > num2) {
            System.out.println(num1);
        } else if(num2 > num1){
            System.out.println(num2);
        }
    }
}