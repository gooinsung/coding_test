package insung.programers.level_2;

import java.util.HashSet;
import java.util.Set;

public class no_131701 {
    static class Solution {
        public int solution(int[] elements) {
            int[] arr = new int[elements.length * 2];

            for (int i = 0; i < elements.length; i++) {
                arr[i] = elements[i];
                arr[i + elements.length] = elements[i];
            }

            Set<Integer> sumList = new HashSet<>();

            for (int i = 0; i < elements.length; i++) {
                int sum = 0;

                for (int j = 1; j <= elements.length; j++) {
                    sum+= arr[i + j -1];
                    sumList.add(sum);
                }
            }

            return sumList.size();
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new int[]{7, 9, 1, 1, 4}));
    }
}
