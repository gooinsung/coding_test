package insung.programers.level_2;


public class no_43165_1 {
    static class Solution {
        public int solution(int n, int k) {
            int answer = 0;
            String str = Integer.toString(n,k);

            for(String s : str.split("0")){
                if(!s.isEmpty() && isPrime(Long.parseLong(s))) answer++;
            }
            return answer;
        }

        public boolean isPrime(long num) {
            if (num <= 1) return false; // 1 이하는 소수가 아님
            if (num == 2) return true; // 2는 소수
            if (num % 2 == 0) return false; // 짝수는 소수가 아님
            for (long i = 3; i * i <= num; i += 2) {
                if (num % i == 0) return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int n = 110011;
        int k = 10;

        solution.solution(n, k);
    }
}
