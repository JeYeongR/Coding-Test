class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        
        for(int i=0; i<wallpaper.length; i++) {
            if(wallpaper[i].contains("#")) {
                answer[0] = i;
                break;
            }
        }
        
        int min = 51;
        for(int i=0; i<wallpaper.length; i++) {
            if(wallpaper[i].contains("#")) {
                int idx = wallpaper[i].indexOf("#");
                min = Math.min(idx, min);
            }
        }
        answer[1] = min;
        
        for(int i=0; i<wallpaper.length; i++) {
            if(wallpaper[i].contains("#")) {
                answer[2] = i + 1;
            }
        }
        
        int max = 0;
        for(int i=0; i<wallpaper.length; i++) {
            int idx = wallpaper[i].lastIndexOf("#");
            max = Math.max(idx, max);
        }
        answer[3] = max + 1;
        
        return answer;
    }
}