class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        for (int i = 0; i < park.length; i++) {
            if (park[i].contains("S")) {
                answer[0] = i;
                answer[1] = park[i].indexOf("S");
            }
        }

        for (String route : routes) {
            String way = route.split(" ")[0];
            int length = Integer.parseInt(route.split(" ")[1]);

            int nx = answer[1];
            int ny = answer[0];

            for (int i = 0; i < length; i++) {
                if (way.equals("E")) {
                    nx++;
                }
                if (way.equals("W")) {
                    nx--;
                }
                if (way.equals("S")) {
                    ny++;
                }
                if (way.equals("N")) {
                    ny--;
                }
                if (nx >= 0 && ny >= 0 && ny < park.length && nx < park[0].length()) {
                    if (park[ny].charAt(nx) == 'X') {
                        break;
                    }
                    
                    if (i == length - 1) {
                        answer[1] = nx;
                        answer[0] = ny;
                    }
                }
            }
        }

        return answer;
    }
}