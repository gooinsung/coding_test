package insung.programers.level_2;

public class no_12985 {
    static class Solution {
        public int solution(int n, int a, int b) {
            int answer = 0;

            while (n != 1){
                answer++;
                if(a == b) break;

                a = (a+1) / 2;
                b = (b+1) / 2;

                n = n / 2;
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(8, 4, 7));
    }
}
