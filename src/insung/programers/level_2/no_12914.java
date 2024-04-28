package insung.programers.level_2;

public class no_12914 {
    static class Solution {
        public long solution(int n) {
            if(n == 1) return 1;
            if(n == 2) return 2;

            long[] l = new long[n+1];

            l[1] = 1;
            l[2] = 2;

            for(int i = 3; i <= n; i++){
                l[i] = (l[i-2] + l[i-1]) % 1234567;
            }

            return l[n];
        }

/*        public long solution(int n) {
            if(n == 1) return 1;
            if(n == 2) return 2;


            return test(n)%1234567;
        }

        public int test(int n){
            if(n == 1) return 1;
            if(n == 2) return 2;
            return test(n-2)+test(n-1);
        }*/
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(4));
    }
}
