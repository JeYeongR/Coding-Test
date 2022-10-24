import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String ox;
        int count = 0;
        int sum = 0;

        for(int i=0; i<n; i++) {
            ox = sc.next();
            char[] charArr = ox.toCharArray();
            for(int j=0; j< charArr.length; j++) {
                if(charArr[j]=='O') {
                    count++;
                    sum += count;
                } else if(charArr[j]=='X'){
                    count = 0;
                }
            }
            System.out.println(sum);
            sum = 0;
            count = 0;
        }
    }
}