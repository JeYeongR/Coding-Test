import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int maxCount = 0;
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            list.add(num);
            int count = map.getOrDefault(num, 0) + 1;
            if (count > maxCount) {
                maxCount = count;
            }
            map.put(num, count);
        }

        StringBuilder sb = new StringBuilder();

        // 산술평균
        int sum = list.stream()
                .mapToInt(i -> i)
                .sum();
        sb.append(Math.round((float) sum / list.size()))
                .append("\n");

        // 중앙값
        list.sort(Comparator.naturalOrder());
        sb.append(list.get(list.size() / 2))
                .append("\n");

        // 최빈값
        List<Integer> tempList = new ArrayList<>();
        for (Integer i : map.keySet()) {
            if (map.get(i) == maxCount) tempList.add(i);
        }
        tempList.sort(Comparator.naturalOrder());
        int mode = tempList.size() > 1 ? tempList.get(1) : tempList.get(0);
        sb.append(mode)
                .append("\n");

        // 범위
        sb.append(list.get(list.size() - 1) - list.get(0))
                .append("\n");

        System.out.println(sb);
    }
}