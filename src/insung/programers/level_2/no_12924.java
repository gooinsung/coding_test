package insung.programers.level_2;

public class no_12924 {

    static class Solution {
        public int solution(int n) {
            int answer = 1;

            for (int i = 1; i < n; i++) {
                int num = i;
                for (int j = i+1; j < n; j++) {
                    num+=j;

                    if(num == n){
                        answer++;
                        break;
                    }else if(num > n){
                        break;
                    }
                }
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(15));
    }
}
