package insung.programers.review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test_2 {
    static class Solution {
        public int[] solution(int[] arr, int divisor) {
            Arrays.sort(arr);

            List<Integer> list = new ArrayList<>();
            for(int a : arr){
                if(a%divisor == 0) list.add(a);
            }

            return list.size() == 0 ? new int[]{-1} : list.stream().mapToInt(i->i).toArray();
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();


    }
}
