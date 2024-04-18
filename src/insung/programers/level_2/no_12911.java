package insung.programers.level_2;

public class no_12911 {
    static class Solution {
        public int solution(int n) {

            int nCount = Integer.bitCount(n);

            int i = n+1;
            while (true) {
                if(nCount == Integer.bitCount(i)) break;

                i++;
            }
            return i;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(15));

    }
}
