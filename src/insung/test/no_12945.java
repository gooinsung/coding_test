package insung.test;

public class no_12945 {
    static class Solution {
        public int solution(int n) {
            int answer = 0;

            if (n == 2) return 1;

            int prevPrev = 1;
            int prev = 1;

            for (int i = 3; i <= n; i++) {
                answer = prev + prevPrev;
                prevPrev = prev;
                prev = answer%1234567;
            }

            return answer%1234567;
        }

        public int pibonachi(int num){
            if(num == 1) return 1;
            if(num == 2) return 1;
            return pibonachi(num-1) + pibonachi(num-2);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.pibonachi(3));
    }
}
