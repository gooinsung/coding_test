package insung.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class no_12939 {

    static class Solution {
        public String solution(String str) {
            String answer = "";
            String[] arr = str.split(" ");
            List<Integer> list = Arrays.stream(arr)
                    .map(Integer::parseInt)
                    .sorted()
                    .collect(Collectors.toList());


            System.out.println(list);

            answer=Integer.toString(list.get(0)) + " " + Integer.toString(list.get(list.size()-1));

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String str = "-1 -2 -3 -4";
        System.out.println(solution.solution(str));
    }
}
