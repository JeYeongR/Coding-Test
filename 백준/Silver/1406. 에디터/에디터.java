import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        LinkedList<Character> linkedList = new LinkedList<>();
        char[] charArray = br.readLine().toCharArray();
        for (char c : charArray) {
            linkedList.add(c);
        }

        ListIterator<Character> iter = linkedList.listIterator();
        while (iter.hasNext()) {
            iter.next();
        }

        int M = Integer.parseInt(br.readLine());
        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if (command.equals("L") && iter.hasPrevious()) iter.previous();

            if (command.equals("D") && iter.hasNext()) iter.next();

            if (command.equals("B") && iter.hasPrevious()) {
                iter.previous();
                iter.remove();
            }

            if (command.equals("P")) iter.add(st.nextToken().charAt(0));
        }

        for (Character character : linkedList) {
            bw.write(character);
        }

        bw.flush();
    }
}