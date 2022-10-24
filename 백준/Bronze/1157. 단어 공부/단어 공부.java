import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        String en = sc.next();
        en = en.toUpperCase();
        int[] asc = new int[26]; // A-Z

        for (int i = 0; i < en.length(); i++) {
            asc[en.charAt(i)-65]++;
        }

        int max = 0;
        char al = ' ';
        int maxLast = 0;
        
        for(int i=0; i<26; i++) {
            if(asc[i]>max) {
                max = asc[i];
                al = (char)(i+65);
                maxLast = 1;
            } else if(asc[i]==max && maxLast!=0) {
                al = '?';
            }
        }
        
        System.out.println(al);
    }
}