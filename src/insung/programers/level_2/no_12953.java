package insung.programers.level_2;

public class no_12953 {
    static class Solution {
        public int solution(int[] arr) {
            int answer = arr[0];
            for (int a : arr) {
                answer = lcm(answer, a);
            }
            return answer;
        }

        public int gcd(int a, int b) {
            if (a % b == 0) return b;
            return gcd(b, a % b);
        }

        public int lcm(int a, int b) {
            return (a * b) / gcd(a, b);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[] {2,6,8,14}));
    }
}
