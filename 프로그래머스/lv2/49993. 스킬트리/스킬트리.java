class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for (String skill_tree : skill_trees) {
            String tempTree = "";
            for (int i = 0; i < skill_tree.length(); i++) {
                String temp = "" + skill_tree.charAt(i);

                if (skill.contains(temp)) tempTree += temp;
            }

            if (skill.indexOf(tempTree) == 0) answer++;
        }

        return answer;
    }
}