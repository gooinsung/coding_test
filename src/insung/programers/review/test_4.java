package insung.programers.review;

import java.util.ArrayList;
import java.util.List;

public class test_4 {
    static class Solution {
        public int[] solution(int[] arr) {
            if(arr.length == 1) return new int[]{-1};
            int[] answer = new int[arr.length - 1];


            int min = Integer.MAX_VALUE;

            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                min = Math.min(min,arr[i]);
            }

            for(int i = 0 ; i < arr.length; i++){
                if(arr[i] != min) list.add(arr[i]);
            }

            return list.stream().mapToInt(i->i).toArray();
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(new int[]{4, 3, 2, 1});
    }
}
