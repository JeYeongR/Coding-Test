class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        String[] cache = new String[cacheSize];

        if (cacheSize == 0) return 5 * cities.length;

        int count = cacheSize;
        for (String s : cities) {
            String city = s.toLowerCase();
            boolean hasCity = false;
            for (int j = 0; j < cacheSize; j++) {
                if (cache[j] != null && cache[j].equals(city)) {
                    hasCity = true;
                    answer++;
                    while (j != 0) {
                        cache[j] = cache[j - 1];
                        j--;
                    }
                    cache[count] = city;
                    break;
                }
            }

            if (!hasCity) {
                answer += 5;
                if (count == 0) {
                    for (int j = cacheSize - 1; j > 0; j--) {
                        cache[j] = cache[j - 1];
                    }
                    cache[count] = city;
                } else {
                    count--;
                    cache[count] = city;
                }
            }
        }

        return answer;
    }
}