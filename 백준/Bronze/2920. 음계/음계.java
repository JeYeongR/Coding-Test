import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] split = str.split(" ");

        String[] tempDESC = split.clone();
        String[] tempASC = split.clone();
        Arrays.sort(tempDESC, Comparator.reverseOrder());
        Arrays.sort(tempASC, Comparator.naturalOrder());

        if (Arrays.equals(split, tempASC)) {
            System.out.println("ascending");
        } else if (Arrays.equals(split, tempDESC)) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}