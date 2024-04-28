package insung.programers.level_2;

import java.util.HashMap;
import java.util.Map;

public class no_138476 {
    static class Solution {
        public int solution(int k, int[] tangerine) {
            int answer = 0;
            Map<Integer, Integer> map = new HashMap<>();

            for(int a : tangerine){
                map.put(a, map.getOrDefault(a, 0)+1);
            }


            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(6, new int[]{1, 3, 2, 5, 4, 5, 2, 3}));
    }
}
