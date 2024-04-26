package insung.programers.level_2;

public class no_12980 {
    static class Solution {
        public int solution(int n) {
            int ans = 0;

            while (n > 0) {
                if (n % 2 == 0) {
                    n = n / 2;
                } else {
                    n = n-1;
                    ans++;
                }
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(5000));
    }
}
