package insung.programers.level_2;

public class no_49993 {
    static class Solution {
        public int solution(String skill, String[] skill_trees) {
            int answer = 0;

            for (String tree : skill_trees) {
                String str = "";

                for (int i = 0; i < tree.length(); i++) {
                    char c = tree.charAt(i);
                    if(skill.indexOf(c) != -1){
                        str+=c;
                    }
                }
                if(skill.startsWith(str)) answer++;
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String skill = "CBD";
        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
        System.out.println(solution.solution(skill, skill_trees));
    }
}
