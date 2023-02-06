import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = br.readLine().split(" ");
        int H = Integer.parseInt(strs[0]);
        int M = Integer.parseInt(strs[1]);

        if(M<45&&H>0) {
            System.out.println((H-1)+ " " +(M+15));
        } else if(M<45&&H==0) {
            System.out.println((H+23)+ " " +(M+15));
        } else {
            System.out.println(H+ " " +(M-45));
        }
    }
}